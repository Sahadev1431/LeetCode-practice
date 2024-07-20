public class DiameterOfB_tree_leet543 {

    static int diameterOfBinaryTree(TreeNode root) {
        int [] diameter = new int[1];
        diameterOfBinaryTreeFind(root, diameter);
        return diameter[0];
    }
    static int diameterOfBinaryTreeFind(TreeNode root,int[] diameter) {
        if (root == null) return 0;

        int lh = diameterOfBinaryTreeFind(root.left,diameter);
        int rh = diameterOfBinaryTreeFind(root.right,diameter);

        diameter[0] = Math.max(diameter[0], lh + rh);

        return 1 + Math.max(lh, rh);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
