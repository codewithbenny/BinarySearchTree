package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree =new MyBinarySearchTree<>();
        myBinarySearchTree.insert(20);
        myBinarySearchTree.insert(30);
        myBinarySearchTree.insert(50);
        myBinarySearchTree.insert(60);
        System.out.println(myBinarySearchTree.Search(80));
    }
}
