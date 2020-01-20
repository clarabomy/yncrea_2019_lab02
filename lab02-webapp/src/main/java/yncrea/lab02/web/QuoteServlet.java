package yncrea.lab02.web;

import yncrea.lab02.utils.ReflectionUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class QuoteServlet extends HttpServlet {
    private ReflectionUtils reflectionUtils = new ReflectionUtils();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        reflectionUtils.getQuoteProviderInstanceFromClassName();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
