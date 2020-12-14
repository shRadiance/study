package com.radiance.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorld {@link RestController} 实现
 * @author sunhao
 * @date 2020/9/2 14:14
 * @Description:
 */
@RestController
public class HelloWorldRestController {

    @GetMapping(value = "/hello-world")
    public String helloWorld(@RequestParam(required = false) String message) {
        return "Hello,World!" + message;
    }

}
