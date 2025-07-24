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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null) {
            return -1;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        ArrayList<Long> levelSums = new ArrayList<>();
        long sum=0;
        
        while(!q.isEmpty()) {
            TreeNode currNode = q.remove();
            if(currNode == null) {
                levelSums.add(sum);
                sum=0;
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                sum += currNode.val;
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

        Collections.sort(levelSums, Collections.reverseOrder());
        
        if(k>levelSums.size()) return -1;

        return levelSums.get(k-1);
    }
}