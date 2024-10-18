class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        
        for (int i = 0;; i++) {   
            int x = nums[i];
            int y = target - x;
            if (hash.containsKey(y)) {
                return new int[] {hash.get(y), i};
            }
            hash.put(x, i);
        }
    }
}
