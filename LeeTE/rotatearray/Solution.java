/**
 *  
 *  https://leetcode-cn.com/problems/rotate-array/
 *  2019-11-28 
 * 
 */

 class Solution {
     public void rotate(int[] nums, int k) {
        if (nums.length < 1) {
            return ;
        }

        int temp = 0;

        for (int i = 0; i < k; i ++) {
            for (int j = nums.length - 1; j > 0; j --) {
                temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
            }
        }
     }
 }
