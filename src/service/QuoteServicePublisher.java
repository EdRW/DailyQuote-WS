package service;

import javax.xml.ws.Endpoint;

public class QuoteServicePublisher {

    public static void main(String[] args){
        QuoteService quoteService = new QuoteServiceImpl();
        String url = "http://localhost:8888/quotes";
        Endpoint.publish(url, quoteService);
        System.out.printf("QuoteService is running at endpoint: %1$s\n" +
                "See WSDL at: %1$s?wsdl\n" +
                "See schema at: %1$s?xsd=1", url);

    }
}
