package com.huawei.hereyouare.ch1.config;


import com.huawei.hereyouare.ch1.bean.Person6;
import com.huawei.hereyouare.ch1.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件
 * 在配置文件中用<bean><bean/>标签添加组件
 */
@Configuration
public class MyAppConfig {
    //将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了...");
        return new HelloService();
    }

    @Bean
    public Person6 person6(){
        System.out.println("配置类@Bean给容器中添加组件了...");
        Person6 p6 = new Person6 ();
        p6.setLastName("王五");
        p6.setAge(35);
        return p6;
    }
}