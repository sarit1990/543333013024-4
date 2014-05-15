package com.rmuti.LAB3;

import com.rmuti.LAB3.BinaryTree.Node;

public class TestBinaryTree {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		Node right3 = new Node("f",null,null);
		Node right2 = new Node("e",null,null);
		Node left2 = new Node("d", null, null);
		Node left1 = new Node("b", left2, right2);
		Node right1 = new Node("c",null, right3);
		Node root = new Node("a", left1, right1);
		binaryTree.root = root;
		System.out.println(binaryTree.numberNodes());
	}
}
