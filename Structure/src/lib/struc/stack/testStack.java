package lib.struc.stack;

public class testStack {
	
	
	public static void main(String[] argv){
		stack myStack = new stack();
	
		System.out.println("--- Test of Push---");
		myStack.push(new Integer(100));
		myStack.push(200);
		myStack.push(300);
		myStack.push(400);
		System.out.println(myStack);
		System.out.println();		
		
		System.out.println("--- Test of Pop---");
		System.out.println( "Pop :"+ myStack.pop());
		System.out.println( "Pop :"+ myStack.pop());
		System.out.println( "Pop :"+ myStack.pop());
		System.out.println( "Pop :"+ myStack.pop());		
		System.out.println( "Pop :"+ myStack.pop());		

		
		System.out.println();
	}

	
}
