package com.greenfox.webcontroller.model;

        import lombok.AllArgsConstructor;
        import lombok.Getter;

@AllArgsConstructor
public class Greeting {

    @Getter
    private long id;
    @Getter
    private String content;

}