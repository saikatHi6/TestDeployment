package org.algo.basic.implementation;

public class QueueImpl {
	
	private int capacity;
	int[] queueArray;
	int front = 0;
	int rear = -1;
	int currentSize = 0;
	
	public QueueImpl(int queueSize){
		this.capacity = capacity;
		queueArray = new int[queueSize];
	}
	
	public void enqueue(int item){
		if(isQueueFull()){
			System.out.println("Queue is overflow!");
		}
		else{
			rear++;
			if(rear==capacity-1){
				rear = 0;
			}
			queueArray[rear] = item;
			currentSize++;
		}
	}
	
	public void dequeue(int item){
		if(isQueueEmpty()){
			System.out.println("Queue is under flow");
		}
		else{
			front++;
			if(front==capacity-1){
				System.out.println("pop opearation done");
				front = 0;
			}
			else{
				System.out.println("pop opearation done");
			}
			currentSize--;
		}
	}
	
	public boolean isQueueFull(){
		boolean status = false;
		if(currentSize == capacity){
			status = true;
		}
		return status;
	}
	
	public boolean isQueueEmpty(){
		boolean status = false;
		if(currentSize==0){
			status = true;
		}
		return status;
	}

}
