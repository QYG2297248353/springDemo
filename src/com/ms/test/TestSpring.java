package com.ms.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ms.service.CategoryService;
import com.ms.service.ProductService;
import com.ms.spring.Category;
import com.ms.spring.Product;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml"}
				);
		
//		IOC 反转控制
		Category c= (Category) context.getBean("c");
		System.out.println(c.getName());
		System.out.println("-----------------------");
		
		Product p=(Product) context.getBean("p");
		System.out.println(p.getName());
		System.out.println(p.getCategory().getName());
		
//		AOP日志测试
		CategoryService cs=(CategoryService) context.getBean("cs");
		ProductService ps=(ProductService) context.getBean("ps");
		cs.doSomeService();
		ps.doSomeService();
		
	}
}
