package yncrea.lab02.core.dao;

//interface qu'on impose au provider
public interface QuoteProvider {

    String getOneQuote(int i);
    int getNumberOfQuotes();
}
