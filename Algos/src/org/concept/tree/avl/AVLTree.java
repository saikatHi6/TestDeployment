package org.concept.tree.avl;

public class AVLTree {


	public static Node insert(Node root,int val){

		//create new node
		if(root==null){
			Node node = new Node();
			node.val = val;
			node.ht = 1 + max(height(node.left), height(node.right));
			return node;
		}

		//insert node into parent node
		if(root.val>val){
			root.left =  insert(root.left, val);
		}
		else if(root.val<val){
			root.right = insert(root.right, val);
		}
		else{
			return root;
		}

		//update height
		

		//get balance
		int balance = getBalance(root);

		// left rotation balance greater than one and value less than root val
		if(balance>1 && val<root.left.val){
			return rightRotaion(root);
		}

		if(balance<-1 && val>root.right.val){
			return leftRotation(root);
		}

		if(balance>1 && val>root.left.val){
			root.left = leftRotation(root);
			return rightRotaion(root);
		}

		if(balance<-1 && val<root.right.val){
			root.right = rightRotaion(root);
			return leftRotation(root);
		}


		return root;
	}

	public static int height(Node root){
		int ht = 0;
		if(root!=null){
			return root.ht;
		}
		return ht;
	}

	public static int max(int a, int b){
		if(a>b){
			return a;
		}
		else {
			return b;
		}
	}

	public static int getBalance(Node root){
		if(root!=null){
			return (height(root.left)-height(root.right));
		}
		else{
			return 0;
		}
	}

	public static Node leftRotation(Node root) {
		Node temp = root.right;
		Node tempLeft = temp.left;

		//perform

		temp.left = root;
		root.right = tempLeft;


		temp.ht = max(height(temp.left), height(temp.right));
		root.ht = max(height(root.left), height(root.right));


		return temp;
	}

	public static Node rightRotaion(Node root) {
		Node temp = root.left;
		Node tempRight = temp.right;
		
		//perform
		
		temp.right = root;
		root.left = tempRight;
		
		temp.ht = max(height(temp.left), height(temp.right));
		root.ht = max(height(root.left), height(root.right));
		
		return root;
	}


	/*static Node insert(Node root,int val) {
	       if(root == null) {
	           root = new Node();
	           root.val = val;
	           root.ht = setHeight(root);
	           return root;
	       }
	       if(val <= root.val) {
	           root.left = insert(root.left, val);
	       }
	       else if (val > root.val) {
	           root.right = insert(root.right, val);
	       }
	       int balance = height(root.left) - height(root.right);
	       
	       if(balance > 1) {
	           if(height(root.left.left) >= height(root.left.right)) {
	               root = rightRotation(root);
	           }
	           else {
	               root.left = leftRotation(root.left);
	               root = rightRotation(root);
	           }
	       }
	       else if(balance < -1) {
	           if(height(root.right.right) >= height(root.right.left)) {
	               root = leftRotation(root);
	           }
	           else {
	               root.right = rightRotation(root.right);
	               root = leftRotation(root);
	           }
	       }
	       else {
	           root.ht = setHeight(root);
	       }
	       return root;
	   }

	   private static Node rightRotation(Node root) {
	       Node newRoot = root.left;
	       root.left = newRoot.right;
	       newRoot.right = root;
	       root.ht = setHeight(root);
	       newRoot.ht = setHeight(newRoot);
	       return newRoot;
	   }

	   private static Node leftRotation(Node root) {
	       Node newRoot = root.right;
	       root.right = newRoot.left;
	       newRoot.left = root;
	       root.ht = setHeight(root);
	       newRoot.ht = setHeight(newRoot);
	       return newRoot;
	   }

	   private static int height(Node root) {
	       if(root == null)
	           return -1;
	       else 
	           return root.ht;
	   }

	   private static int setHeight(Node root) {
	       if(root == null) {
	           return -1;
	       } 
	       else {
	           return 1 + Math.max(height(root.left), height(root.right));
	       }
	   }*/

	

	public static void main(String[] args) {

		Node root = null;
		root = createBinaryTree(root, 3);
		createBinaryTree(root, 2);
		createBinaryTree(root, 4);
		createBinaryTree(root, 5);
		Node cuNode = root;
		
		insert(root, 6);
		while(cuNode!=null){
			System.out.println(cuNode.val);
			cuNode = cuNode.right;
		}
		//insert(root, 7);
	}

	public static Node createBinaryTree(Node root,int val){
		Node currenNode = root;
		if(root==null){
			currenNode = create(root, val);
		}
		else{

			if(currenNode.val<val){
				while(currenNode.right!=null){
					currenNode = currenNode.right;
				}
				currenNode.right = create(currenNode.right, val);
				currenNode.right.ht = currenNode.ht+1;
			}
			else{

				while(currenNode.left!=null){
					currenNode = currenNode.left;
				}
				currenNode.left = create(currenNode.left, val);
				currenNode.left.ht = currenNode.ht+1;
			}
		}
		return currenNode;
	}
	
	
	public static Node create(Node root,int val){
		int hight = 1;
		if(root!=null){
			hight = root.ht + 1;
		}
		root = new Node();
		root.val = val;
		root.left = null;
		root.right = null;
		root.ht = hight;
		return root;
	}
	
	/*
	public static Node insert(Node root,int val){

		insertNode(root, val);
		Node currentNode = root;
		while(currentNode!=null){
			if(balanceFactor(currentNode)==-2){
				leftRotation(root,currentNode);
			}
			else if(balanceFactor(currentNode)==2){
				rightRotation(root,currentNode);
			}
			currentNode = currentNode.right;
		}

		return currentNode;
	}


	public static void rightTraversal(Node root){
		if(root!=null){
			rightTraversal(root.right);
		}
	}


	public static Node insertNode(Node root,int val){
		Node currentNode = root;
		if(root==null){
			currentNode = create(root, val);
		}
		else{
			if(currentNode.val<val){
				if(currentNode.right!=null){
					insertNode(currentNode.right, val);
				}
				else{
					Node newNode = create(currentNode.right, val);
					currentNode.right = newNode;
					currentNode.right.ht = currentNode.ht+1;
					//currentNode = currentNode.right;
				}
			}
			else{

				if(currentNode.left!=null){
					 insertNode(currentNode.left, val);
				}
				else{
					Node newNode = create(currentNode.left, val);
					currentNode.left = newNode;
					currentNode.left.ht = currentNode.ht+1;
					//currentNode = currentNode.left;
				}

			}
		}
		return currentNode;
	}

	

	public static int balanceFactor(Node root) {
		int lBf = 0;
		int rBt = 0;
		Node cuNode = root;
		if((cuNode.left==null && cuNode.right == null)){
			return 0;
		}
		if(cuNode.left!=null){
			while(cuNode.left!=null){
				cuNode = cuNode.left;
				lBf++;
			}
		}
		cuNode = root;
		if(cuNode.right!=null){
			while(cuNode.right!=null){
				cuNode = cuNode.right;
				rBt++;
			}
		}
		return lBf-rBt;
	}

	public static void leftRotation(Node root,Node cuNode){
		if(cuNode!=null && root!=null){
			Node currentNode = root;
			while(currentNode!=null){
				if(currentNode.right.val == cuNode.val){
					currentNode.right = cuNode.right;
					cuNode.left = cuNode;
					cuNode.right = null;
					break;
				}
				currentNode = currentNode.right;
			}
		}
	}

	public static void rightRotation(Node root,Node cuNode){

	}

	public static void leftRightRotation(Node root,Node cuNode){

	}

	public static void rightLeftRotation(Node root,Node cuNode){

	}

	 */}
