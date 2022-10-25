
/**
 * The class contains the Divide and Conquer-based Algorithms we are using. 
 */
public class DivideAndConquerAlgorithms {

	//----------------------------------------------
	// Class constructor
	//----------------------------------------------	
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public DivideAndConquerAlgorithms(){}
		
	//-------------------------------------------------------------------
	// 0. iterativeDisplayElements --> Displays all elements of a MyList
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, this iterative algorithm displays its elements by screen (if any).
	 * @param m: The MyList we want to display its elements.	  
	 */	
	public void iterativeDisplayElements(MyList<Integer> m){
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (m.length() == 0) 									// empty
			scenario = 1;
		else													// not empty
			scenario = 2;

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION							// D&C code examples, part 1
		//-----------------------------
		switch(scenario){

			case 1: 											// empty
				System.out.println("MyList is empty");
				break;

			case 2: 											// not empty
				int size = m.length();
				System.out.println("MyList contains the following " + size + " items: ");

				for (int i = 0; i < size; i++)					// traverse the items
					System.out.println("Item " + i + ": " + m.getElement(i));
				break;
		}
	}

	//-------------------------------------------------------------------
	// 1. maxInt --> Computes the maximum item of MyList
	//-------------------------------------------------------------------	
	/**
	 * The function computes the maximum item of m (-1 if m is empty). 
	 * @param m: The MyList we want to compute its maximum item.
	 * @return: The maximum item of MyList	  
	 */	
	public int maxInt(MyList<Integer> m){
			 // TO-DO
		int res = 0;
		int scenario = 0;

		if (m.length() == 0)								// empty
			scenario = 1;

		else												// not empty
			scenario = 2;

		switch (scenario) {

			case 1:											// empty
				res = 0;
				break;

			case 2:											// not empty
				int e0 = m.getElement(0);				// get first element

				m.removeElement(0);					// remove first element

				res = maxInt(m);							// recursively solve the smaller problem

				res = e0 + res;								// compute final result

				if (e0 > res) {								// sorted
					res = e0;
				}

				m.addElement(0, e0);					// add element back to m, so as to not to modify its original state
				break;
		}

		return res;
	}

	//-------------------------------------------------------------------
	// 2. isReverse --> Computes if MyList is sorted in decreasing order 
	//-------------------------------------------------------------------	
	/**
	 * The function computes whether m is sorted in decreasing order or not.  
	 * @param m: The MyList we want to check.
	 * @return: Whether m is sorted in decreasing order or not.  
	 */	
	public boolean isReverse(MyList<Integer> m) {
		// TO-DO
		int res = 0;
		boolean result = false;								// not sorted
		int scenario = 0;

		if (m.length() == 0) {								// empty
			scenario = 1;
		} else {											// not empty
			scenario = 2;
		}

		switch (scenario) {
			case 1:
				res = 0;
				break;

			case 2:
				int e1 = m.getElement(0);				// get first element

				m.removeElement(0);					// remove first element

				res = maxInt(m);							// recursively solve the smaller problem

				if (e1 > res) {								// if the element is bigger than res (0)
					res = e1;
					result = true;							// sorted
				}

				m.addElement(0, e1);					// add element back to m, so as to not to modify its original state
				break;
		}

		return result;
	}

	//-------------------------------------------------------------------
	// 3. getNumAppearances --> Computes the amount of times that integer appears in MyList  
	//-------------------------------------------------------------------	
	/**
	 * The function computes the amount of times that the integer n appears in m.   
	 * @param m: The MyList we want to use.
	 * @param n: The number we want to compute its appearances for.
	 * @return: The amount of appearances of n into m  
	 */	
	public int getNumAppearances(MyList<Integer> m, int n){
			 // TO-DO
		int res = 0;
		int scenario = 0;

		if (m.length() == 0) {								// empty
			scenario = 1;
		} else {											// not empty
			scenario = 2;
		}

		switch (scenario) {
			case 1:											// empty
				res = 0;
				break;

			case 2:											// not empty
				int e0 = m.getElement(0);				// get first element

				m.removeElement(0);					// remove first element

				res = getNumAppearances(m, n);				// computes amount of times that integer n appears in m

				if (e0 == n) {								// add 1 for each appearance
					res++;
				}

				m.addElement(0, e0);					// add back to original list
				break;
		}

		return res;

	}
	
	//-------------------------------------------------------------------
	// 4. power --> Computes the m-est power of n
	//-------------------------------------------------------------------	
	/**
	 * The function computes n to the power of m.
	 * @param n: The base number.
	 * @param m: The power of n we want to compute
	 * @return: n to the power of m.  
	 */	

	public int power(int n, int m){
		 // TO-DO
		int res = 1;
		int scenario = 0;

		if (m == 0) {										// empty
			scenario = 1;
		} else {
			scenario = 2;									// not empty
		}

		switch (scenario) {
			case 1:											// empty
				break;

			case 2:
				res = n * power(n, m - 1);				// returns n^m
				break;
		}

		return res;
	}
	
	//-------------------------------------------------------------------
	// 5. lucas --> Computes the n-est term of the Lucas series
	//-------------------------------------------------------------------	
	/**
	 * The function computes the n-est term of the Lucas series
	 * @param n: The n-est term of the series we want to compute
	 * @return: The term being computed 
	 */

	/**
	 Lucas numbers:
	 Each term is the sum of the two previous terms
	 Similar to Fibonacci, but with different starting numbers (2, 1)
	 Golden ratio approximation
	 2, 1, 3, 4, 7, 11, 18, 29, 47, 76, 123...
	 */


	public int lucas(int n){
		 // TO-DO
		int scenario = 0;

		if (n == 0) {										// if n = 0, L = 2
			scenario = 1;
		} else if (n == 1) {								// if n = 1, L = 1
			scenario = 2;
		} else {											// if n > 1, Ln-1 + Ln-2
			scenario = 3;
		}

		switch (scenario) {
			case 1:
				n = 2;										// if n = 0, L = 2
				break;

			case 2:
				n = 1;										// if n = 1, L = 1
				break;

			case 3:
				int num1 = lucas(n - 1);					// if n > 1, Ln-1 + Ln-2
				int num2 = lucas(n - 2);

				n = num1 + num2;

				break;
		}

		return n;
	}

	//-------------------------------------------------------------------
	// 6. drawImage --> Prints a pattern of a given length
	//-------------------------------------------------------------------	
	/**
	 * The function prints prints a pattern of a given length.
	 * *
	 * **
	 * ***
	 * ... 
	 * @param n: The length of the desired pattern
	 */	
	public void drawImage(int n){
			 // TO-DO
		//int res = 1;
		int scenario = 0;

		if (n == 0) {										// empty
			scenario = 1;
		} else {
			scenario = 2;									// not empty
		}

		switch (scenario) {
			case 1:											// empty
				System.out.print("\n");
				break;

			case 2:
				drawImage(n - 1);
				 for(int i = 0; i < n; i++) {
				 	System.out.print("*");
			}
			System.out.print("\n");

				break;
		}
	}
}