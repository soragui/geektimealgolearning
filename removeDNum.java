class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length < 1) {
            return nums.length;
        }
        
        int index = 1;
        int temp = nums[0];

        for (int i = 1; i < nums.length; i ++) {
            if (temp != nums[i]) {
                nums[index] = nums[i];
                temp = nums[i];
                index ++;
            }
        }

        return index;

    }
}
