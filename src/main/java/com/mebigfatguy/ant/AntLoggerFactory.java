package com.mebigfatguy.ant;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

public class AntLoggerFactory implements ILoggerFactory {

    static final ILoggerFactory LOGGER_FACTORY = new AntLoggerFactory();
	private static final Map<String, Logger> LOGGERS = new ConcurrentHashMap<>();
	
	private AntLoggerFactory() {
	}

	@Override
	public Logger getLogger(String name) {
		Logger logger = LOGGERS.get(name);
		if (logger == null) {
			logger = new AntLogger(name);
			LOGGERS.put(name,  logger);
		}
		
		return logger;
	}

}
