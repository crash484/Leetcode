/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 /*
  * 019. Next Greater Node In Linked List
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given the head of a linked list with n nodes.

For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.

Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0.

 

Example 1:


Input: head = [2,1,5]
Output: [5,5,0]
Example 2:


Input: head = [2,7,4,3,5]
Output: [7,0,5,5,0]
 

Constraints:

The number of nodes in the list is n.
1 <= n <= 104
1 <= Node.val <= 109
  */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> add = new ArrayList<>();
        while(head!=null){
            add.add(head.val);
            head=head.next;
        }

        Stack<Integer> st = new Stack<>();
        int[] res= new int[add.size()];
        for(int i = 0; i < add.size();i++){
            while(!st.isEmpty() && add.get(i)>add.get(st.peek())){
                res[st.pop()]=add.get(i);
            }
            st.push(i);
        }
        return res;
    }
}