package com.messageProdcer.messageproducer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestMessage {
    private String message;
    private String to;
    private String from;
    private String transactionID = "";
    private String username;
    private String password;
    private String clientid;


//    public RequestMessage() {
//    }

//    RequestMessage(String message, String phoneNumber ){
//
//        this.message = message;
//        this.phoneNumber = phoneNumber;
//
//    }
//
//    public String getFrom() {
//        return from;
//    }
//
//    public void setFrom(String from) {
//        this.from = from;
//    }
//
//    public String getTransactionID() {
//        return transactionID;
//    }
//
//    public void setTransactionID(String transactionID) {
//        this.transactionID = transactionID;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getClientId() {
//        return clientId;
//    }
//
//    public void setClientId(String clientid) {
//        this.clientId = clientid;
//    }
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
