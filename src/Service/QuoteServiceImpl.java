package Service;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebService
public class QuoteServiceImpl implements QuoteService {

    private List<String> quotes = null;
    private Random random = null;

    public QuoteServiceImpl() {
        this.quotes = new ArrayList<>();
        this.quotes.add("Hello World!");
        this.random = new Random();
    }

    @Override
    public String getQuote() {
        int index = this.random.nextInt(this.quotes.size());

        return this.quotes.get(index);
    }

    @Override
    public void addQuote(String quote) {
        if (!quote.isEmpty()){
            this.quotes.add(quote);
        }
    }
}
