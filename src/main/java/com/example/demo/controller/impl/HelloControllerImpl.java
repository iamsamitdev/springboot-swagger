package com.example.demo.controller.impl;

import com.example.demo.resp.HelloResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
@Slf4j
public class HelloControllerImpl implements HelloController {
    @GetMapping("/sayhello")
    public HelloResponse sayHello(){
        log.info("sayHello(-) started new update");
        return new HelloResponse("welcome to hello world webook update");
    }

}
