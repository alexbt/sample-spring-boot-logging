package com.alexbt.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/logging")
public class MyController {
	
	private final Logger logger = LoggerFactory.getLogger(MyController.class);

	@RequestMapping(path = "", params = "variable")
	public void test() {
		logger.trace("log statement - not displayed");
		logger.debug("log statement");
		logger.info("log statement");
		logger.warn("log statement");
		logger.error("log statement");
	}
	
}
