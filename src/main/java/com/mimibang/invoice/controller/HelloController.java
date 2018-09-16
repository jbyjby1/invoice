package com.mimibang.invoice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jby on 2018/3/17.
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/world")
    public String hello(){
        return "hello world";
    }
}
