package com.radiance.spring.webmvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * {@link HelloWorldController} 通知
 * @author sunhao
 * @date 2020/7/30 23:09
 * @Description:
 */
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {

    @ModelAttribute("acceptLanguage")
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage){
        return acceptLanguage;
    }

    @ModelAttribute("jsessionId")
    public String jsessionId(@CookieValue("JSESSIONID") String jsessionId){
        return jsessionId;
    }

    @ModelAttribute("message")
    public String message(){
        return "Hello,World";
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> onException(Throwable throwable) {
        return ResponseEntity.ok(throwable.getMessage());
    }

}
