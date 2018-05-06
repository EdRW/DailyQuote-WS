package client;

public class QuoteServiceClient {

    public static void main(String[] args) {
        QuoteServiceImplService quoteServiceService = new QuoteServiceImplService();
        QuoteService quoteService = quoteServiceService.getQuoteServiceImplPort();

        System.out.println("Check out this sweet quote: " + quoteService.getQuote());
    }
}
