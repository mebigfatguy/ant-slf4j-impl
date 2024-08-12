package com.mebigfatguy.ant;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

public class AntSLF4JServiceProvider implements SLF4JServiceProvider {

	@Override
	public ILoggerFactory getLoggerFactory() {
		return AntLoggerFactory.LOGGER_FACTORY;
	}

	@Override
	public IMarkerFactory getMarkerFactory() {
		return AntMarkerFactory.MARKER_FACTORY;
	}

	@Override
	public MDCAdapter getMDCAdapter() {
		return AntMDCAdapter.MDC_ADAPTER;
	}

	@Override
	public String getRequestedApiVersion() {
		return "2.0";
	}

	@Override
	public void initialize() {
	}
}
