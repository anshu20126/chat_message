package com.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketDemoApplication {
    private static final Logger logger = LoggerFactory.getLogger(WebsocketDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebsocketDemoApplication.class, args);
        logger.info("Server has been started at port number 8080 ! Happy Anil Anshu");
    }
}
