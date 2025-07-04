package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    static {
        System.out.println("UserController loaded by classloader!");
    }

    @RequestMapping("/user/test.do")
    @ResponseBody
    public String test() {
        System.out.println("test controller called");
        return "ok";
    }
    
    // 添加一个简单的测试映射
    @RequestMapping("/test.do")
    @ResponseBody
    public String simpleTest() {
        System.out.println("simple test controller called");
        return "simple test ok";
    }
}