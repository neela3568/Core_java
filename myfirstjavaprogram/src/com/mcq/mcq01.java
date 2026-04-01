package com.mcq;

public class mcq01 {

	public static void main(String[] args) {
		mcq01 m = new mcq01();
		m.neela();

}
	void neela() {
		int[] arr1 = {6,7,8};
		int[] arr2 = neela1(arr1);
		System.out.println(arr1[0] + arr1[1] + arr1[2]);
		System.out.println(arr2[0] + arr2[1] + arr2[2]);
	}
	int[] neela1(int[] arr3) {
		arr3[2] = 6;
		return arr3;
	}
}