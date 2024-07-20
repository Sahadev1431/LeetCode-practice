public class BalancedB_tree_leet110 {
    static boolean isBalanced(TreeNode root) {
        return heightOfBtree(root) != -1;
    }

    static int heightOfBtree(TreeNode root) {
        if (root == null) return 0;

        int lh = heightOfBtree(root.left);
        if (lh == -1) return -1;
        int rh = heightOfBtree(root.right);
        if (rh == -1) return -1;
        if (Math.abs(rh - lh) > 1) return -1;
        return 1+ Math.max(lh, rh);
    }
}

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