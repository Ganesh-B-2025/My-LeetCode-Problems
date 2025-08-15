package com.leetcode.problems;

import com.leetcode.problems.mountainArrayQ1095.MountainArray;

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

public class Question1095 {
	// This Problems needs an Interface hat i am created in the package 
			//com.leetcode.problems.mountainArrayQ1095.MountainArray
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int size = mountainArr.length();
        int peak = findPeakIndex(mountainArr, size);
        int searchLeft = searchBinary(mountainArr, target, 0, peak, true);
        if(searchLeft != -1)
            return searchLeft;
        return searchBinary(mountainArr, target, peak+1, size-1, false);
    }
    static int searchBinary(MountainArray arr, int target, int start, int end, boolean asc){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr.get(mid) == target)
                return mid;
            boolean isAsc = arr.get(0) > arr.get(end);
            if(isAsc){
                if(arr.get(mid) > target)
                    start = mid+1;
                else if(arr.get(mid) < target)
                    end = mid-1;
                else
                    return mid;
            }else{
                if(arr.get(mid) < target)
                    end = mid-1;
                else if(arr.get(mid) < target)
                    start = mid+1;
                else
                    return mid;
            }
        }
        return -1;
    }
    public static int findPeakIndex(MountainArray arr, int size){
        int start = 0;
        int end = size-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr.get(mid) > arr.get(mid+1)){
                end = mid-1;
            }else if(arr.get(mid) < arr.get(mid+1)){
                start = mid+1;
            }
        }
        return start;
    }

}
