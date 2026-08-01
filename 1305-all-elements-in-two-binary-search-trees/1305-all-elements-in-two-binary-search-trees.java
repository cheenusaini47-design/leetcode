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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> inorder1 = new ArrayList<>();
        helper1(root1,inorder1);
        ArrayList<Integer> inorder2 = new ArrayList<>();
        helper1(root2,inorder2);

        int i=0;
        int j=0;
        ArrayList<Integer> final1 = new ArrayList<>();
        while(i<inorder1.size() && j<inorder2.size()){
            if(inorder1.get(i)<=inorder2.get(j)){
                final1.add(inorder1.get(i));
                i++;
            }else{
                final1.add(inorder2.get(j));
                j++;
            }
        }
        while(i<inorder1.size()){
             final1.add(inorder1.get(i));
                i++;
        }
        while(j<inorder2.size()){
             final1.add(inorder2.get(j));
                j++;
        }



         int str = 0;
        int end = final1.size()-1;
        return final1;
    }
    
}