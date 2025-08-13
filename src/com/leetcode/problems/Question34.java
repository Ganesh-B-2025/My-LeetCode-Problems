package com.leetcode.problems;

import java.util.Arrays;

public class Question34 {
	static int[] findStartAndEndIndex(int[] arr, int target) {
		int ans[] = {-1, -1};
		ans[0] = findFirstIndex(arr, target, true); //first Index Value
		ans[1] = findFirstIndex(arr, target, false); // Second Index Value
		return ans;
	}
	static int findFirstIndex(int[] arr, int target, boolean firstIndex) {
		int start = 0;
		int end = arr.length-1;
		int ans = 0;
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target < arr[mid]) {
				end = mid-1;
			}
			else if(target > arr[mid]) {
				start = mid+1;
			}
			else {
				ans = mid;
				if(firstIndex)
					end =mid-1;
				else
					start = mid+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 7;
		int[] ans = findStartAndEndIndex(nums, target);
		System.out.println(Arrays.toString(ans));
	}	
}
