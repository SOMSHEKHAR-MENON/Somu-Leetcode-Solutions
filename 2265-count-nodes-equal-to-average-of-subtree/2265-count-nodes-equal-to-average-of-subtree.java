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
    int total = 0;
    public int averageOfSubtree(TreeNode root) {
        findAverages(root);
        return total;
    }
    
    // the array that this method returns is of size two and is going to hold:
    // the number of nodes of the subtree in the first index
    // the total sum of the subtree at that node in the second index
    public int[] findAverages(TreeNode root) {
        if (root == null) return new int[]{0,0};
        
        int[] left = findAverages(root.left);
        int[] right = findAverages(root.right);
        
        int finalSumOfNodes = left[1] + right[1] + root.val;
        int finalNumOfNodes = 1 + left[0] + right[0];
        
        if (finalSumOfNodes / finalNumOfNodes == root.val) {
            total++;
        }
        
        return new int[]{finalNumOfNodes, finalSumOfNodes};
    }
}