package com.leetcode.problems;

class Question1279 {

    static int checkHowManyDigits(int n){
        int count = 0;
        if(n<0){
            n = n*-1;
        }
        if(n == 0)
            return 0;
        while(n>0){
            count++;
            n /= 10;
        }
        return count;
    }

    static boolean checkEvenDigits(int n){
       int digits = checkHowManyDigits(n);
       return (digits % 2 ==0);
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int num : nums){
            if(checkEvenDigits(num))
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = {12, 345, 2, 6, 7896, -23};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
}