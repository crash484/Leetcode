/*
 * 3. Longest Substring Without Repeating Characters
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */

class solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char temp = s.charAt(right);
            //if the map contains this character
            map.put(temp, map.getOrDefault(temp,0)+1);
            while(map.get(temp)>1){
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    if(map.get(s.charAt(left))==0){
                        map.remove(s.charAt(left));
                    }
                    left++;
                }
            maxLen = Math.max(maxLen, right-left+1);
            }
        return maxLen;
    }
}

