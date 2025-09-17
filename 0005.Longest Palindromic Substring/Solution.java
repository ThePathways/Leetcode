class Solution {
    public String longestPalindrome(String s) {
        // Transform the original string
        StringBuilder t = new StringBuilder("^#");
        for (char c : s.toCharArray()) {
            t.append(c).append('#');
        }
        t.append('$'); // Append a sentinel to avoid bounds checking

        int n = t.length();
        int[] P = new int[n]; // Array to hold the lengths of palindromes
        int C = 0, R = 0; // Center and right boundary

        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * C - i; // Calculate the mirror index

            if (R > i) {
                P[i] = Math.min(R - i, P[mirror]); // Initialize P[i]
            }

            // Attempt to expand the palindrome centered at i
            while (t.charAt(i + P[i] + 1) == t.charAt(i - P[i] - 1)) {
                P[i]++;
            }

            // Update the center and right boundary if the palindrome expanded beyond R
            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }
        }

        // Find the maximum length of palindrome in P
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }

        // Extract the longest palindromic substring from the original string
        int start = (centerIndex - maxLen) / 2; // Calculate the start index in original string
        return s.substring(start, start + maxLen);
    }
}
