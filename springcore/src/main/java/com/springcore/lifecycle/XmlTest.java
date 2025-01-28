package com.springcore.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		context.registerShutdownHook();
		Pizza p = (Pizza) context.getBean("pizza");
		System.out.println(p);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++=");
		Pepsi p1 = (Pepsi) context.getBean("pep");
		System.out.println(p1);
	}

}
