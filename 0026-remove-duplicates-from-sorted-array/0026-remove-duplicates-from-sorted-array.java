class Solution {
    public int removeDuplicates(int[] nums) {
        // 'i' tracks the position where the next unique element will be placed
        int i = 0;

        // Iterate over the array 'nums' with 'j' being the index pointer
        for (int j = 0; j < nums.length; j++) {
            
            // Place the current unique element at index 'i'
            nums[i] = nums[j];
            i++; // Increment 'i' for the next unique element
            
            // Skip all the duplicate elements for the current element at 'j'
            while (j != nums.length - 1 && nums[j] == nums[j + 1]) {
                j++; // Move 'j' forward as long as the next element is a duplicate
            }
        }

        // After the loop, 'i' contains the number of unique elements in the array
        return i;
    }
}
