package com.linkedlist;

public class Link {
	int data;
	Link next;
	public Link(int data){
		this.data=data;
	}
	public Link(int data,Link next){
		this.data=data;
		this.next=next;
	}
	public int size(){
		return data;
	}
}
