package com.mebigfatguy.ant;

import java.util.Iterator;

import org.slf4j.Marker;

public class AntMarker implements Marker {

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void add(Marker reference) {
		
	}

	@Override
	public boolean remove(Marker reference) {
		return false;
	}

	@Override
	public boolean hasChildren() {
		return false;
	}

	@Override
	public boolean hasReferences() {
		return false;
	}

	@Override
	public Iterator<Marker> iterator() {
		return null;
	}

	@Override
	public boolean contains(Marker other) {
		return false;
	}

	@Override
	public boolean contains(String name) {
		return false;
	}
	

}
