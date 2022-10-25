/**
 * ADT MyStack: Private Part<br>.
 * The class implements all the operations available in MyStack<br>
 */
public class MyDoubleDynamicStack<T> implements MyStack<T> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyDoubleLinkedNode<T> head;						// head == top/front of stack
	private MyDoubleLinkedNode<T> tail;						// tail == bottom/end of stack
	private int numItems;                   				// represents the number of items of MyStack

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------
	//public myStack myCreateEmpty(){}

	public MyDoubleDynamicStack(){
		this.head = null;
		this.tail = null;
		this.numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: isEmpty
	//-------------------------------------------------------------------

	public boolean isEmpty(){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		boolean res = true;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (this.numItems == 0) {           				// stack is empty
			scenario = 1;
		}

		else {												// stack is not empty
			scenario = 2;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		switch (scenario) {
			case 1:
				break;

			case 2:
				res = false;
				break;
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStack: first
	//-------------------------------------------------------------------

	public T first(){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		T res = null;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (this.numItems == 0) {							// stack is empty
			scenario = 1;
		}

		else {												// stack is not empty
			scenario = 2;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		switch (scenario) {
			case 1:
				System.out.println("The stack is empty.\n");
				break;

			case 2:
				res = this.head.getInfo();
				break;
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyStack: addByFirst
	//-------------------------------------------------------------------

	public void addByFirst(T element){
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (this.numItems == 0) {							// stack is empty
			scenario = 1;
		}

		else {												// stack is not empty
			scenario = 2;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------

		MyDoubleLinkedNode<T> node = new MyDoubleLinkedNode<T>(null, element, null);			// create new object

		switch (scenario) {
			case 1:
				this.head = node;
				this.tail = node;
				this.numItems++;
				break;

			case 2:
				this.head.setLeft(node);
				node.setRight(this.head);
				this.head = node;
				this.numItems++;
				break;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst
	//-------------------------------------------------------------------

	public void removeByFirst(){
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (this.numItems == 0) {							// stack is empty
			scenario = 1;
		}

		else if (this.numItems > 1) {						// stack contains more than 1 item
			scenario = 2;
		}

		else {												// stack has 1 remaining item
			scenario = 3;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		switch (scenario) {
			case 1:
				System.out.println("The stack is empty.\n");
				break;

			case 2:
				this.head = this.head.getRight();
				this.head.setLeft(null);
				this.numItems--;
				break;

			case 3:
				this.head = this.head.getRight();
				this.head = null;
				this.tail = null;
				this.numItems--;
				break;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStack: last
	//-------------------------------------------------------------------

	public T last(){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		T res = null;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (isEmpty()) {									// stack is empty
			scenario = 1;
		}

		else {												// stack is not empty
			scenario = 2;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		switch (scenario) {
			case 1:
				System.out.println("The stack is empty.\n");
				break;

			case 2:
				res = this.tail.getInfo();
				break;
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyStack: addByLast
	//-------------------------------------------------------------------

	public void addByLast(T element){
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (isEmpty()) {									// stack is empty
			scenario = 1;
		}

		else {												// stack is not empty
			scenario = 2;
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------

		MyDoubleLinkedNode<T> node = new MyDoubleLinkedNode<T>(null, element, null);			// create new object

		switch (scenario) {
			case 1:
				this.head = node;
				this.tail = node;
				this.numItems++;
				break;

			case 2:
				this.tail.setRight(node);
				node.setLeft(this.tail);
				this.tail = node;
				this.numItems++;
				break;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst
	//-------------------------------------------------------------------

	public void removeByLast(){
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (isEmpty()) {								// stack is empty
			scenario = 1;
		}

		else if (this.numItems > 1) {					// stack contains more than 1 item
			scenario = 2;
		}

		else {											// stack has 1 remaining item
			scenario = 3;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		switch (scenario) {
			case 1:
				System.out.println("The stack is empty.\n");
				break;

			case 2:
				this.tail = this.tail.getLeft();
				this.tail.setRight(null);
				this.numItems--;
				break;

			case 3:
				this.tail = this.tail.getLeft();
				this.tail = null;
				this.head = null;
				this.numItems--;
				break;
		}
	}
}