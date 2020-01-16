package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jieliu
 * @title: HelloController
 * @description:
 * @date: 2020-01-15 15:33
 **/
@RestController
@RequestMapping("test")
@RefreshScope
public class HelloController {

    @Value("${con}")
    private String con;

    @GetMapping("getValue")
    public String getValue() {
        return con;
    }
}
