class Solution {
    public String reverseVowels(String s) {
        
        boolean[] vowels = new boolean[128];
        
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }
        
        char[] cs = s.toCharArray();
        
        int start = 0, end = cs.length - 1;
       
        while (start < end) {
            while (start < end && !vowels[cs[start]]) {
                start++;
            }
            while (start < end && !vowels[cs[end]]) {
                end--;
            }
            if (start < end) {
                char t = cs[start];
                cs[start] = cs[end];
                cs[end] = t;
                start++;
                end--;
            }
        }
        
        return String.valueOf(cs);
    }
}
