package com.xpit.springbootcli.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // 读取自定义属性
    @Value("${my.name}")
    private String name;
    @Value("${my.address}")
    private String address;

    @GetMapping("/hello")
    public String hello() {
        return "姓名：" + name + "地址：" + address;
    }
}
