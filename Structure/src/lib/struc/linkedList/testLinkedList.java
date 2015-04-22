package lib.struc.linkedList;

public class testLinkedList {
	public static void main(String[] argv){
		
		hLinkedList list = new hLinkedList();
			
		System.out.println("--- Test of Add---");
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(500);
		System.out.println(list);
		System.out.println();
		
		System.out.println("--- Test of Add by Index---");
		list.add(2,300);
		list.addFirst(50);
		System.out.println(list);
		System.out.println();
		
		System.out.println("--- Test of Get---");
		System.out.println(" list get (4) : " + list.get(4));
		System.out.println(list);
		System.out.println();
		
		System.out.println("--- Test of Remove Object---");
		list.remove(2);
		list.remove(new Integer(300));
		System.out.println(list);
		System.out.println();

		System.out.println("--- Test of Remove First Last ---");
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println();
		
	
	}
}
