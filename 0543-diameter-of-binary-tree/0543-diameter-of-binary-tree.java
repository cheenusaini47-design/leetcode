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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxhight(root);
        return diameter;
    }
    private int maxhight(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftpath = maxhight(root.left);
        int rightpath = maxhight(root.right);
        diameter = Math.max(diameter,leftpath+rightpath);
        return Math.max(leftpath, rightpath)+1;
    }
}