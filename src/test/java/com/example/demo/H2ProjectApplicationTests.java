package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class H2ProjectApplicationTests {

	@Autowired
	private AccountService accountService;
	
	@Test
	public void contextLoads() {
		Assert.assertNotNull(accountService);
		accountService.getData();
	}

}
