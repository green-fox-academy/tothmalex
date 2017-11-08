package com.greenfox.frontend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.frontend.FrontendApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FrontendApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class FrontendApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(),
			Charset.forName("utf8"));

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testDoubling() throws Exception {
		mockMvc.perform(get("/doubling?input=5"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.result", is(10)))
				.andExpect(jsonPath("$.received", is(5)));
	}

	@Test
	public void testGreeter() throws Exception {
		mockMvc.perform(get("/greeter?name=Alex&title=student"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.welcome_message", is("Oh, hi there Alex, my dear student!")));
	}

	@Test
	public void greetingTest() throws Exception {
		mockMvc.perform(get("/greeter?name=Alex"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.error", is("Please provide a title!")));
	}

	@Test
	public void greetingTestNoName() throws Exception {
		mockMvc.perform(get("/greeter?title=name"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.error", is("Please provide a name!")));
	}

	@Test
	public void testAppending() throws Exception {
		mockMvc.perform(get("/appenda/kuty"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.appended", is("kutya")));
	}

	@Test
	public void testDoUntil() throws Exception {
		mockMvc.perform(post("/dountil/sum")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"until\": 5}"))

				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.result", is(15)));
	}
}