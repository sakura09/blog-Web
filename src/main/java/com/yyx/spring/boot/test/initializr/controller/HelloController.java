package com.yyx.spring.boot.test.initializr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *hello 控制器
 */

@RestController         //方便处理Response请求
public class HelloController {
    @RequestMapping("/hello")     //路径的映射
    public String hello(){
        return "Hello world!";
    }
}
