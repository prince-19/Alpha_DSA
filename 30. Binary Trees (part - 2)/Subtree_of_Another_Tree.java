import java.util.*;

public class Subtree_of_Another_Tree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // lec-10   T.C = O(n)
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    //lec-11
    //Count of Nodes
    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    //lec-12 
    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    //B.T part-2 lec-1
    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = diameter2(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter2(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    //bt-2 lec-4 
    public static boolean isIdentical(Node node, Node subRoot){ // we will use non-identical conditions to identify if any rule violates we will return false
        if(node == null && subRoot == null){
            return true;
        } else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }



    public static boolean isSubtree(Node root, Node subRoot) {
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        // boolean leftAns = isSubtree(root.left, subRoot); //lsubtree -> true
        // boolean rightAns = isSubtree(root.right, subRoot);

        // return leftAns || rightAns;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); 
    }

    // B.T part-2  lec-7
    // Top view of a tree

    static class Info1{
        Node node;
        int hd;

        public Info1(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        //Level Order
        Queue<Info1> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info1(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info1 curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.hd)){ //first time my hd is occuring
                map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null){
                q.add(new Info1(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                q.add(new Info1(curr.node.right, curr.hd+1));
                max = Math.max(max, curr.hd+1);
                }
            }
        }

        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
         /*
                    1
                   /  \
                  2    3
                 / \  / \
                4  5 6   7

          */

          Node root = new Node(1);
          root.left = new Node(2);
          root.right = new Node(3);
          root.left.left = new Node(4);
          root.left.right = new Node(5);
          root.right.left = new Node(6);
          root.right.right = new Node(7);

        /*
                    2
                   / \
                  4   5
         
         */

         Node subRoot = new Node(2);
         subRoot.left = new Node(4);
         subRoot.right = new Node(5);

         //B.T part-2 lec-4
         //System.out.println(isSubtree(root, subRoot));

         topView(root);
    }
}
