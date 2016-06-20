package com.softserveinc.edu.ita.testngpractice;

public class Function {

	/**
	 * the method is using O(n) algorithm to find min value from array 
	 * @param arr array of int
	 * @return min value
	 */
	public int findMinN(int[] arr) {

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}
	/**
	 * the method is using O(n^2) algorithm to find min value from array 
	 * @param arr array of int
	 * @return min value
	 */
	public int findMinN2(int [] arr){
	
		int min = 0;
		boolean isFound = false;
		
		for(int i=0; i<arr.length; i++){
			
			min = arr[i];
			
			isFound = false;
			
			for(int j=i+1; j<arr.length-1; j++){
				
				if(arr[j] < min){
					min =arr[j];
					isFound = true;
				
				}
				
			}
			
			if(isFound){
				break;
			}
			
		}
		
		
		return min;
	}

}
