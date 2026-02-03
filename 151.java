/*
151. Reverse Words in a String
Solved
Medium
Topics
premium lock icon
Companies
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string. */
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr = s.split("\\s+");
        int n = arr.length;
        String[] ans = new String[n];
        n--;
        for(String a:arr){
            ans[n--]=a;
        }
        StringBuilder x = new StringBuilder();
        for(int i=0; i<ans.length;i++){
            if(i!=ans.length-1){
                x.append(ans[i]);
                x.append(" ");
            }else{
                x.append(ans[i]);
            }
        }
        return x.toString().trim();
    }
}