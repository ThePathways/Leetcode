import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        
        Queue<TreeNode> pQueue = new LinkedList<>();
        Queue<TreeNode> qQueue = new LinkedList<>();

        if(p != null) pQueue.offer(p);
        if(q != null) qQueue.offer(q);

        while(!pQueue.isEmpty() && !qQueue.isEmpty()) {
            TreeNode pCurrent = pQueue.poll();
            TreeNode qCurrent = qQueue.poll();

            if(pCurrent == null && qCurrent == null) continue;
            if(pCurrent == null || qCurrent == null) return false;
            if(pCurrent.val != qCurrent.val) return false;

            pQueue.offer(pCurrent.left);
            pQueue.offer(pCurrent.right);

            qQueue.offer(qCurrent.left);
            qQueue.offer(qCurrent.right);
        }
        return pQueue.isEmpty() && qQueue.isEmpty();
    }
}
