class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;    // current unique index
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) { // found new unique element
                k = k + 1;
                nums[k] = nums[i];
            }
        }
        return k+1;  // size = last index + 1
    }
}
