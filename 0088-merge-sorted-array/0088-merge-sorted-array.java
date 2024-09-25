class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
// Set pointers for nums1, nums2, and the last position of nums1
        int p1 = m - 1;  // Pointer for the last element in nums1's active portion
        int p2 = n - 1;  // Pointer for the last element in nums2
        int p = m + n - 1;  // Pointer for the last position in nums1 array
        
        // Traverse both arrays from the end, and fill nums1 from the back
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];  // Put larger element at the end
                p1--;
            } else {
                nums1[p] = nums2[p2];  // Put nums2 element at the end
                p2--;
            }
            p--;  // Move the pointer back for the next element
        }
        
        // If there are remaining elements in nums2, place them in nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }

        
    }
}