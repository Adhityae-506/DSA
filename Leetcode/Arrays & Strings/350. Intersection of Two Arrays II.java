// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }

        for(int j=0;j<nums2.length;j++){
            if(list.contains(nums2[j])){
                resultList.add(nums2[j]);
                list.remove((Integer)nums2[j]);
            }
        }
        int[] result = new int[resultList.size()];
        int ctr = 0;

        for(int value : resultList){
            result[ctr++] = value;
        }
        return result;
    }
}