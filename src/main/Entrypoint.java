package main;

import javax.sound.midi.Soundbank;

public class Entrypoint {

	public static void main(String[] args) {
		Stack stack=new Stack<Integer>(1);
		stack.push(2);
		stack.push(3);
		System.out.println("The element poped is :"+stack.pop());
		System.out.println("Current size after pop operation is "+stack.size());

	}

}
