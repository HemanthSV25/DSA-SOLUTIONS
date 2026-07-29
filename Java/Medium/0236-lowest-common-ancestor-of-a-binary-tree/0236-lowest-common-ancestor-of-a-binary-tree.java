/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode l=LCA(root.left,p,q);
        TreeNode r=LCA(root.right,p,q);
        if(l==null && r==null) return null;
        else if(l==null) return r;
        else if(r==null) return l;
        else return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res=LCA(root,p,q);
        return res;
    }
}