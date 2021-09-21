package com.example.rest_api_calls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    /**
     * Purpuse : Once the request mapping takes place in the server, the sayHello() is called and the output message is
     displayed as output.
     * @return
     */

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
