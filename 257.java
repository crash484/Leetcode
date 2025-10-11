/*
 * 
Code


Testcase
Testcase
Test Result
257. Binary Tree Paths
Solved
Easy
Topics
premium lock icon
Companies
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.


 */

 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        helper(root, new StringBuilder(), result);
        return result;
    }
    void helper(TreeNode node, StringBuilder path, List<String> result){
        if(node == null) return;
        int len = path.length();
        path.append(node.val);
        if(node.left==null && node.right==null) {result.add(path.toString());}
        else{
            path.append("->");
            helper(node.left, path, result);
            helper(node.right, path, result);
        }
        path.setLength(len);
    }
}