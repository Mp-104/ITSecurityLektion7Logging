package com.example.logging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    MyComponent component;

    public MyController (MyComponent component) {
        this.component = component;
    }

    @GetMapping("/divide")
    public String divide (@RequestParam int a, @RequestParam int b) throws Exception {

        int result = 0;
        try {
            result = component.divide(a,b);
        } catch (Exception e) {
            return "39909";
            //throw new RuntimeException(e);

        }

        return String.valueOf(result);

    }

    @GetMapping("/multiply")
    public int multiply (@RequestParam int a, @RequestParam int b) {

        return component.multiply(a,b);

    }

}
