package cc.wei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cc.wei.vo.User;

public class SpringDemo {
	public static void main(String[] args) {
		//��ȡ�����ļ�����������
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//���ݱ�ʶ����ȡ����
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
}
