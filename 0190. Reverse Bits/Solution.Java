class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++){
            result = result << 1;      // create space in result
            result = result | (n & 1); // last bit of n
             n >>>= 1;   

        }
        return result;
    }
}
