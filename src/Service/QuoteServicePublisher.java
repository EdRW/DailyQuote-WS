package Service;

import javax.xml.ws.Endpoint;

public class QuoteServicePublisher {

    public static void main(String[] args){
        QuoteService quoteService = new QuoteServiceImpl();
        Endpoint.publish("http://localhost:8888/quotes", quoteService);
        System.out.println("Service is Running");
    }
}
