package org.algo.basic.implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkList {

	public static Node removeDuplicates(Node head) {
		HashSet<Integer> hs = new HashSet<>();
	     
        /* Pick elements one by one */
		Node current = head;
		Node prev = null;
        while (current != null) 
        {
            int curval = current.data;
             
             // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
          
        }
        return head; 
	}
	
	
	public static Node removeDuplicatesUsingRecursion(Node head){
		
		if ( head == null ) return null;
		  Node nextItem = head.next;
		  while ( nextItem != null && head.data == nextItem.data ) {
		    nextItem = nextItem.next;
		  }
		  head.next = removeDuplicatesUsingRecursion( nextItem );
		  return head;
		
		
	}
	
	

	public static  Node insert(Node head,int data)
	{
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
	public static void display(Node head)
	{
		Node start=head;
		while(start!=null)
		{
			System.out.print(start.data+" ");
			start=start.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		int T=sc.nextInt();
		while(T-->0){
			int ele=sc.nextInt();
			head=insert(head,ele);
		}
		//head=removeDuplicates(head);
		
		//head = removeDuplicatesUsingRecursion(head);
		
		//display(head);
		//display(reverse(head));
		//recursiveDisplay(head);
		recursiveReverseDisplay(head);
	}
	
	
	public static Node reverse(Node head){
		Node prev=null;
		Node next = null;
		Node current = head;
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	public static Node recursiveDisplay(Node head){
		if(head==null){
			return head;
		}
		else{
			System.out.println(head.data);
			return recursiveDisplay(head.next);
		}
	}
	
	public static void recursiveReverseDisplay(Node head){
		if(head==null){
			return ;
		}

		recursiveReverseDisplay(head.next);
		System.out.println(head.data);
	}
	
}
