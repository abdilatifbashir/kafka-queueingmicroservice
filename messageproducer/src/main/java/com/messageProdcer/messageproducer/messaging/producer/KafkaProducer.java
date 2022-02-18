package com.messageProdcer.messageproducer.messaging.producer;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.messageProdcer.messageproducer.model.RequestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    private KafkaTemplate<String,String> kafkaTemplate;
    private ObjectMapper objectMapper;

    @Autowired
    public KafkaProducer(KafkaTemplate<String,String> kafkaTemplate,
                         ObjectMapper objectMapper
    ){
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public void send(RequestMessage requestMessage){
        try {
            String data = objectMapper.writeValueAsString(requestMessage);
            kafkaTemplate.send("eclecticsUsers",data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}
