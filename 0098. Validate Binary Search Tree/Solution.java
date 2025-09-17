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

 //       4
 //      / \
 //     2   5
 //    / \
 //   1   3

class Solution {
    public boolean isValidBST(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        Integer pre = null;

        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            if(pre != null && pre >= current.val) 
                return false;

            pre = current.val;   // start pre is null, so assigned cuurent, in next iteration this become left

            current = current.right;
        }
        return true;

    }
}
