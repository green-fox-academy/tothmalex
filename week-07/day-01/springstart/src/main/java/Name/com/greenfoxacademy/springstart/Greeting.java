package Name.com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    long id;
    String content;
    String name;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Greeting(long id, String content, String name) {
        this.id = id;
        this.content = content + name + "!";
    }
}
