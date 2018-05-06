package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface QuoteService {

    @WebMethod
    String getQuote();

    @WebMethod
    void addQuote(String quote);
}
