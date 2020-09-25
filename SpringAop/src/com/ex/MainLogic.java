package com.ex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("spring.xml");
		BeanFactory f=new XmlBeanFactory(res);
		Hdfc hf=(Hdfc)f.getBean("pfb");	
		hf.withdraw();
		hf.deposit();

	}

}
