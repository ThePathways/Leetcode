class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] numArray = new int[26];

        for(int i = 0; i < s.length(); i++){
            numArray[s.charAt(i) - 'a']++;
            numArray[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] != 0) return false;
        }
        
        return true;
        
    }
}
