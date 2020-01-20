package yncrea.lab02.app;

import yncrea.lab02.core.dao.QuoteProvider;
import yncrea.lab02.core.service.QuoteService;
import yncrea.lab02.core.service.impl.QuoteServiceImpl;

public class AppLauncher {
	
	public static void main(String[] agrs)
	{
		QuoteProvider provider = new CNFProvider();
		QuoteService service = new QuoteServiceImpl();
		
	}

}
