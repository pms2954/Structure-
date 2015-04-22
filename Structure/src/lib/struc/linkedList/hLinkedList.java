package lib.struc.linkedList;

public class hLinkedList {

	private Node header;
	private int size;	
	
	public hLinkedList(){
		header = new Node(null);
		this.size = 0;
	}
	
	//getter 
	public int getSize(){
		return size;
	}
	
	private class Node {
		
		private Object data;	
		private Node next;
		
		Node(Object data){
			this.data = data;
			this.next = null;
		}
	}
	
	/* ���� */
	
	// ����Ʈ ù��° ��ġ�� �����Ѵ�.
	public void addFirst(Object data){
		Node newNode = new Node(data);
		newNode.next = header.next ;
		header.next = newNode;
		size++;	
		//System.out.println(toString() + " Size : " +size);

	}
	
	public void add(int index , Object data){
		if(index == 0){
			addFirst(data);
			return ;
		}
		
		Node newNode = new Node(data);
		Node prevNode = getNode(index);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		size++;
		
		//System.out.println(toString() + " Size : " +size);
	}
	
	public void add(Object data){
		addLast(data);
	}
	
	public void addLast(Object data){
		add(size , data);
	}
	/* ���� �� */
	
	/* ���� */	
	public Object remove(int index){
		
		//index outofBound 
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException("Index : " + index + ", Size : "+ size );
		
		// 0�ΰ�� 
		if(index == 0)
			index++;
		
		Node prevNode = getNode(index-1);
		Node removeNode = prevNode.next;
		prevNode.next = removeNode.next;
		
		size--;
		
		return removeNode.data;
		
			
	}
	
	public Object removeFirst(){
		return remove(0);
	}
	
	public Object removeLast(){
		return remove(size);
	}
	
	public boolean remove(Object obj){
		int nodeIndex = indexOf(obj);
		if (nodeIndex > 0){
			remove(nodeIndex);
			return true;
		}
		return false;
	}
	/* ���� �� */
	
	
	/* �˻�  */ 
	
	public Object get(int index){
		return getNode(index).data;
	}
	
	public Object getFirst(){
		return get(0);
	}
	
	public Node getNode(int index){
		
		// �ε����� ��� ��� ����ó��
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException("Index : " + index + ", Size : "+ size );
		
		Node node = header ;
		
		// ����Ʈ�� ��带 index ���� �̵��Ѵ�.
		for(int nodeIndex = 0 ; nodeIndex < index ; nodeIndex++)
			node = node.next;
		
		return node;
	}
	
	
	public int indexOf(Object obj){
		
		if(size <= 0)
			return -1;
		
		int matchedIndex = 1;
		Node node = header.next;
		Object nodeData = node.data;
		
		
		while(!nodeData.equals(obj)){

			node = node.next;
			
			if(node == null)
				return -1;
			
			nodeData = node.data;
			matchedIndex++;
		}
		
		return matchedIndex;
		
	}
	
	/* �˻� �� */
	
	@Override 
	public String toString(){
		
		StringBuffer result =  new StringBuffer(" [ ");
		Node currnetNode = header.next;
		
		while(currnetNode != null){
			result.append(" " + currnetNode.data + " ");
			currnetNode = currnetNode.next;
		}
		
		result.append(" ] ");

		return result.toString();
	}
	
	
}
