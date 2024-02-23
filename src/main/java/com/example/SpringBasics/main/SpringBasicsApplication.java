package com.example.SpringBasics.main;

import com.example.SpringBasics.config.ProjectConfig;
import com.example.SpringBasics.objects.Parrot;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {

	var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Parrot parrot = context.getBean(Parrot.class);
		System.out.println(parrot.getName());

		String s = context.getBean(String.class);
		System.out.println(s);

		Integer n = context.getBean(Integer.class);
		System.out.println(n);

	}

}
