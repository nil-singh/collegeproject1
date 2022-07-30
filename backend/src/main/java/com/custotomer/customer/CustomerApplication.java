package com.custotomer.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@SpringBootApplication
@EnableWebMvc
public class CustomerApplication extends WebMvcConfigurerAdapter {

	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
		System.out.println("customer");
	}
	@Override // this method to avoid cors policy
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		List<Customerentity> cust1=service.getCustomer();
//		for(Customerentity temp:cust1) {
//			System.out.println(temp);
//			System.out.println("found");
//		}
//		Customerentity enti=Customerentity.builder().id(1).name("vishwa").mblno("9945").email("vishwa@").build();
//		
//		service.addCustomer(enti);
//	
//	}

}
