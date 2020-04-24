package com.huawei.hereyouare.ch1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// restcontroller 和 controller 有什么区别
@RestController
public class RootController {

    //这个requestMapping打在哪个方法上， 就映射到哪个上下文， 比如此处就是根目录
    @RequestMapping("/")
    public String index() {
        return "[/] Greetings from Spring Boot!";
    }
}
