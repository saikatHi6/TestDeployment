package org.algo.basic.implementation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryNode{
	BinaryNode left,right;
    int data;
    BinaryNode(int data){
        this.data=data;
        left=right=null;
    }
}
public class BinarySearchExample {
	
	/*public static int getHeight(BinaryNode root){
		
		return height(root)-1;
	    }
	
	public static int height(BinaryNode root){
		if(root==null){
			return 0;
		}
		
		int left = height(root.left);
		int right = height(root.right);
		
		return 1 + max(left,right);
		
	}
	
	public static int max(int left,int right){
		if(left>right){
			return left;
		}
		else{
			return right;
		}
	}*/
	
	public static int getHeight(BinaryNode root){
        if (root == null){
            return -1;
        }
        else{
            return 1 + Math.max( getHeight(root.left), getHeight(root.right) );
        }
    }
	
	public static LinkedList<BinaryNode> queue = new LinkedList<BinaryNode>();
	
	public static void levelOrder(BinaryNode root){
		
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode tree = queue.poll();
			System.out.println(tree.data);
			
			if(tree.left!=null){
				queue.add(tree.left);
			}
			if(tree.right!=null){
				queue.add(tree.right);
			}
		}
		
		
		
		
		
		
		
		
		
		/*int h = getHeight(root);
		for (int i = 1; i <= h; i++) {
			levelOrder(root, i);
		}*/
		
		
		
	}
	
	public static void levelOrder(BinaryNode root,int depth){
		if(root==null){
			return;
		}
		if(depth==1){
			System.out.println(root.data);
		}
		else if(depth>1){
			levelOrder(root.left,depth-1);
			levelOrder(root.right, depth-1);
		}
		
	}
	
	
	
	
	
	

	public static BinaryNode insert(BinaryNode root,int data){
        if(root==null){
            return new BinaryNode(data);
        }
        else{
        	BinaryNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            BinaryNode root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            //int height=getHeight(root);
            //System.out.println(height);
            levelOrder(root);
        }

}
