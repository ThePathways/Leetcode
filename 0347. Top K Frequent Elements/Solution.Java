class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      
      // frequencyMap
      Map <Integer, Integer> freqMap = new HashMap<>();
      for(int i = 0; i < nums.length; i++){
        freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
      }

      //
      List<Integer>[] bucket = new List[nums.length + 1];
      freqMap.forEach((number, frequency) -> {
        if(bucket[frequency] == null)  bucket[frequency] = new ArrayList<Integer>();  
        bucket[frequency].add(number);
      });


      List<Integer> result = new ArrayList<>();
      for(int i = nums.length; i > 0 && result.size() < k; i--){
        if(bucket[i] != null) {
            result.addAll(bucket[i]);
        }
      }
    return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
