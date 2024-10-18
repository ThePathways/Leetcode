class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = nums[0];
        int slow = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                nums[slow] = nums[i];
                slow++;
                prev = nums[i];
            }
        }
        return slow;
    }
}
