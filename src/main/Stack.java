package main;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> implements Iterable<T> {

	private LinkedList<T> list = new LinkedList<T>();

	public Stack() {
	}

	public Stack(T firstElement) {
		push(firstElement);
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void push(T element) {
		list.addLast(element);
	}

	public T pop() {
		throwExceptionIfStackIsEmpty();
		return list.removeLast();
	}

	public T peek() {
		throwExceptionIfStackIsEmpty();
		return list.peekLast();
	}

	private void throwExceptionIfStackIsEmpty() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

}
