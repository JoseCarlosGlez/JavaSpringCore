package com.mdf.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empleados {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.context.xml");

		IEmpleado secretario = ctx.getBean("Secretario", IEmpleado.class);
		IEmpleado director = ctx.getBean("Director", IEmpleado.class);

		System.out.println("Director->>> " + director.getInforme());
		System.out.println("Secretario->>>> " + secretario.getInforme());

		ctx.close();

	}

}
