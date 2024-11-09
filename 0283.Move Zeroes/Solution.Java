class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        
        for (int j = 0; j < nums.length; ++j) {
            if (nums[j] != 0) {
                
                int temp = nums[j];
                nums[j] = nums[nonZero];
                nums[nonZero] = temp;
                nonZero++;
            }
        }
    }
}
