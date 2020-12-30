package com.aot.classobject;

public class GarbageCollector {
	protected void finalize() throws Throwable {
		System.out.println("finalize() is called");
	}

	public static void main(String[] args) {
		GarbageCollector g1 = new GarbageCollector();
		GarbageCollector g2 = new GarbageCollector();
		g1 = null;
		g2 = null;
		System.gc();
	}
}
