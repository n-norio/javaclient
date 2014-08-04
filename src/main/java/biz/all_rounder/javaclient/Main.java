package biz.all_rounder.javaclient;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import biz.all_rounder.javaclient.sample.SampleService;

@Configuration
@ComponentScan
@EnableJpaRepositories
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(Main.class);
		SampleService service = context.getBean(SampleService.class);
		service.insertTestData();
		service.findSample();
		context.close();
	}

}
