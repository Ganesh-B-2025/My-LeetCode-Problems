package com.leetcode.problems;

public class Question852 {

	static int findPeakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(arr[mid] > arr[mid+1]) {
				end = mid-1;
			}else if(arr[mid] < arr[mid+1]) {
				start = mid+1;
			}
		}
		return start;
	}
	public static void main(String[] args) {
		int[] arr = {0, 10, 5, 2};
		int peakIndex = findPeakIndexInMountainArray(arr);
		System.out.println(peakIndex);
	}
}
