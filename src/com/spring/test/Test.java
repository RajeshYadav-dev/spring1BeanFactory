package com.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.spring.model.Message;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Object  bean = factory.getBean("msg");
		if(bean != null) {
			Message msg = (Message)bean;
			System.out.println(msg.getMesgId());
			System.out.println(msg.getMessage());
		}
		System.out.println("*****Directly Entity class****");
		Message msg = factory.getBean("msg", Message.class);
		System.out.println(msg.getMesgId());
		System.out.println(msg.getMessage());
	}
}
