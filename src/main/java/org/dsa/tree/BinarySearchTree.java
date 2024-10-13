package org.dsa.tree;

public class BinarySearchTree {

    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            left = null;
            right =null;
        }
    }

    BinarySearchTree(){
        root = null;
    }
    BinarySearchTree(int data){
        root = new Node(data);
    }

    //insert
    public void insert(int data){
        root = insert(data, root);
    }

    private Node insert(int data, Node root){

        if(root==null){
            return new Node(data);
        }
        if(data < root.data){
          root.left =  insert(data, root.left);
        }
        else if (data > root.data){
          root.right =  insert(data, root.right);
        }

        return root;
    }

    //traverse
    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node){
        if(node==null)
            return;
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }

    //delete
    public void delete(int data){
      root =  delete(data, this.root);
    }

    private Node delete(int data, Node root){

        if(root == null){
            return null;
        }

        if(data < root.data){
         root.left =   delete(data, root.left);
        }
        else if(data > root.data){
         root.right =  delete(data, root.right);
        }

        //having single child or no child
        if(root.right==null){
            return root.left;
        } else if (root.left==null) {
            return root.right;
        }

        //having 2 child
       int minElement = findMinElement(root.right);
        root.data=minElement;
        root.right = delete(minElement,root.right);

        return root;
    }

    private int findMinElement(Node node) {
        while (node.left != null) {
            node = node.left; // Traverse to the leftmost node
        }
        return node.data; // Return the minimum value
    }

}






