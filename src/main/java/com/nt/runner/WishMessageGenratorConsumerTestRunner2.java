package com.nt.runner;



import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class WishMessageGenratorConsumerTestRunner2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		RestTemplate template=new RestTemplate();
		String urlBase="http://localhost:9090/report";
		
		//invoke API Operation
		ResponseEntity<String> res=template.getForEntity(urlBase, String.class);
		
		
		
		
		
		
		System.out.println("output is "+res.getBody());
		System.out.println("output is "+res.getStatusCodeValue());
		System.out.println("out put is "+res.getStatusCode());
		System.out.println("..................................");
		
		String forObject = template.getForObject(urlBase, String.class);
		System.out.println("out put is "+forObject);
		System.exit(0);
		System.out.println(".......................");
	}

}
