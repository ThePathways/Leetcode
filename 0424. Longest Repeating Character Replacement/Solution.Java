class Solution {
    public int characterReplacement(String s, int k) {
        int globalMax = 0;
        int highest_count = 0;
        int left = 0;
        int[] freq = new int[26];

        for(int right = 0; right < s.length(); right++) {
             freq[s.charAt(right) - 'A']++;
             highest_count = Math.max(highest_count, freq[s.charAt(right) - 'A']);
             while((right - left + 1) - highest_count > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
             }
             globalMax = Math.max(globalMax, right - left + 1);
        }
        return globalMax;
        }
}
