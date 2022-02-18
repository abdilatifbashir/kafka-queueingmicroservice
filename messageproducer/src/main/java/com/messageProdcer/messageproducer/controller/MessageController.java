package com.messageProdcer.messageproducer.controller;
import com.messageProdcer.messageproducer.messaging.producer.KafkaProducer;
import com.messageProdcer.messageproducer.model.RequestMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer){
        this.kafkaProducer = kafkaProducer;

    }
    @PostMapping
    public void publish(@RequestBody RequestMessage request){
        System.out.println("here is the kafka data");
        kafkaProducer.send(request);



    }
}
