package com.Neela;

public class Work5 {
	static int value = 5;
	{
		value = value + 10;
	}

	public static void main(String[] args) {
		Work5 t = new Work5();
		Work5 t1 = new Work5();
		System.out.println(t.value);
		System.out.println(t1.value);
		
		
	}

}
