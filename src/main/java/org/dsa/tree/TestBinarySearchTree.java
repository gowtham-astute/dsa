package org.dsa.tree;

public class TestBinarySearchTree {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(45);
        bst.insert(55);
        bst.insert(3);
        bst.insert(12);
        bst.insert(63);
        bst.insert(78);
        bst.insert(14);
        bst.insert(23);
        bst.insert(18);
        bst.insert(50);


        bst.inOrderTraversal();
        System.out.println("Before delete root "+bst.root.data);
        bst.delete(45);
        bst.inOrderTraversal();
        System.out.println("After delete root "+bst.root.data);

//        bst.delete(10);
//        bst.inOrderTraversal();
//        System.out.println("After delete root "+bst.root.data);

        bst.delete(50);
        bst.inOrderTraversal();
        System.out.println("After delete root "+bst.root.data);
//
//        bst.delete(3);
//        bst.inOrderTraversal();
//        System.out.println("After delete root "+bst.root.data);
//
//        bst.delete(12);
//        bst.inOrderTraversal();
//        System.out.println("After delete root "+bst.root.data);

    }
}
