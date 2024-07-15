package Trees;
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}


public class maxSumBSTLevel {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxLevelSum(root));
	}
	public static  int maxLevelSum(TreeNode root) {
        if(root == null) return 0; 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int maxSum = Integer.MIN_VALUE;
        int level = 1;
        int currentLevel = 1;
        while(!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null) {
                    q.add(node.left);
                }
                if(node.right != null) {
                    q.add(node.right);
                }
            }
            if(sum > maxSum) {
                maxSum = sum;
                level = currentLevel;
            }
            currentLevel++;
        }

        return level;
    }
}
