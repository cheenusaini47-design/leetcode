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
    public static void helper1(TreeNode root,ArrayList<Integer> inorder){
        if(root == null){
            return ;
        }
        helper1(root.left,inorder);
        inorder.add(root.val);
        helper1(root.right,inorder);
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        helper1(root,inorder);
         int str = 0;
        int end = inorder.size()-1;
        return helper(inorder,str,end);
    }
     public TreeNode helper( ArrayList<Integer> inorder,int str ,int end){
        if (str>end){
            return null;
        }
        int mid = (str+end)/2;
        TreeNode root = new TreeNode(inorder.get(mid));
         root.left= helper(inorder,str,mid-1);
         root.right=   helper(inorder,mid+1,end);
        return root;
        

    }
}