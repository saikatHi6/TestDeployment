package org.algo.basic.implementation;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	
	
	public void  levelOrder(BinaryNode root){
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode peek = queue.poll();
			System.out.println(peek.data);
			if(peek.left!=null){
				queue.add(peek.left);
			}
			if(peek.right!=null){
				queue.add(peek.right);
			}
			
		}
	}
	
	
	

	public static void main(String[] args) {
		
		

	}

}
