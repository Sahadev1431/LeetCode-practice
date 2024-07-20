import java.util.*;

public class ZigZagtree_leet103 {
    static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> wrapList = new ArrayList<>();
        if (root == null) return wrapList;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean LtoR = true;
        
        while (!queue.isEmpty()) {
            List<Integer>list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                
                int index = LtoR ? i : (size - i -1);
                list.add(index,node.val);
                if (node.left != null) queue.add(root.left);
                if (node.right != null) queue.add(root.right);
            }
            wrapList.add(list);
            LtoR = !LtoR;
        }
        return wrapList;    
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