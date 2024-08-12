package com.mebigfatguy.ant;

import org.slf4j.IMarkerFactory;
import org.slf4j.Marker;

public class AntMarkerFactory implements IMarkerFactory {

	static final IMarkerFactory MARKER_FACTORY = new AntMarkerFactory();
	
	private AntMarkerFactory() {
	}

	@Override
	public Marker getMarker(String name) {
		return null;
	}

	@Override
	public boolean exists(String name) {
		return false;
	}

	@Override
	public boolean detachMarker(String name) {
		return false;
	}

	@Override
	public Marker getDetachedMarker(String name) {
		return null;
	}

}
