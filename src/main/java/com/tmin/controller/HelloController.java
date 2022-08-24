package com.tmin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Description
 * @Author TM
 * @Date 2022/8/24 23:04
 */
@RestController
public class HelloController {

    @GetMapping("sayHello")
    public String sayHello(){
        return "say Hello";
    }
}
