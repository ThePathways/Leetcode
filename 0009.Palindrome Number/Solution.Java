class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int rev = 0;
        int rem = 0; 

        if(x == 0) return true;
        if(x < 0 || (x > 0 && x % 10 ==0)) return false;

        while (x != 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return num == rev;
    }
}
