package org.concept.swap.node.algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.concept.swap.node.Node;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node root = createnode(1,1);
		
		Queue<Node> treeList = new LinkedList<>();
		Node cuNode = root;
		treeList.offer(root);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			cuNode = treeList.poll();
			int leftNode =  sc.nextInt();
			int rightNode = sc.nextInt();
			cuNode.lNode = createnode(leftNode,cuNode.label+1);
			cuNode.rNode = createnode(rightNode,cuNode.label+1);
			
			if(cuNode.lNode!=null && cuNode.lNode.data!=-1){
				treeList.offer(cuNode.lNode);
			}
			if(cuNode.rNode!=null && cuNode.rNode.data!=-1){
				treeList.offer(cuNode.rNode);
			}
		}
		System.out.println(depth(root));
		int time = sc.nextInt();
		
		for (int i = 0; i < time; i++) {
			swap_print(root, sc.nextInt());
			
		}
	}

	public static Node createnode(int data,int label){
		if(data==-1){
			return null;
		}
		Node node = new Node();
		node.data = data;
		node.rNode = null;
		node.lNode = null;
		node.label = label;
		return node;
	}
	
	public static Node insertNode(Node root,Node lNode,Node rNode){
		
		if(root!=null){
			root.lNode = lNode;
			root.rNode = rNode;
			
		
		}
		return root;
		
		
	}
	
	
	
	public static int depth(Node root){
		int lDepth = 1;
		int rDepth = 1;
		Node lcurrent = root;
		while(lcurrent.lNode!=null){
			lDepth++;
			lcurrent = lcurrent.lNode;
		}
		Node rcurrent = root;
		while(rcurrent.rNode!=null){
			rDepth++;
			rcurrent = rcurrent.rNode;
		}
		if(lDepth>rDepth){
			return lDepth;
		}
		else {
			return rDepth;
		}
		
	}
	
	
	public static void swapNode(Node root,int swapLabel){
		if(root!=null){
			if(root.label%swapLabel==0){
				Node temp = root.lNode;
				root.lNode = root.rNode;
				root.rNode = temp;
			}
			swapNode(root.lNode, swapLabel);
			swapNode(root.rNode, swapLabel);
		}
		
	}
	
	public static void inOrder(Node root){
		if(root!=null){
			inOrder(root.lNode);
			System.out.println(root.data+" ");
			inOrder(root.rNode);
		}
	}
	
	public static void swap_print(Node root,int label){
		swapNode(root, label);
		inOrder(root);
		System.out.println();
	}
}
