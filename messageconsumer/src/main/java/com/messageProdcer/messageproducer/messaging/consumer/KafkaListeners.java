package com.messageProdcer.messageproducer.messaging.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;

@Component
public class KafkaListeners {


    private ObjectMapper objectMapper;
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    public KafkaListeners(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @KafkaListener(topics="eclecticsUsers",groupId = "groupId")
    void listener(String message){
        try{
            KafkaMessage kafkaMessage = objectMapper.readValue(message,KafkaMessage.class);
            HttpEntity<KafkaMessage> request = new HttpEntity<>(kafkaMessage);
            restTemplate.postForObject("https://testgateway.ekenya.co.ke:8443/ServiceLayer/pgsms/send", request, KafkaMessage.class);



            System.out.println(kafkaMessage);

        } catch  (Exception e){
            System.out.println("error "+ e);

        }

        System.out.println("listener recieved: " + message);

    }
}
