package com.stack.implementation;

public class Stack {
public class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
	Node head=null;
	public static void main(String[] args) {
		Stack stack=new Stack();
		for(int i=1;i<20;i+=2)
		stack.push(i);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack);
	}

	private int peek() {
		return head.data;
	}

	private int pop() {
		head=head.next;
		return head.data;
	}

	private void push(int data) {
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			return;
		}
		node.next=head;
		head=node;
	}
@Override
public String toString()
{
	String result="[";
	Node temp=head;
	while(temp!=null)
	{
		result+=temp.data+" ";
		temp=temp.next;
	}
	result+="]";
	return result;
	
}

}
