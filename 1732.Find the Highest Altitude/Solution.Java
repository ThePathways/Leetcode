class Solution {
    public int largestAltitude(int[] gain) {
        
        int answer = 0, height = 0;
        
        for (int g : gain) {
            height = height + g;
            answer = Math.max(answer, height);
        }
        return answer;
    }
}
