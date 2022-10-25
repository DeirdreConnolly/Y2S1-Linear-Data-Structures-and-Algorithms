/**
 * ADT MyStack: Private Part<br>.
 * The class implements all the operations available in MyStack<br>
 */
public class MyDynamicStack implements MyStack {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyNode head;									// head == top/front of stack
    private int numItems;									// represents the number of items of MyStack

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: myCreateEmpty
	//-------------------------------------------------------------------
	//public myStack myCreateEmpty(){}

	public MyDynamicStack(){
		this.head = null;
		this.numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: isEmpty
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
        // I. SCENARIO IDENTIFICATION --> does it have anything in it?
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
	// Basic Operation (Partial) --> Get first element from the top of MyStack and removes it: pop
	//-------------------------------------------------------------------

	public int pop(){										// pop == removal
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = -1;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
        int scenario = 0;

		if(this.numItems == 0) {							// stack is empty
			scenario = 1;
		}

		else {                              				// stack is not empty
			scenario = 2;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		switch (scenario) {
			case 1:
				System.out.println("ERROR: You cannot remove an item as the stack is empty.\n");
				res = 0;
				break;

			case 2:
				res = this.head.getInfo();
				this.head = this.head.getNext();
				this.numItems--;
				break;
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyStack: push
	//-------------------------------------------------------------------

	public void push(int element){							// push == addition
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

		else {												// stack has some elements
			scenario = 2;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		switch (scenario) {
			case 1:
				MyNode nodeEmpty = new MyNode(element, null);
				this.head = nodeEmpty;
				this.numItems++;
				break;

			case 2:
				MyNode node = new MyNode(element, this.head);		// create new object
				this.head = node;
				this.numItems++;
				break;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyStack: print
	//-------------------------------------------------------------------

	public void print(){

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
				MyNode i = this.head;

				System.out.print("[");
				while (i != null) {
					if (i.getNext() != null) {
						System.out.print(i.getInfo() + ", ");
						i = i.getNext();
					}

					else {
						System.out.print(i.getInfo() + "]");
						break;
					}
				}
		}
	}
}