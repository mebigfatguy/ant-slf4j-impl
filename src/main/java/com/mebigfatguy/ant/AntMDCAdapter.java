package com.mebigfatguy.ant;

import java.util.Deque;
import java.util.Map;

import org.slf4j.IMarkerFactory;
import org.slf4j.spi.MDCAdapter;

public class AntMDCAdapter implements MDCAdapter {
	
	static final MDCAdapter MDC_ADAPTER = new AntMDCAdapter();

	private AntMDCAdapter() {
	}

	@Override
	public void put(String key, String val) {
		
	}

	@Override
	public String get(String key) {
		return null;
	}

	@Override
	public void remove(String key) {
		
	}

	@Override
	public void clear() {
		
	}

	@Override
	public Map<String, String> getCopyOfContextMap() {
		return null;
	}

	@Override
	public void setContextMap(Map<String, String> contextMap) {
		
	}

	@Override
	public void pushByKey(String key, String value) {
		
	}

	@Override
	public String popByKey(String key) {
		return null;
	}

	@Override
	public Deque<String> getCopyOfDequeByKey(String key) {
		return null;
	}

	@Override
	public void clearDequeByKey(String key) {
		
	}

	
}
