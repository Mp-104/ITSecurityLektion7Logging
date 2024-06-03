package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private static final Logger logger = LoggerFactory.getLogger(MyComponent.class);

    public int divide (int a, int b) {


        int toReturn = 0;
        try {

            toReturn = a / b;
            logger.info("Division av " + a + " / " + b + " = " + toReturn);

        } catch (Exception e) {
            logger.error("Dividera med 0 ", e);
            throw new RuntimeException(e);
        }


        return toReturn;
    }

    public int multiply (int a, int b) {

        logger.info("multiplied " + a + " with " + b);

        return a*b;

    }
}
