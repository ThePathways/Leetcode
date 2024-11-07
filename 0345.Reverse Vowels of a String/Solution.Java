class Solution {
    public String reverseVowels(String s) {
        
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        //String vowels = "aeiouAEIOU";

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        while(start < end) {
            while(start < end && !vowels.contains(word[start])) {
            start++;
        }

        while (start < end && !vowels.contains(word[end])) {
            end--;
        }

        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;

        start++;
        end--;
        }

        return new String(word);
        
    }
}
