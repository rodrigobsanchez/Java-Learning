package com.sancholand.randomstuff;
import java.util.LinkedList;


// QUEUE = FIRST IN, FIRST OUT.
public class Queuey {

	
	LinkedList queue;
	
	
	public Queuey() {
		
	    queue =  new LinkedList();
	}
	
	
	//cecking if the queue is empty?
	public boolean isEmpty() {
		
		return queue.isEmpty();
		
	}
	
	// Size of our queue.
	public int size() {
		return queue.size();
	}
	
	// Enqueuing (enfileirando) an Item... adding to the last position.
	public void enqueue(String n) {
		
		queue.addLast(n);
	}
	
	//Dequeuing an item....removing from queue.
	public String dequeue() {
		
		//cant turn object into int...that`s why casting...
		// remove 0 (fist position) because in QUEUE the behavior is 'First IN, FIST OUT'
		return (String) queue.remove(0);
	}
	
	public String lookAtFirst() {
		return (String) queue.get(0);
		
	}
	public static void main(String[] args) {
		Queuey test = new Queuey();
		
		test.enqueue("Hi");
		test.enqueue("there.");
		
		
		//Remove first element of QUEUE
		System.out.print(test.dequeue());
		// REMOVE THE NEXT ONE...which is now the first.
		System.out.print(" ");
		System.out.print(test.dequeue());
		
		
		
		
		//test.enqueue(5);
		//test.enqueue(7);
		//test.enqueue(6);
		//System.out.println("First out: "+ test.dequeue());
		//System.out.println("Peek 2nd item: "+ test.lookAtFirst());
		//System.out.println("Second out: "+ test.dequeue());
		//System.out.println("Third out: "+ test.dequeue());
		
	}
 	
		
	}

