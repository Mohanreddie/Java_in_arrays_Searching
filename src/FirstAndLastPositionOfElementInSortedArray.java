import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    //    Given an array of integers nums sorted in ascending order, find the starting and ending position a given target value.
//    If target is not found in the array, return [-1, -1].
//    You must write an algorithm with 0(log n) runtime complexity.
//    Example 1:
//    Input: nums = [5,7,7,8,8,10], target = 8
//    Output: [3,4]
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(find(nums,target)));

    }
    static int[] find(int[] nums, int target) {
        int[] ans=
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;

            }
        }
        return end;

    }

}

