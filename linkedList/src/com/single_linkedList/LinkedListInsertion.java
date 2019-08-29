package com.single_linkedList;
public class LinkedListInsertion {
	class Node{
		String data;
		Node next;
		Node(String data)
		{
			this.data=data;
			next=null;
		}
	}
	static Node head=null;
	public static void main(String[] args) {
		LinkedListInsertion lli=new LinkedListInsertion();
		lli.addEnd("Kumar");
		lli.addFront("Sathish");
		lli.addAtN("raasalgul",0);
		show(head);
	}
	private void addAtN(String data, int n) {
		if(n==0)
		{
			Node node=new Node(data);
			node.next=head;
			head=node;
			return;
		}
		if(head==null && n!=0)
			return;
		Node temp=head;
		for(int i=1;i<n;i++)
		{
			temp=temp.next;
		}
		Node node=new Node(data);
		node.next=temp.next;
		temp.next=node;
			
	}
	private void addEnd(String data) {
		if(head==null)
		{
			Node node=new Node(data);
			head=node;
			return;
		}
		Node node=new Node(data);
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=node;
	}
	private void addFront(String data) {
		if(head==null)
		{
			Node node=new Node(data);
			head=node;
			return;
		}
		Node node=new Node(data);
		node.next=head;
		head=node;
	}
	private static void show(Node head) {
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
