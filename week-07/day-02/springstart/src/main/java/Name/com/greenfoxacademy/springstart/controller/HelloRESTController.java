package Name.com.greenfoxacademy.springstart.controller;

import Name.com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

   AtomicLong count = new AtomicLong(0);

    @RequestMapping(value="/greeting")
    public Greeting greeting(@RequestParam String name){

        Greeting message = new Greeting(count.incrementAndGet(),"Hello, ", name);
        return message;
    }
}

/*    CTRL SHIFT F9 to recompile
@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting")
    public Greeting greeting(@RequestParam String name){

        Greeting mess = new Greeting(01,"Hello ", name);
        return mess;
    }
}
*/
