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
    public boolean isSameTree(TreeNode m, TreeNode n) {
        if(m==null&&n==null){
            return true;
        }
        if (m==null||n==null){
            return false;
        }
        if(m.val != n.val){
            return false;
        }
        return isSameTree(m.left,n.left)&& isSameTree(m.right,n.right);
    }
}