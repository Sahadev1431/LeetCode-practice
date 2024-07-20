public class MaxPathSum_leet124 {
    static int maxPathSum(TreeNode root) {
        int [] sum = new int[1];
        sum[0] = Integer.MIN_VALUE;
        calulateSum(root,sum);
        return sum[0];
    }
    static int calulateSum(TreeNode root,int [] sum) {
        if (root == null) return 0;

        int left = Math.max(0,calulateSum(root.left,sum));
        int right = Math.max(0,calulateSum(root.right,sum));

        sum[0] = Math.max(sum[0], root.val + left +right);
        return Math.max(left, right) + root.val;
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
