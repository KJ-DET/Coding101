package linkedlists;

public class MyLinkedListNode {

	protected int data;
	protected MyLinkedListNode nextNode;
	
	public MyLinkedListNode (int data)
	{
		this.data = data;
		this.nextNode = null;
	}
	public MyLinkedListNode(int data, MyLinkedListNode nextNode)
	{
		this.data = data;
		this.nextNode = nextNode;
	}
	
}
