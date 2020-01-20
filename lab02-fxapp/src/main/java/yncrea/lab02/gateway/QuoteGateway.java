package yncrea.lab02.gateway;

import yncrea.lab02.core.service.QuoteService;

public class QuoteGateway {
    private QuoteService quoteService;

    public String getRandomQuote(){
        return quoteService.getRandomQuote();
    }
}
