package com.stacks.classes;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * this class is actually a wrapper class; the reason why we are not just using
 * a LinkedList directly as our stack is because we want to restrict access to
 * the list's method to only push(), pop(), and peek()
 *
 *
 *
 */
public class LinkedStack {

	// NOTE: this class below is a Doubly Linked List class, even though our
	// stack is a singly linked list
	//composition in java
	private LinkedList<Employee> stack;

	/**
	 *
	 */
	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}

	/**
	 * @param employee
	 */
	public void push(Employee employee) {
		stack.push(employee);
	}

	/**
	 * @return
	 */
	public Employee pop() {
		return stack.pop();
	}

	/**
	 * @return
	 */
	public Employee peek() {
		return stack.peek();
	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	/**
	 *
	 */
	public void printStack() {
		ListIterator<Employee> iterator = stack.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
