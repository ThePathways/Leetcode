class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        // initial sum
        for (int i = 0; i < k; ++i) {
            sum = sum + nums[i];
        }

        // save initial sum
        int answer = sum;

        // from next element sum & compare 
        for (int i = k; i < nums.length; ++i) {
            sum = sum + nums[i] - nums[i - k];
            answer = Math.max(answer, sum);
        }
        return answer * 1.0 / k;
    }
}
