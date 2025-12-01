/*
645. Set Mismatch
Solved
Easy
Topics
premium lock icon
Companies
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
 

Constraints:

2 <= nums.length <= 104
1 <= nums[i] <= 104 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        //goals is to find repeated number and then find missing number
        //[1,2,3,4,5,6]
        //first find repeated then at its position replace the missingi
        int rep=0,miss=0;
        int[] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                 rep = nums[i];
            }
            map.put(nums[i],i);
        }
        for(int i =1;i<nums.length+1;i++){
            if(map.containsKey(i)){
                continue;
            }else{
                miss = i;
            }
        }
        ans[0]=rep;
        ans[1]=miss;
        return ans;
    }
}