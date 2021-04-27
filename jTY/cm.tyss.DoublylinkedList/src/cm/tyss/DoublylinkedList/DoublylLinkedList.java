package cm.tyss.DoublylinkedList;

public class DoublylLinkedList {
	private Link head;
	private int size;
	public DoublylLinkedList(){
		head=null;
		size=0;
	}
	// this method adds the objects at the front
	public void addFront(int data){  
		if(head==null)
			head=new Link(null,data,null);
		else{
			Link newlink=new Link(null,data,head);
			head.previous=newlink;
			head=newlink;
		}
		size++;
	}
	// this method adds the objects from the rear
	public void addRear(int data){          
		if(head==null)
			head=new Link(null, data, null);
		else{
			Link current=head;
			while(current!=null){
				current=current.next;
			}
			Link newlink=new Link(current, data, null);
			current.next=newlink;
			size++;
		}
	}
	//this method removes the objects from the front;
	public void removeFront(){          
		if(head==null)
			return;
		else{
			head=head.next;
			head.previous=null;
			size--;
		}
	}
	//this method removes the objects from the rear;
	public void removeRear(){          
		if(head==null)
			return;
		if(head.next==null){
			head=null;
			size--;
			return;
		}
		Link current=head;
		while(current!=null){
			current=current.next;
		}
		current.next=null;
		size--;
	}
	//this method return the size of the doubly linked list
	public int size(){                
		return size;
	}

	//this method return the elements present in the array
	public void Print(){               
		Link current=head;
		while(current!=null){
			System.out.println(current.data());
			current=current.next;
		}
	}
	public boolean isEmpty(){
		return head==null;
	}
	public static void main(String[] args) {
		DoublylLinkedList dll=new DoublylLinkedList();
		dll.addFront(20);
		dll.addFront(20);
		dll.addFront(20);
		dll.Print();
	}
}
