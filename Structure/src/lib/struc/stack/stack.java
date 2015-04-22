package lib.struc.stack;


import lib.struc.linkedList.hLinkedList;
import lib.struc.def.def;

public class stack {
	
	private hLinkedList linkedList;
	
	public stack(){
		linkedList = new hLinkedList();		
	}
	
	public boolean isEmpty(){
		if (linkedList.getSize() == def.EMPTY)
			return true;
		
		return false;
		
	}
	
	public void push(Object data){
		linkedList.add(data);
	}
	
	public Object pop(){
		
		if(isEmpty() == false)
			return linkedList.removeLast();
		
		throw new NullPointerException("No Space In Stack");
	}
	
	public String toString(){
		return linkedList.toString();
	}
	
}
