package com.klu.springmvc;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final Environment environment;

    public OrderController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/display")
    public String display() {
        return "Order Service is running on port "
                + environment.getProperty("local.server.port");
    }
}