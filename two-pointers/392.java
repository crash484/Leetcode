/*
392. Is Subsequence
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
  */

//the solutions logic was that if after iterating through both strings the pointer for s1 matches its length then it will be considered a subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1 = 0;
        int p2 =0;
        while(p1<s.length() && p2<t.length()){
            if(s.charAt(p1) == t.charAt(p2)){
                p1++;
            }
            p2++;
        }
        if(p1==s.length()) return true;
        return false;
    }
}