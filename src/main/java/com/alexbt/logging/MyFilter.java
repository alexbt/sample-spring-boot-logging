package com.alexbt.logging;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.jboss.logging.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyFilter implements Filter{
	
	private final Logger logger = LoggerFactory.getLogger(MyFilter.class);

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		String variableParam = request.getParameter("variable");
		logger.info("log before");
		MDC.put("variable", "VARIABLE: " + variableParam);
		logger.info("log after");
		
		logger.trace("log statement");
		logger.debug("log statement");
		logger.info("log statement");
		logger.warn("log statement");
		logger.error("log statement");
		
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
