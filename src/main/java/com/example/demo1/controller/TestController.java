package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @Description
 * @Author xianfeihu
 * @Date 2023/3/21 0021 9:54
 **/
@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping(value = "/test")
    public String test() {
        return "hello demo";
    }

    @GetMapping(value = "/test1")
    public String test1() {
        return "hello demo1";
    }
}
