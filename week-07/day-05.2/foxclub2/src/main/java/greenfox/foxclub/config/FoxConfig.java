package greenfox.foxclub.config;

import greenfox.foxclub.model.Fox;
import greenfox.foxclub.model.Trick;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FoxConfig {
    @Bean
    public Trick trick() {
        return new Trick();
    }

    @Bean
    public Fox fox() {
        List<String> trekks = new ArrayList<>();
        trekks.add("extensive knowledge of italian neoralist cinema");
        return new Fox("Mr.Green",trekks, "pizza", "green tea");
    }
}