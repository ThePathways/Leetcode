class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maximum = 0;
        
        for (int candy : candies) {
            maximum = Math.max(maximum, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maximum);
        }
        return result;
    }
}
