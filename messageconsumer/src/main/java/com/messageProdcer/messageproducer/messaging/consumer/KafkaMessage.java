package com.messageProdcer.messageproducer.messaging.consumer;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class KafkaMessage{
    private String message;
    private String to;
    private String from;
    private String transactionID= "";
    private String username;
    private String password;
    private String clientid;



//    KafkaMessage(String message,String phoneNumber ){
//
//        this.message = message;
//        this.phoneNumber = phoneNumber;
//
//    }
//
//    public KafkaMessage() {
//    }
//
//    public String print(){
//        return "phone number is : " + to + " message is: " + message + "userName: " + userName +
//        "userName: " + password ;
//    }
//
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
}