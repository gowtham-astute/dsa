package org.dsa.tree;

public class AVLTree {

    Node root;
    class Node{
        int key;
        Node left,right;
        int height;

        Node(int data){
            key = data;
            left = right = null;
            height = 0;
        }
    }

    AVLTree(){
        root = null;
    }

    AVLTree(int data){
       root =  new Node(data);
    }

    public void insert(int data){
       root = insert(root,data);
    }

    private Node insert(Node root, int data){

        if(root == null){
            return new Node(data);
        }
        if(data < root.key){
           root.left = insert(root.left,data);
        }
        else if(data > root.key){
            root. right = insert(root.right, data);
        }

        int rootheight = 1 + (getMaxHeight(getHeight(root.left), getHeight(root.right)));

        //LL case
        if(rootheight > 1 && data < root.left.key){

        }

        //RR case
        if(rootheight < -1 && ){

        }

        //LR case
        if(rootheight > 1 && data > root.left.key){

        }

        //RL case
        if(rootheight < -1 && ){

        }

        return root;
    }

    private int getMaxHeight(int left, int right) {

        return left>right?left:right;
    }

    private int getHeight(Node node){
        return node.height;
    }


}
