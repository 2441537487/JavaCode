package com.test;

import com.service.UserService;
import com.util.ApplicationContextUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		������ʹ�ô�ͳ�ķ�����������UserService��sayHello()����
//		UserService userService = new UserService();
//		userService.setName("����");
//		userService.sayHello();
		
		//����������ʹ��spring��������������
		//1.�õ�spring��applicationContext������������
		//ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//UserService us = (UserService) ac.getBean("userService");
		//us.sayHello();
		((UserService)ApplicationContextUtil.getApplicationContext().getBean("userService")).sayHello();
		
		
		//��ac[����applicationContext����]��
		//ByeService byeService = (ByeService) ac.getBean("bybService");
		//byeService.sayBye();
	}

}
