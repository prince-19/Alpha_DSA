import java.util.*;

public class Build_Tree_Preorder{
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // lec-5
    static class BinaryTree { //Time complexity = O(n)
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

          // lec-6
        public static void preorder(Node root){ //T.C = O(n)
            if(root == null){
             return;
             }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // lec - 7    T.C = O(n)
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        // lec-8
        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        //lec-9
        //level order Traversal
        // T.C = O(n)
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else{
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                         q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

  
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //lec-5
        //System.out.println(root.data);

        //lec-6  T.C = O(n)
        tree.preorder(root);

        System.out.println();

        //lec-7
        tree.inorder(root);

        System.out.println();

        //lec-8
        tree.postorder(root);

        System.out.println();

        //lec-9
        tree.levelOrder(root);

    }
}