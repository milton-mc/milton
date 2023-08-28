package com.milton.systems;

public class System {
	private static native void registerNatives();
	static {
		registerNatives();
	}

	private System() {
	}
}
