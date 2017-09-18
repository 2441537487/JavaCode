package cc.wei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cc.wei.service.UserService;
import cc.wei.vo.Role;

public class SpringDemo {
	public static void main(String[] args) {
		//��ȡ�����ļ�����������
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//���ݱ�ʶ����ȡ����
		UserService userService = (UserService) ac.getBean("userService");
		userService.save();
	}
}
