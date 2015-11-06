package linkedlists;

public class MyLinkedList 
{
	private MyLinkedListNode head;

	public MyLinkedList()
	{
		head = null;
	}

	// First In, Last Out
	public void push(int data){
		MyLinkedListNode newNode = new MyLinkedListNode(data);
		MyLinkedListNode temp = head;
		head = newNode;
		head.nextNode = temp;
	}
	public int pop()
	{
		int data = -1;
		if(head == null)
		{
			System.out.println("Stack Under flow, returning -1");
			return -1;
		}
		else
		{
			MyLinkedListNode  top = head;
			while( top.nextNode != null)
			{
				
				top = top.nextNode;
			}
			data = top.data;
			top = null;
		}
		return data;

	}
	//Last in, Last Out 
	public void enqueue(int data)
	{
		MyLinkedListNode newNode = new MyLinkedListNode(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			MyLinkedListNode current = head;
			while( (current.nextNode!=null))
			{
				current = current.nextNode;
			}
			current.nextNode = newNode;
		}
	}
	public int dequeue()
	{
		int data = -1;
		if(head != null)
		{
			data = head.data;
			head = head.nextNode;
		}
		else
		{
			System.out.println("Queue is empty, returning -1");
		}
		return data;
	}

	public void printLinkedList()
	{
		System.out.println("\nMy LinkedList has following data:");
		MyLinkedListNode current = head;
		while(current != null)
		{
			System.out.print(current.data + "\t");
			current = current.nextNode;
		}
	}
	
	public void reverse()
	{
		/**
		 * Idea is to have another head node  which points to another list.
		 * Remove element from current list, append this element to the top of the new list.
		 * pop() from original list
		 * push() into new list
		 */
		MyLinkedListNode reverseHead=null,temp;
		while (head != null)
		{
			temp = reverseHead;
			reverseHead = head; //similar to pop
			head = head.nextNode; // similar to pop
			reverseHead.nextNode  = temp;  // similar to pushing
		}
		head = reverseHead;
	}
	
	public boolean isListCircular()
	{
		/**
		 *  1->2->3->4->1
		 *  or 1->2->3->4->2
		 *  or 1
		 *  or empty
		 *
		 */
		MyLinkedListNode current=null,faster=null;
		current = faster= head;
		
		while( (faster !=null) && (faster.nextNode != null) )
		{
			if(faster.nextNode == current)
			{
				return true;
			}
			faster = faster.nextNode.nextNode;
			current = current.nextNode;
		}
		return false;
	}
	
	public static MyLinkedListNode  mergeLinkedList(MyLinkedListNode L1, MyLinkedListNode L2)
	{
		MyLinkedListNode L3 = L1;
		L1 = L1.next;
		/*L3.next = L2;
		L2 = L2.next;*/
		while( (L2 !=null) || (L1 != null))
		{
			if(L2 != null)
			{
				L3.next = L2;
				L2 = L2.next;
			}
			if(L1 != null)
			{
				L3.next = L1;
				L1 = L1.next;
			}
		}
		return L3;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList mylist = new MyLinkedList();
		mylist.enqueue( 1);
		mylist.enqueue( 2);
		mylist.enqueue( 3);
		mylist.enqueue( 4);
		mylist.enqueue(5);

		mylist.printLinkedList();
		System.out.println("\nDequeue an element from the queue:: " +mylist.dequeue());
		
		System.out.println("\nReverse list");
		mylist.reverse();
		mylist.printLinkedList();

		MyLinkedList mylist2 = new MyLinkedList();
		mylist2.push(11);
		mylist2.push(12);
		mylist2.push(13);
		mylist2.push(14);
		mylist2.printLinkedList();
		System.out.println("\nPop an element from the stack:: " +mylist2.pop());
		System.out.println("Is list 2 cricular::" + mylist2.isListCircular());
		
		
		MyLinkedList mylist3 = new MyLinkedList();
		mylist3.push(40);
		mylist3.push(30);
		mylist3.head.nextNode.nextNode = mylist3.head;
		//mylist3.printLinkedList(); This results in infinite loop.
		System.out.println("Is list 3 cricular::" + mylist3.isListCircular());
		
		MyLinkedList mylist4 = new MyLinkedList();
		MyLinkedListNode node1 = new MyLinkedListNode(501);
		MyLinkedListNode node2 = new MyLinkedListNode(502, node1);
		MyLinkedListNode node3 = new MyLinkedListNode(503,node2);
		MyLinkedListNode node4 = new MyLinkedListNode(504,node3);
		node1.nextNode = node3;
		mylist4.head = node4;
		//mylist3.printLinkedList(); This results in infinite loop.
		System.out.println("Is list 4 cricular::" + mylist4.isListCircular());
		
		MyLinkedList mylist5 = new MyLinkedList();
		mylist5.push(7);
		System.out.println("Is list 5 cricular::" + mylist5.isListCircular());
		mylist5.pop();
		System.out.println("Is list 5 cricular::" + mylist5.isListCircular());
		
		MyLinkedList mylist6 =  MyLinkedList.mergeLinkedList(mylist1,mylist2);
		mylist6.printLinkedList();
	}

}
