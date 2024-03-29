package _27_RemoveElement;

/*
    Given an array nums and a value val, remove all instances of that value in-place and return the new length.
    Do not allocate extra space for another array, you must do this by modifying the input array
    in-place with O(1) extra memory.
    The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/

import java.util.Arrays;

public class Solution {
    public static int removeElement(int[] nums, int val) {

        if(nums.length < 1){
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length ; i++){
            if (nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));

        return j;

    }

    public static void main(String[] args) {

       int [] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }
}
