/*
 * iven a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
 */

 class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==1) return 1;
        s = s.trim();
        int back = 0;
        int front =1;
        while(front<s.length()){
            if(s.charAt(front) == ' '){
                front++;
                back=front;
            }else{
                front++;
            }
        }

        return front-back;
    }
}