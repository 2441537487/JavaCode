package com.spring.demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.demo1.service.AccountService;

/*
 * 转账案例的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDemo1 {
	
	//测试业务层的类
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void test() {
		accountService.transfer("aaa", "bbb", 200d);
	}
}
