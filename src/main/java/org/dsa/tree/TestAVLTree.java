package org.dsa.tree;

public class TestAVLTree {

    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        avlTree.insert(45);
        avlTree.insert(55);
        avlTree.insert(3);
        avlTree.insert(12);
        avlTree.insert(63);
        avlTree.insert(78);
        avlTree.insert(14);

        avlTree.inOrderTraversal();
        System.out.println("Before Insert remaining element "+avlTree.root.key);

        avlTree.insert(23);
        avlTree.insert(18);
        avlTree.insert(50);

        avlTree.inOrderTraversal();
        System.out.println("After Insert remaining element "+avlTree.root.key);
    }
}
