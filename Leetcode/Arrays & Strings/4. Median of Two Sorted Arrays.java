// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] merged = new int[len1 + len2];

        int i = 0, j = 0, ctr = 0;

        while(i < len1 && j < len2){
            if(nums1[i] < nums2[j]){
                merged[ctr++] = nums1[i++];
            }else{
                merged[ctr++] = nums2[j++];
            }
        }

        while(i < len1){
            merged[ctr++] = nums1[i++];
        }
        while(j < len2){
            merged[ctr++] = nums2[j++];
        }

        double median = 0;
        int n = len1 + len2;
        if(n%2==1){
            return merged[n/2];
        }
        else{
            int l1 = (n/2) - 1;
            int l2 = (n/2);
            median = (merged[l1] + merged[l2])/2.0;
            
        }
        return median;

    }
}