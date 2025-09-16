class Solution {
    public boolean isPalindrome(String s) {
        if(s == null) return false;
        if(s.equals("")) return true;
        String newString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int n = newString.length();
        for(int i = 0; i < n / 2; i++) {
            if(newString.charAt(i) != newString.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
