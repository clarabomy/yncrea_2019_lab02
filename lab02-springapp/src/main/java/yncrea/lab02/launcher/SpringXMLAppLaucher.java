package yncrea.lab02.launcher;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import yncrea.lab02.app.QuoteApplication;

public class SpringXMLAppLaucher {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        QuoteApplication application = context.getBean(QuoteApplication.class);
        application.printQuoteInConsole();
    }
}
