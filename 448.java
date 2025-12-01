class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
                map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(i+1)){
                continue;
            }else{
                list.add(i+1);
            }
        }
        return list;
    }
}   

/*
448. Find All Numbers Disappeared in an Array
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
  */