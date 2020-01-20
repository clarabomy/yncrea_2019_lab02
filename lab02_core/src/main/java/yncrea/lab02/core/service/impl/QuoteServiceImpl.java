package yncrea.lab02.core.service.impl;

import java.security.SecureRandom;

import yncrea.lab02.core.dao.QuoteProvider;
import yncrea.lab02.core.service.QuoteService;

public class QuoteServiceImpl implements QuoteService {
	
	private final SecureRandom random =new SecureRandom();
	
	private QuoteProvider quoteProvider;
	
	
	@Override
	public String getRandomQuote()
	{
		int randomNumber= random.nextInt(quoteProvider.getNumberofQuote());
		return quoteProvider.getOneQuote(randomNumber);
	}

}
