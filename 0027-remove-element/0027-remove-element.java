class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;// 'k' keeps track of the new length of the array after removing elements equal to 'val'
        // Iterate through each element in the array 'nums'
        for (int i = 0; i < nums.length; i++){
            // If the current element is not equal to the value 'val', keep it in the array
            if(nums[i] != val){
                // Place the current element at the index 'k' and then increment 'k'
                // This ensures that all elements not equal to 'val' are shifted to the front of the array
                nums[k] = nums[i];
                k++; // Increment 'k' for the next valid element
            }
        }
        // After the loop, 'k' will be the number of elements in the array that are not equal to 'val'
        return k; // Return the new length of the array with elements not equal to 'val'
    }
}