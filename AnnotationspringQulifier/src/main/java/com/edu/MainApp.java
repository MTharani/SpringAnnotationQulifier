package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		Moto m=ctx.getBean(Moto.class);
		m.mobileFun();

	}

}
