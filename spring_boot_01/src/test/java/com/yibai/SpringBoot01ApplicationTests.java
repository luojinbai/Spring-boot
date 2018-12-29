package com.yibai;

import com.yibai.bean.Person;
import com.yibai.config.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01ApplicationTests {

	@Autowired
	private Person person;

	@Autowired
	private HelloService helloService;

	@Test
	public void contextLoads() {
		System.out.println(person);
		System.out.println(helloService.sayHello("yibai"));
	}

}

