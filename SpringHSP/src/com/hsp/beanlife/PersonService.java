package com.hsp.beanlife;

public class PersonService {

		private String name;
		
		public PersonService() {
			System.out.println("PersonService����");
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			System.out.println("setName(String name)����");
			this.name = name;
		}
		
		public void sayHi() {
			System.out.println("hi " + name);
		}
		
		//�÷������Ը�arg0��ʾ���ڱ�ʵ������bean id
		public void setBeanName(String arg0) {
			System.out.println("setBeanName������" + arg0);
		}
}
