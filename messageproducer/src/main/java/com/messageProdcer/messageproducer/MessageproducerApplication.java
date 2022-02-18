package com.messageProdcer.messageproducer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MessageproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageproducerApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate (){
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		return restTemplate;

	}


//	@Bean
//	CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate){
//		return args ->{
////		for(int i=0;i<100;i++){
//			kafkaTemplate.send("eclecticsUsers","how are you feeling about our" +
//					"customer experience at eclectics jamaaaaaaaa" );
////		}
//		};
//	}

}
