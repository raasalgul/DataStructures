package com.single_linkedList;

public class LinkedListDeletion {
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
	private static void show() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		LinkedListDeletion lld=new LinkedListDeletion();
		lld.addFront("Kumar");
		lld.addFront("Sathish");
		lld.addFront("Kumar");
		lld.addFront("Sathish");
		lld.addFront("Kumar");
		lld.addFront("Sathish");
		show();
		System.out.println();
		lld.deleteFront();
		lld.deleteEnd();
		lld.deleteN(3);
		show();
		}
	private void deleteN(int n) {
		if(head==null)
			return;
		if(n==0)
		{
			head=head.next;
		return;
	}
		Node temp=head;
		for(int i=1;i<n;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	private void deleteEnd() {
		if(head==null)
			return;
		Node temp=head,prev=null;
		while(temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
		}
		if(prev==null)
		{
			head=null;
			return;
		}
		prev.next=null;
	}
	private void deleteFront() {
		if(head==null)
			return;
		head=head.next;
	}

}
