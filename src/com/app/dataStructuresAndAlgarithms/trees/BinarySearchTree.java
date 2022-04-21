package com.app.dataStructuresAndAlgarithms.trees;

public class BinarySearchTree {
 private TreeNode root;
     private class TreeNode{
    	 private int data;
    	 private TreeNode left;
    	 private TreeNode right;
    	 public TreeNode(int data) {
    		 this.data=data;
    	 }
     }
     public void insert(int value) {
 		root = insert(root, value);
 	}
 	
 	public TreeNode insert(TreeNode root, int value) {
 		if(root == null) {
 			root = new TreeNode(value);
 			return root;
 		}
 		
 		if(value < root.data) {
 			root.left = insert(root.left, value);
 		} else {
 			root.right = insert(root.right, value);
 		}
 		return root;
 	}
		
	public void inOrder() {
		inOrder(root);
	}
	private void inOrder(TreeNode root) {
		if(root == null) {
			return ;
		}
		 inOrder(root.left);
		 System.out.println(root.data+" ");
		 inOrder(root.right);
		
	}
	public TreeNode searchKey(int key) {
		return searchKey(root,key);
	}
	private TreeNode searchKey(TreeNode root, int key) {
		if(root == null || root.data == key) {
			return root;
		}
		if(key<root.data) {
			return searchKey(root.left,key);
		}else {
			return searchKey(root.right,key);
		}
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(1);
		
		bst.inOrder();
		
		System.out.println();
		
		if(null != bst.searchKey(1)) {
			System.out.println("Key found !!!");
		} else {
			System.out.println("Key not found !!!");
		}
	}
     
}
