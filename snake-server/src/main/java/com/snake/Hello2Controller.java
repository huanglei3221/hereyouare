package com.snake;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 用这个官网的controller 是完全OK的。
// 貌似这个requestmapping 写到上面就访问不到了
@RestController
//@RequestMapping("/hello2")
public class Hello2Controller {
    @RequestMapping("/hello2")
    public String index() {
        return "[/hello2] hello!!!";
    }

    @RequestMapping("/success")
    public String success()
    {
        // classpath:/templates/success.html
        return "success";
    }

}
