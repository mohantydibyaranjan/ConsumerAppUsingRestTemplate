package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
//@Component
public class WishMessageGenratorConsumerTestRunner1 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		RestTemplate template=new RestTemplate();
		String urlBase="http://localhost:9090/register";
		String jsonBody = "{\"id\":101,\"name\":\"Roshan\",\"address\":\"hyd\",\"salary\":78000.00}";

		org.springframework.http.HttpHeaders headers=new org.springframework.http.HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> request=new HttpEntity<String>(jsonBody,headers);
		ResponseEntity<String> res=template.postForEntity(urlBase, request, String.class);
		
		System.out.println("output is "+res.getBody());
		System.out.println("output is "+res.getStatusCodeValue());
		System.out.println("out put is "+res.getStatusCode());
		System.out.println("..................................");
		
		String forObject = template.postForObject(urlBase, request,String.class);
		System.out.println("out put is "+forObject);
		System.exit(0);
		System.out.println(".......................");
	}

}
