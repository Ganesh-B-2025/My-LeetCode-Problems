package com.leetcode.problems;

public class Question1672 {
	
	public static int maximumWealth(int[][] arr) {
		int richestWealth = 0;
		for(int person=0; person<arr.length; person++) {
			int currentPersonWealth = 0;
			for(int account=0; account<arr[person].length; account++) {
				currentPersonWealth += arr[person][account];
			}
			if(currentPersonWealth > richestWealth) {
				richestWealth = currentPersonWealth;
			}
		}
		return richestWealth;
	}
	
	
	public static void main(String[] args) {
		int[][] accounts = { 
								{ 1, 2, 3 }, 
								{ 3, 2, 1 },
								{8, 9, 1}
							};
		int ans = maximumWealth(accounts);
		System.out.println(ans);
	}
}
