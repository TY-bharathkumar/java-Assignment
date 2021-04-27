package com.linkedlist;

public class Linkedlist {
	private Link head;
	int count=0;
	public  Linkedlist(){
		this.head=head;
	}
	public void add(int i){
		Link newlink=new Link(i,null);
		newlink.next=head;
		head=newlink;
		count++;
	}
	/*public Object remove(){
		if(head==null)
			return 0;
		else{
			head.next=null;
		}
		return count--; 

	}*/
	public int size(){
		return count;
	}
	public void print(){
		Link current=head;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}
	public static void main(String[] args) {
		Linkedlist ll=new Linkedlist();
		ll.add(5);
		ll.add(20);
		ll.add(25);
		ll.add(36);
		//ll.remove();
		System.out.println("size of the array "+ll.size());
		ll.print();
	}
}
