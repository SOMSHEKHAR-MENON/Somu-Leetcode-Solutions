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
    private TreeNode placeNode(TreeNode root, int num){
        if(root == null) return new TreeNode(num);
        if(num > root.val){
            root.right = placeNode(root.right, num);
        }
        if(num < root.val){
            root.left = placeNode(root.left, num);
        }
        
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root = new TreeNode(preorder[0]);
        
        for (int index = 1; index < preorder.length; index++){
            root = placeNode(root, preorder[index]);
        }
        
        return root;
    }
}



/*class Solution {
    public TreeNode bstFromPreorder(int[] A) {
        
        return bstFromPreorder(A, Integer.MAX_VALUE, new int[]{0});
    }
    
    public TreeNode bstFromPreorder(int A[], int bound, int i[]){
        
        if(i[0] == A.length || A[i[0]] > bound) return null;
        
        TreeNode root = new TreeNode(A[i[0]]);
        
        root.left = bstFromPreorder(A, root.val, i);
        root.right = bstFromPreorder(A, bound , i);
        
        return root;
    }
} 
*/