package yncrea.lab02.app;

import yncrea.lab02.core.dao.QuoteProvider;
import yncrea.lab02.core.service.QuoteService;
import yncrea.lab02.core.service.impl.QuoteServiceImpl;
import yncrea.lab02.provider.CNFProvider;

public class AppLauncher {

    public static void main(String[] args) {
        QuoteProvider quoteProvider = new CNFProvider();
        QuoteService service = new QuoteServiceImpl(quoteProvider);
        Application application = new Application((service));

        application.printQuoteInConsole();
    }
}
