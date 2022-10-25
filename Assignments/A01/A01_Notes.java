// LDSA Assignment 1

Addition 	"pushing"
Removal		"popping"
LIFO		last in, first out

Operations Used:
	createEmpty()
	isEmpty()
	push(int element)
	pop()
	print()
	
	
MyMain.java			class that tests the functionality of the stack's static implementation
MyStack.java 		interface that specifies the ADT MyStack containing int elements
MyStaticStack.java	class that implements all operations of MyStack, 
					using a static based implementation based on the following attributes:
																							private int items[];
																							private int numItems[];
																							private int maxItems[];
																							
ONLY MODIFY THE MyStaticStack.java FILE