package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class CoExampleTest {
	@Test
	void contextLoads() {
	}
	@Autowired
	private CoExample coExample;
	@Autowired
	private Williamout Williamout;

	@Test
	public void getName(){
		System.out.println(coExample.getAddress());
		System.out.println(coExample.getAge());
		System.out.println(coExample.getName());

		System.out.println(Williamout.getSex());
		System.out.println(Williamout.getName1());

	}

}
