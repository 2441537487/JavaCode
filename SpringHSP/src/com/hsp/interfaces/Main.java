package com.hsp.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/interfaces/beans.xml");
		//��ȡ����,���ýӿ�
		//UpperLetter changeLetter = (UpperLetter) ac.getBean("changeLetter");
		//System.out.println(changeLetter.change());
		//ʹ�ýӿ�������bean
		ChangeLetter changeLetter = (ChangeLetter) ac.getBean("changeLetter");
		System.out.println(changeLetter.change());
	}

}
