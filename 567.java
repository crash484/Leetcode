/*
 * 567. Permutation in String
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
 */
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i<s1.length();i++){
            char s = s1.charAt(i);
            map.put( s , map.getOrDefault( s , 0 ) + 1 );
        }

        //implement two windows
        Map<Character,Integer> window = new HashMap<>();

        int left =0;
        for(int right = 0; right<s2.length();right++){
            char temp = s2.charAt(right);
            window.put(temp, window.getOrDefault(temp,0)+1);
            if(right-left+1>s1.length()){
                char toRemove = s2.charAt(left);
                window.put(toRemove,window.get(toRemove)-1);
                if(window.get(toRemove)<1){
                    window.remove(toRemove);
                }
                left++;
            }

            if(right-left+1==s1.length()){
                if(window.equals(map)) return true;
            }
        }        
        return false;
    }
}