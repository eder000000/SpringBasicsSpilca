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
		System.out.println(parrot);
		System.out.println(parrot.getName());

	}

}
