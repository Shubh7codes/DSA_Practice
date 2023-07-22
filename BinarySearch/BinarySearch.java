public class Solution {
    public static int search(int []nums, int target) {
        //Your code goes here
        return binarySearch(nums, 0, nums.length -1, target);
    }
    public static int binarySearch(int[] nums, int low, int high,int target) {
        while(low<=high){
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            else if(target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

}

// problem link: https://www.codingninjas.com/studio/problems/binary-search_972?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
