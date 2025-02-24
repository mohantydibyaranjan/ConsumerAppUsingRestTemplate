package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
//@Component
public class WishMessaGeneratorConsumer implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		RestTemplate template=new RestTemplate();
		String baseUrl="http://localhost:8085/msg";
		
		
		ResponseEntity<String> entity=template.getForEntity(baseUrl, String.class);
		System.out.println("output is "+entity.getBody());
		System.out.println("Status code is "+entity.getStatusCodeValue());
		System.out.println("status code is "+entity.getStatusCode());
		
		System.exit(0);
		
	}

}
