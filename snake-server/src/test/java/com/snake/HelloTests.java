package com.snake;

import com.snake.bean.Person;
import com.snake.bean.Person2;
import com.snake.bean.Person3;
import com.snake.bean.Person4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTests {
	@Autowired
	Person person;

	@Autowired
	Person2 person2;

	@Autowired
	Person3 person3;

	// 可以看到， 用autowired 进行标注之后， 可以自动装填到ioc容器中
	// 对象名就是IOC当中的id
	// res = ioc.containsBean("person4"); 将会返回true
	@Autowired
	Person4 person4;

	@Autowired
	ApplicationContext ioc;

	private MockMvc mvc;

	@Test
	public void getHello() throws Exception {
		System.out.println("person:" + person);
		System.out.println("person2:" + person2);
		System.out.println("person3:" + person3);
		System.out.println("person4:" + person4);

		boolean res;
		res = ioc.containsBean("Person4");
		System.out.println("Contain Person4:" + res);
		res = ioc.containsBean("person4");
		System.out.println("Contain person4:" + res);

		res = ioc.containsBean("Person5");
		System.out.println("Contain person5:" + res);
		res = ioc.containsBean("helloService");
		System.out.println("Contain helloService:" + res);		;

		System.out.println("person6:" + ioc.getBean("person6"));
	}



	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void contextLoads() {
	//System.out.println();
	//日志的级别；
	//由低到高 trace<debug<info<warn<error
	//可以调整输出的日志级别；日志就只会在这个级别以以后的高级别生效
		logger.trace("这是trace日志...");
		logger.debug("这是debug日志...");
	//SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root 级别
		logger.info("这是info日志...");
		logger.warn("这是warn日志...");
		logger.error("这是error日志...");
	}

}

