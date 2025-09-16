class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for(int i = 1; i < n; i++) {
            answer[i] = nums[i-1] * answer[i-1];
        }

        int postfix = 1;
        for(int i = n - 2; i >= 0; i--) {
            postfix = postfix * nums[i+1];
            answer[i] = answer[i] * postfix; 
        }
        return answer;
    }
}
