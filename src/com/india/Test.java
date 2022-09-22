package com.india;

public class Test {
	private static Test instance=null;
	private Test() {
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	}
	public static Test getInstance() {
		if(instance==null) {
			synchronized (Test.class) {
				if(instance==null) {
					instance=new Test();
				}
			}
		}
		return instance;
	}

}
