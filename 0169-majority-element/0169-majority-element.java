class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        // Populate the HashMap with the counts of each element
        for (int num : nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the element that has a count greater than n / 2
        int majorityCount = nums.length / 2;
        for (HashMap.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() > majorityCount) {
                return entry.getKey(); // Return the majority element
            }
        }
        
        // Return -1 if no majority element is found (should not happen as per problem constraints)
        return -1;
    }
}