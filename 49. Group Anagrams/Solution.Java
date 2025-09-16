class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> result = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            
            // freqArray
            int[] freqArray = new int[26];
            for(char c : s.toCharArray()) {
               freqArray[c - 'a']++;     
            }

            String key = Arrays.toString(freqArray);

            // if key not, add key
            result.putIfAbsent(key, new ArrayList<String>());

            // if key, add value   
            result.get(key).add(s);
        }
        return new ArrayList(result.values()); 
    }
}
