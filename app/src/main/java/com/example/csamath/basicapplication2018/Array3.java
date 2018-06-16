package com.example.csamath.basicapplication2018;

public class Array3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myNumber = {3.2, 9.1, 8, 5.2, 6.1};
		
		double[] myNumber2 = new double[3];
		for (int i=0; i<myNumber2.length; i++){
			myNumber2[i] = 10.5 + i;
			System.out.println(myNumber2[i]);
		}

	}

}
