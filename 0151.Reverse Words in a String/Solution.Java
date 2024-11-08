class Solution {
    public String reverseWords(String s) {
        return Arrays.stream(s.trim().split("\\s+"))
                     .reduce((first, second) -> second + " " + first)
                     .orElse("");
    }
}
