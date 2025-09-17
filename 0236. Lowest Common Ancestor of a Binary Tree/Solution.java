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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // travels 
        // everytime maintain the parentMap
        // 

        Map<TreeNode, TreeNode> ParentMap = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
            ParentMap.put(root, null);
        }   

        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if(current.left != null) {
                queue.offer(current.left);
                ParentMap.put(current.left, current);
            } 
            if(current.right != null) {
                 queue.offer(current.right);
                 ParentMap.put(current.right, current);
            }
        } 

        // 
        //3-null
       // ...5-3
        // 1-3
        // 6-5
        // ...2-5
        // 7-2
        // ...4-2
        // 0-1
        // 8-1
        // 4, 2, 5, 3, 

        // ancestors registery for p
        Set<TreeNode> ancestorsRegistery = new HashSet<>();
        while(p != null) {
            ancestorsRegistery.add(p);
            p = ParentMap.get(p);
        }

        // find q hirechy in p's ancestor registory
        while(!ancestorsRegistery.contains(q)){
            q = ParentMap.get(q);
        }
        
        return q;

    }
}
