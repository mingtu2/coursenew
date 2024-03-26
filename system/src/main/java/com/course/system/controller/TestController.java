package com.course.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingtu
 * @create 2024-03-26 15:51
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("system test...");
        return "success";
    }
}
