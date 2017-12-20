package org.concept.kittys.calculations.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Node> treeNodes = new LinkedList<Node>();
		for(int i=0;i<N-1;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			Node aNode = new Node(a);
			Node bNode = new Node(b);
			if(!treeNodes.contains(aNode)){
				treeNodes.add(aNode);
			}
			int index = treeNodes.indexOf(aNode);
			treeNodes.add(bNode);
			if(index!=-1){
				treeNodes.get(index).nextNodes.add(bNode);
			}
		}
		Node root = treeNodes.get(0);
		/*for(int i=0;i<K;i++){
			int noOfArgument = sc.nextInt();
			if(noOfArgument==1){
				System.out.println(0);
			}
			else{
				queryes(noOfArgument, sc, root);
			}

		}*/
		System.out.println(aNodeDistance(5, root));
	}

	public static void queryes(int noOfArgument,Scanner sc,Node root){
		Set<Integer> nodes = new HashSet<>();
		for(int i=0;i<noOfArgument;i++){
			nodes.add(sc.nextInt());
		}
	}

	public static void calculate(Node root,Set<Integer> nodes){
		Node current = root;
		int sum = 0;
		int[] allEdge = new int[nodes.size()];
		for (int i = 0; i < allEdge.length; i++) {
			int aNode = allEdge[i];
			int nextNode = i+1;
			while(nextNode!=allEdge.length-1){
				int bNode = allEdge[nextNode];
				sum = sum + distance(aNode, bNode, current);
			}
		}
	}

	public static int aNodeDistance(int aNode,Node root){
		int aDistance = 0;
		Node currentNode = root;
		if(aNode==root.data){
			return aDistance;
		}
		//if(aNode!=currentNode.data){
			
			if(!currentNode.nextNodes.isEmpty()){
				for (Node node : currentNode.nextNodes) {
					if(node.data==aNode){
						return aDistance;
					}
					aDistance = aDistance+ aNodeDistance(aNode, node);
				}
				aDistance++;
			}

		//}


		return aDistance;

	}

	public static int distance(int aNode,int bNode, Node root){
		int aDistance = 0;
		int bDistance = 0;
		Node cuNode = root;
		while(aNode!=cuNode.data){
			for (Node node : cuNode.nextNodes) {
				if(node.data==aNode){
					aDistance++;
					break;
				}
				cuNode = node;
			}
		}


		return aDistance+bDistance;
	}


}
