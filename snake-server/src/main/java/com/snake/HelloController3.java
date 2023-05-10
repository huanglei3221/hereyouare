package com.snake;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController3 {
    // 下面这个注解把hello返回给浏览器
    @ResponseBody
    @RequestMapping("/hello3")
    public String hello(){
        return "Hello World 33333!";
    }
}
