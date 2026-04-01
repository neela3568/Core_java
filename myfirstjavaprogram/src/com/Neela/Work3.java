package com.Neela;

public class Work3 {
	int hello;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalized method execute");
	}

	public static void main(String[] args) {
		Work3 t = new Work3();
		Work3 t1 = new Work3();
		t=null;
		t1.hello = 1234;
		System.gc();
		 System.out.println(t);
		 System.out.println(t1);

	}

}
