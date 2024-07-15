package Trees;
import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
    }
}

public class levelOrder { 
    public static List<List<Integer>> level(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int x = q.size();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                TreeNode curr = q.poll();
                l.add(curr.data);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            ans.add(new ArrayList<>(l));
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result = level(root);
        for (List<Integer> l : result) {
            System.out.println(l);
        }
    } 
}
