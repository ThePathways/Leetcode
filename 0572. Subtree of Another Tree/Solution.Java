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

    private boolean isSameTree(TreeNode one, TreeNode two) {
         Queue<TreeNode> oneQueue = new LinkedList<>();
         Queue<TreeNode> twoQueue = new LinkedList<>();

        oneQueue.offer(one);
        twoQueue.offer(two);

        while(!oneQueue.isEmpty() && !twoQueue.isEmpty()) {
                TreeNode oneCurrent = oneQueue.poll();
                TreeNode twoCurrent = twoQueue.poll();

                if(oneCurrent == null && twoCurrent == null) continue;
                if(oneCurrent == null || twoCurrent == null || oneCurrent.val != twoCurrent.val) return false;

                oneQueue.offer(oneCurrent.left);
                oneQueue.offer(oneCurrent.right);
                twoQueue.offer(twoCurrent.left);
                twoQueue.offer(twoCurrent.right);
        }
        return oneQueue.isEmpty() && twoQueue.isEmpty();
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;

        Queue<TreeNode> rootQueue = new LinkedList<>();
        rootQueue.offer(root);

        while(!rootQueue.isEmpty()) {
            TreeNode current = rootQueue.poll();

            if(isSameTree(current, subRoot)) return true;

            if (current.left != null) rootQueue.offer(current.left);
            if (current.right != null) rootQueue.offer(current.right);
        }
        return false;

        
    }

}
