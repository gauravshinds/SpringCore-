package com.springcore.stereotype.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/collections/SteCollectionconfig.xml");
		
		Student st = context.getBean("ob", Student.class);
		System.out.println(st);
		
		System.out.println("______________________________________________________________________");
		
		System.out.println(st.getAddress());
		System.out.println(st.getAddress().getClass().getName());
		
		
		/*
		 * singleton is used to configure bean - Singletone means 1 object every time spring container create same object
		 * prototype mean every time spring container will create seperate object.
		 * 
		 * 
		 * singleton can be achieve by using 
		 * - xml file
		 * - Annotation-  you can add type in the @component
		 * 
		 */

	}

}
