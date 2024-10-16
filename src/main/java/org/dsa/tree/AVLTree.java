package org.dsa.tree;

public class AVLTree {

    Node root;

    class Node {
        int key;
        Node left, right;
        int height;

        Node(int data) {
            key = data;
            left = right = null;
            height = 0;
        }
    }

    AVLTree() {
        root = null;
    }

    AVLTree(int data) {
        root = new Node(data);
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {

        if (node == null) {
            return new Node(data);
        }
        if (data < node.key) {
            node.left = insert(node.left, data);
        } else if (data > node.key) {
            node.right = insert(node.right, data);
        }else{
            return node;
        }

        node.height = 1 + (getMaxHeight(getHeight(node.left), getHeight(node.right)));

        int balanceFactor = getBalanceFactor(getHeight(node.left), getHeight(node.right));

        //LL case
        if (balanceFactor > 1 && data < node.left.key) {
           return rightRotate(node);
        }

        //LR case
        if (balanceFactor > 1 && data > node.left.key) {
            node.left = leftRotate(node.left);
           return rightRotate(node);
        }

        //RR case
        if (balanceFactor < -1 && data > node.right.key) {
           return leftRotate(node);
        }

        //RL case
        if (balanceFactor < -1 && data < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private Node leftRotate(Node z) {
        Node y = z.right;
        Node t3 = y.left;
        y.left = z;
        z.right = t3;

        z.height = 1 + (getMaxHeight(getHeight(z.left), getHeight(z.right)));
        y.height = 1 + (getMaxHeight(getHeight(y.left), getHeight(y.right)));
        return y;
    }

    private Node rightRotate(Node z) {
        Node y = z.left;
        Node t3 = y.right;
        y.right = z;
        z.left = t3;
        z.height = 1 + (getMaxHeight(getHeight(z.left), getHeight(z.right)));
        y.height = 1 + (getMaxHeight(getHeight(y.left), getHeight(y.right)));
        return y;
    }


    private int getBalanceFactor(int leftHeight, int rightHeight) {
        return leftHeight - rightHeight;
    }

    private int getMaxHeight(int left, int right) {

        return left > right ? left : right;
    }

    private int getHeight(Node node) {
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node){
        if(node==null)
            return;
        inOrderTraversal(node.left);
        System.out.println(node.key);
        inOrderTraversal(node.right);
    }

}
