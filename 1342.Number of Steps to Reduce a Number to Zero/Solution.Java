class Solution {

    public int numberOfSteps(int num) {
        int answer = 0;
        while (num != 0) {
            num = (num & 1) == 1 ? num - 1 : num >> 1;
            ++answer;
        }
        return answer;
    }
}

// num >> 1 means num / 2 


// num & 1 == 0 means num is even
// num & 1 == 1 means num is odd
