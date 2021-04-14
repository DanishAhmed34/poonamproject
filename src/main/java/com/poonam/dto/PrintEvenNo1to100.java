package com.poonam.dto;

public class PrintEvenNo1to100 {

	public static int[] evennumber(int max) {

		int[] arr=(max%2==0)?new int[max+1]:new int[max];
		 

		for (int i = 1; i <= arr.length; i++) {

			if (i % 2 == 0) {
				//System.out.println(i);
				arr[i] = i;
				//System.out.println(arr[i]);
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] array = evennumber(98);

		for (int i = 1; i <= array.length-1; i++) {
			if(array[i]>0) { 
			System.out.println("Even Numbers=" + array[i]);
			}
			}

	}
}