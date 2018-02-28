package org.algo.digitaldomain;

import java.util.Scanner;



public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int noOfQuery = sc.nextInt();
		for(int i=0;i<noOfQuery;i++){
			Node head = null;
			int arraysize = sc.nextInt();
			for(int j=0;j<arraysize;j++){
				int no = sc.nextInt();
				head=insert(no,head);
			}
			if(arraysize%2==0){
				int mid = arraysize/2;
				int midValue =  fetchDataByPosition(mid, head);
				int afterMidValue = fetchDataByPosition(mid+1, head);
				head = removeElement(head);
				head = insertAfterZero(head, midValue+afterMidValue);
				display(head);
				
			}
			else{
				int mid = arraysize/2+1;
				int midValue = fetchDataByPosition(mid, head);
				head = removeElement(head);
				head = insertAfterZero(head, midValue);
				display(head);
			}
			
		}
	}

	public static void display(Node head)
	{
		Node start=head;
		while(start!=null)
		{
			System.out.print(start.data+" ");
			start=start.next;
		}
		System.out.println();
	}
	
	
	public static Node insertAfterZero(Node head,int midValue){
		Node current = head;
		while(current!=null){
			
			if(current.data==0){
				Node newNode = new Node(midValue);
				Node temp = current.next;
				current.next = newNode;
				newNode.next = temp;
			}
			
			current = current.next;
		}
		
		return head;
	}
	
	public static Node removeElement(Node head){
		Node current = head;
		Node prev = null;
		int secondPositiveNo = 0;
		int firstNegative = 0;
		while(current!=null){
			if(current.data<0 && firstNegative==0){
				firstNegative++;
				if(prev==null){
					head = current.next;
				}
				else{
					prev.next = current.next;
				}
				
			}
			if(current.data>0 && secondPositiveNo==1){
				prev.next = current.next;
			}
			else{
				prev = current;
			}
			if(current.data>0)
				secondPositiveNo++;
			current = current.next;
		}
		return head;
		
	}
	
	
	public static int fetchDataByPosition(int position,Node head){
		if(head==null){
			return 0;
		}
		Node current = head;
		for(int i=0;i<position-1;i++){
			current = current.next;
		}
		return current.data;
	}
	
	public static Node insert(int data,Node head){

		Node p=new Node(data);			
		if(head==null)
			head=p;
		else if(head.next==null)
			head.next=p;
		else
		{
			Node start=head;
			while(start.next!=null)
				start=start.next;
			start.next=p;

		}
		return head;
	
	}
	

	
}
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
}