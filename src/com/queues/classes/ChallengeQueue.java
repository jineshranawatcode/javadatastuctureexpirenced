package com.queues.classes;

import java.util.NoSuchElementException;

/**
 *
 *
 */
public class ChallengeQueue {

	private String[] queue;
	private int front;
	private int back;

	/**
	 * @param capacity
	 */
	public ChallengeQueue(int capacity) {
		queue = new String[capacity];
	}

	/**
	 * @param String
	 */
	public void add(String String) {
		if (back == queue.length) {
			String[] newArray = new String[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;
		}

		queue[back] = String;
		back++;
	}

	/**
	 * @return
	 */
	public String remove() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}

		String String = queue[front];
		queue[front] = null;
		front++;
		if (size() == 0) {
			front = 0;
			back = 0;
		}

		return String;
	}

	/**
	 * @return
	 */
	public String peek() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}

		return queue[front];
	}

	/**
	 * @return
	 */
	public int size() {
		return back - front;
	}

	/**
	 * 
	 */
	public void printQueue() {
		for (int i = front; i < back; i++) {

		}
	}

}
