/*
31. Next Permutation
Solved
Medium
Topics
premium lock icon
Companies
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory. */

class Solution {
    public void nextPermutation(int[] nums) {
        int brPoint=-1;
        int GbrPoint=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                brPoint=i-1;
                break;
            }
        }

        if(brPoint==-1){
            reverse(nums,0,nums.length-1);
            return ;
        }

        for(int i=nums.length-1;i>-2;i--){
            if(nums[i]>nums[brPoint]){
                swap(nums,i,brPoint);
                break;
            }
        }
        reverse(nums,brPoint+1,nums.length-1);
        return;
    }

    private void reverse(int[] arr,int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr, int i1,int i2){
        int temp = arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
        return;
    }
}