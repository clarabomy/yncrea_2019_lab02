package yncrea.lab02.web;

import yncrea.lab02.core.dao.QuoteProvider;
import yncrea.lab02.core.service.QuoteService;
import yncrea.lab02.core.service.impl.QuoteServiceImpl;
import yncrea.lab02.utils.ReflectionUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class QuoteServlet extends HttpServlet {

    private QuoteProvider quoteProvider;
    private QuoteService quoteService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        final String providerClass = config.getInitParameter("providerClass");
        quoteProvider = ReflectionUtils.getQuoteProviderInstanceFromClassName(providerClass);
        quoteService = new QuoteServiceImpl(quoteProvider);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(quoteService.getRandomQuote());
    }
}
