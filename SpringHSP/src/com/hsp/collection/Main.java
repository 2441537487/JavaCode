package com.hsp.collection;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/collection/beans.xml");
		Department department = (Department) ac.getBean("department");
		System.out.println(department.getName());
		for(String emName : department.getEmpName()) {
			System.out.println(emName);
		}
		
		System.out.println("*******ͨ��list����ȡ������******");
		for(Employee e : department.getEmpList()) {
			System.out.println("name=" + e.getName() + " " + e.getId());
		}
		
		System.out.println("*******ͨ��set����ȡ������******");
		for(Employee e : department.getEmpSets()) {
			System.out.println("name=" + e.getName() + " " + e.getId());
		}
		
		System.out.println("*******ͨ��map����ȡ������******");
		for(Entry<String,Employee> entry1 : department.getEmpMaps().entrySet()) {
			System.out.println(entry1.getKey() + " " + entry1.getValue().getName());
		}
	}
}
