package Contest;
import java.util.*;

public class bst{
    /**
     * 
     * @param root      Root Node
     * @param k         Minimum difference in height of subtrees for uneven node
     * @return          Number of uneven nodes
     */
    static int ans=0;
    public static int countUneven(Node root, int k){
        if(root==null)return 0;
        int left = countUneven(root.left,k)+1;
        int right = countUneven(root.right,k)+1;
        if(Math.abs(left-right)>=k) {
            ans++;
        }
        return Math.max(left,right);
    }
    public static Node createTree(int a[], int i){
        if(i >= a.length || a[i] == -1) return null;
        Node newnode = new Node(a[i]);
        newnode.left = createTree(a, 2*i+1);
        newnode.right = createTree(a, 2*i+2);
        return newnode;
    }
    public static void main(String args[]){
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        sc.close();
        Node root = createTree(a, 0);
        ans=0;
        countUneven(root, k);
        System.out.println(ans);
    }
}

class Node {
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
};