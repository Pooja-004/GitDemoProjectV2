package com.india;



public class Singleton {

	public static void main(String[] args) {
		Test t1=Test.getInstance();
		Test t2=Test.getInstance();
		System.out.println(t1==t2);
		Test t3=null;
		try {
		     t3=(Test) t2.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t2==t3);

	}

}
