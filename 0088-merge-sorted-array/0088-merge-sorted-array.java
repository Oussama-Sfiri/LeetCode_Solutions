class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;

        // Traverse both arrays from the end, and fill nums1 from the back
        while (m > 0 && n > 0){
            if (nums1[m - 1] > nums2 [n - 1]){
                nums1[last] = nums1[m - 1]; // Put larger element at the end
                m--;
            }else{
                nums1[last] = nums2[n - 1]; // Put nums2 element at the end
                n--;
            }
            last--; // Move the pointer back for the next element
        }

        // If there are remaining elements in nums2, place them in nums1
        while (n > 0){
            nums1[last] = nums2[n - 1];
            n--;
            last--;
        }
    }
}