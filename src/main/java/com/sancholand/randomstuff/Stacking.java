package com.sancholand.randomstuff;

import java.util.LinkedList;
import java.util.Stack;

// STACK = LAST IN , FISRT OUT.
public class Stacking {
	
	LinkedList queue;
	
	
	public Stacking() {
		
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
		Stack<String> stacky = new Stack<>();
		// Se fosse uma Queue iveteria-se a linha 53 com a 52....
		
		//STACK LAST IN FIRST OUT.... 'Hi' was the last added so it will be the first to leave...
		stacky.push("There");
		stacky.push("Hi");
		System.out.println("Size: " + stacky.size());
		System.out.println("Peek: " + stacky.peek());
		System.out.print(stacky.pop() + " ");
		System.out.println(stacky.pop() + "! ");
	}

}
