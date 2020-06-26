package Algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node right, left;

    Node(int key) {
        data = key;
        right = left = null;
    }
}

class Trees {

    Node root;

    Trees() {
        root = null;
    }

    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    int height(Node root) {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = 1 + height(root.left);
            int rheight = 1 + height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight);
            else return (rheight);
        }
    }

    void printBFSLevels(Node root) {
        int height = height(root);
        for (int i = 1; i <= height; i++) {
            printBFS(root, i);
        }
    }

    void printBFS(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printBFS(root.left, level - 1);
            printBFS(root.right, level - 1);
        }
    }

    Queue<Integer> printQueue(Node node) {
        Queue<Node> queue = new LinkedList<>();
        Queue<Integer> integers = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node temp = queue.peek();
            ArrayList<Integer> arrayList = new ArrayList<>();
            integers.add(temp.data);
            arrayList.add(temp.data);
            queue.remove();
            if (temp.left == null) {
                integers.add(-1);
            } else {
                queue.add(temp.left);
            }
            if (temp.right == null) {
                integers.add(-1);
            } else {
                queue.add(temp.right);

            }

        }

        System.out.println(integers.toString());
        return integers;
    }

    boolean isSameTree(Node p, Node q) {

        Queue<Integer> p1 = printQueue(p);
        Queue<Integer> q1 = printQueue(q);
        return p1.equals(q1);
    }


    void printSameTree(Node p, Node q) {

        if (p == null & q == null) {
            return;
        }
        System.out.println(p.data + "  " + q.data);
        printSameTree(p.left, q.left);
        printSameTree(p.right, q.right);

    }

    void printSample(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right != null)
            System.out.println(root.data);
        printSample(root.right);
        printSample(root.left);

    }


}

public class TreeImpl {
    public static void main(String[] args) {
        Trees tree = new Trees();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.right = new Node(8);
        tree.root.left.left.right.left = new Node(9);
        tree.root.left.left.right.left.right = new Node(10);
        tree.root.left.left.left.left = new Node(7);
//
//        tree.inorder(tree.root);
//        System.out.println();
//        tree.preorder(tree.root);
//        System.out.println();
//        tree.postorder(tree.root);
//        System.out.println();
//        System.out.println(tree.height(tree.root));
//        tree.printBFSLevels(tree.root);
//        System.out.println();
//        tree.printQueue(tree.root);


        Trees tree1 = new Trees();
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);
        tree1.root.right = new Node(3);
        tree1.root.right.left = new Node(6);
        tree1.root.right.right = new Node(7);


        Trees tree2 = new Trees();
        tree2.root = new Node(1);
        tree2.root.left = new Node(2);
        tree2.root.left.left = new Node(4);
        tree2.root.left.right = new Node(5);
        tree2.root.right = new Node(3);
        tree2.root.right.left = new Node(6);
        tree2.root.right.right = new Node(7);

//        tree1.printSameTree(tree1.root, tree2.root);
        tree1.printSample(tree1.root);
    }
}
