package BinaryTree.LeetCodeQuestion;

/*
URL: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */

public class LowestCommonAncestor {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        else if(root.val == p.val || root.val == q.val) {
            return root;
        }
        else {
            TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
            TreeNode rightNode = lowestCommonAncestor(root.right, p, q);

            if(leftNode != null && rightNode != null) {
                return root;
            }
            else if(leftNode == null && rightNode == null) {
                return null;
            }
            else {
                if(leftNode == null) {
                    return rightNode;
                }
                else {
                    return leftNode;
                }
            }
        }
    }
}