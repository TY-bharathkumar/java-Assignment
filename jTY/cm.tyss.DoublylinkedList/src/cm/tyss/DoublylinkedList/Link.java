package cm.tyss.DoublylinkedList;

public class Link {
	private int data;     //private data which is restricted to the particular class->which indicate the data need to insert in a doubly linked List
	public Link previous; // class variable previous   ->which indicate the previous address with in a node 
	public Link next;     // class variable next       ->which indicate the next address with in a node
	/* we are creating a node with 
	 * previous address null ->means it does not have any reference to the previous 
	 * this.data =date which points to the current object to insert into the dll
	 * next address to null -> means it does not have any reference
	 * */
	public Link(int data){
		previous=null;
		this.data=data;
		next=null;
	}
	/*this create a node
	 * previous -> node address point to the (before node) next address
	 * data is pointing to the present node of the doubly linked list
	 * next ->indicates points to the (next node) previous address
	 * */
	public Link(Link previous,int data,Link next){
		this.previous=previous;
		this.data=data;
		this.next=next;
	}
	public int data(){// this method returns the data present in the doubly linked list
		return data;
	}
}
