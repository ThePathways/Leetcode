class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int left = 0;
        Map<Character, Integer> seen = new HashMap<>(); 
        for(int right = 0; right < s.length(); right++){
            // if seen & within window -> move left, change index  
            // if not seen add in seen, as its not seen


            char currentChar = s.charAt(right);
            if(seen.containsKey(currentChar) && seen.get(currentChar) >= left) {
                left = seen.get(currentChar) + 1;
            }
             seen.put(currentChar, right);

            answer = Math.max(answer, right - left + 1);    

        }
        
        return answer;
    }
}
