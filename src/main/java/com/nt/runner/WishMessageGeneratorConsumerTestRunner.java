package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
//@Component
public class WishMessageGeneratorConsumerTestRunner  implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
	RestTemplate rst=new RestTemplate();
	String baseUrl="http://localhost:9090/wish1/101/roshan";
	
	
	ResponseEntity<String> forEntity = rst.getForEntity(baseUrl, String.class, 101,"roshan");
	
	System.out.println("output is "+forEntity.getBody());
	System.out.println("Status code is "+forEntity.getStatusCodeValue());
	System.out.println("Status code is "+forEntity.getStatusCode());
	
	System.out.println("........................................");
	String forObject = rst.getForObject(baseUrl, String.class,101,"Roshan");
	System.out.println("output is "+forObject);
	System.exit(0);
	
	}

}
