class Solution {

    private int getRomanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        char ch[] = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            int current = getRomanValue(ch[i]);
            int next = getRomanValue(ch[i + 1]);
            if (current < next) {
                count = count - current;
            } else {
                count = count + current;
            }
        }
        // Add the value of the last character
        count = count + getRomanValue(ch[ch.length - 1]);
        return count;
    }


}
