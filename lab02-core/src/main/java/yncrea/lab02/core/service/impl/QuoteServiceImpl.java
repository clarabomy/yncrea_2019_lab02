package yncrea.lab02.core.service.impl;

import yncrea.lab02.core.dao.QuoteProvider;
import yncrea.lab02.core.service.QuoteService;

import java.security.SecureRandom;

public class QuoteServiceImpl implements QuoteService {

    private final SecureRandom random = new SecureRandom();
    private QuoteProvider quoteProvider;

    public QuoteServiceImpl(QuoteProvider quoteProvider) {
        this.quoteProvider = quoteProvider;
    }

    @Override
    public String getRandomQuote() {
        final int index = random.nextInt(quoteProvider.getNumberOfQuotes());
        return quoteProvider.getOneQuote(index);
    }

}
