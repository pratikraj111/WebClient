package com.pratikit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pratikit.service.QuoteService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run= SpringApplication.run(Application.class, args);
		
		QuoteService bean=run.getBean(QuoteService.class);
		bean.getQuoteV2();
	}
}
