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
	// 1. recursiveDisplayElements --> Displays all elements of a MyList
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyList, this recursive algorithm displays its elements by screen (if any).
	 * @param m: The MyList we want to display its elements.
	 */
	public void recursiveDisplayElements(MyList<Integer> m){

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (m.length() == 0) {									// empty
			scenario = 1;
		} else if (m.length() == 1) {							// contains 1 element
			scenario = 2;
		} else {												// contains more than 1 element
			scenario = 3;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		switch(scenario){
			case 1:												// empty
				System.out.println("MyList is empty");
				break;

			case 2:												// contains 1 element
				int e0 = m.getElement(0);					// get first (only) element

				System.out.println(e0);
				break;

			case 3:												// contains more than 1 element
				e0 = m.getElement(0);						// get first element

				System.out.print(e0 + ", ");

				m.removeElement(0);						// remove first element

				recursiveDisplayElements(m);					// recursively display elements

				m.addElement(0, e0);						// add element back to m
				break;
		}
	}

	//-------------------------------------------------------------------
	// 2. smallerMyList --> Filters all elements in MyList smaller than e
	//-------------------------------------------------------------------
	/**
	 * The function filters all elements of MyList being smaller than 'e'
	 * @param m: The MyList we want to check.
	 * @param e: The number 'e' we want to compare each element of MyList to.
	 * @return: The new MyList containing just the elements being smaller than 'e'
	 */
	public MyList<Integer> smallerMyList(MyList<Integer> m, int e){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		// MyList<Integer> res = null;  						// breaks it
		MyList<Integer> res = new MyDynamicList<>();

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (m.length() == 0) {									// empty
			scenario = 1;
		} else if (m.length() == 1) {							// contains 1 element
			scenario = 2;
		} else {												// contains more than 1 element
			scenario = 3;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		switch(scenario){

			case 1:												// empty
				System.out.println("MyList is empty");
				break;

			case 2:												// contains 1 element
				int e0 = m.getElement(0);					// get first (only) element

				if (e0 < e) {									// check if e0 is smaller than e
					res.addElement(0, e0);
				} else {
					System.out.println("Element " + e0 + " is bigger than or equal to " + e);
				}
				break;

			case 3:												// contains more than 1 element
				e0 = m.getElement(0);						// get first  element

				m.removeElement(0);						// remove first element

				res = smallerMyList(m, e);

				if (e0 < e) {
					res.addElement(0, e0);
				} else {
					System.out.println("Element " + e0 + " is bigger than or equal to " + e);
				}

				m.addElement(0, e0);						// add element back
				break;
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// 3. biggerMyList --> Filters all elements in MyList bigger than e
	//-------------------------------------------------------------------
	/**
	 * The function filters all elements of MyList being bigger than 'e'
	 * @param m: The MyList we want to check.
	 * @param e: The number 'e' we want to compare each element of MyList to.
	 * @return: The new MyList containing just the elements being bigger or equal than 'e'
	 */
	public MyList<Integer> biggerEqualMyList(MyList<Integer> m, int e){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		// MyList<Integer> res = null;
		MyList<Integer> res = new MyDynamicList<>();

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (m.length() == 0) {									// empty
			scenario = 1;
		} else if (m.length() == 1) {							// contains 1 element
			scenario = 2;
		} else {												// contains more than 1 element
			scenario = 3;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		switch(scenario){

			case 1:												// empty
				System.out.println("MyList is empty");
				break;

			case 2:												// contains 1 element
				int e0 = m.getElement(0);					// get first (only) element

				if (e0 >= e) {									// check if e0 is bigger than or equal to e
					res.addElement(0, e0);
				} else {
					System.out.println("Element " + e0 + " is smaller than " + e);
				}
				break;

			case 3:												// contains more than 1 element
				e0 = m.getElement(0);						// get first  element

				m.removeElement(0);						// remove first element

				res = biggerEqualMyList(m, e);

				if (e0 >= e) {
					res.addElement(0, e0);
				} else {
					System.out.println("Element " + e0 + " is smaller than " + e);
				}
				m.addElement(0, e0);						// add element back
				break;
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// 4. concatenate --> It concatenates 2 MyList
	//-------------------------------------------------------------------
	/**
	 * The function concatenates the content of 2 MyList.
	 * @param m1: The first MyList.
	 * @param m2: The second MyList.
	 * @return: The new MyList resulting of concatenate the other 2 MyList
	 */
	public MyList<Integer> concatenate(MyList<Integer> m1, MyList<Integer> m2){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyList<Integer> res = null;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION							// D&C code examples, part 6
		//-----------------------------
		int scenario = 0;

		if (m1.length() == 0)									// m1 empty
			scenario = 1;

		else {
			if (m2.length() == 0)								// m2 empty
				scenario = 2;
			else {
				int m1e0 = m1.getElement(0);				// m1 first element
				int m2e0 = m2.getElement(0);				// m2 first element

				if (m1e0 < m2e0)								// m1 first element smaller than or equal to m2 first element
					scenario = 3;

				else											// m1 first element bigger than m2 first element
					scenario = 4;
			}
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 							// D&C code examples, part 6
		//-----------------------------
		int size = 0;
		int e0 = 0;
		int auxE = 0;

		switch(scenario){
			case 1:
				res = new MyDynamicList<Integer>();

				size = m2.length() - 1;

				while (size >= 0){
					auxE = m2.getElement(size);
					res.addElement(0, auxE);
					size--;
				}
				break;

			case 2:
				res = new MyDynamicList<Integer>();

				size = m1.length() - 1;

				while (size >= 0){
					auxE = m1.getElement(size);
					res.addElement(0, auxE);
					size--;
				}
				break;

			case 3:												// m1 first element smaller than or equal to m2 first element
				e0 = m1.getElement(0);					// m1 first element

				m1.removeElement(0);						// m1 remove first element

				res = concatenate(m1, m2);						// recursively solve the smaller problem

				res.addElement(0, e0);					// add element e0 back to resulting list

				m1.addElement(0, e0);						// add element back to m1, so as to not to modify its original state
				break;

			case 4:												// m1 first element bigger than m2 first element
				e0 = m2.getElement(0);					// m2 first element

				m2.removeElement(0);						// m2 remove first element

				res = concatenate(m1, m2);						// recursively solve the smaller problem

				res.addElement(0, e0);					// add element e0 back to resulting list

				m2.addElement(0, e0);						// add element back to m2, so as to not to modify its original state
				break;
		}


		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// 5. quickSort --> Sort a MyList using the method quick sort
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyList, it computes a new sorted list using the method Quick Sort.
	 * @param m: The MyList we want to sort.
	 * @return: The new MyList being sorted.
	 */

	/**
	 * From https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.htm
	 Quick sort is a highly efficient sorting algorithm and is based on partitioning an array of data into smaller arrays.
	 A large array is partitioned into two arrays, one of which holds values smaller than the specified value,
	 say pivot, based on which the partition is made,
	 and another array holds values greater than the pivot value.

	 Quick sort partitions an array, and then calls itself recursively twice to sort the two resulting sub-arrays.
	 This algorithm is quite efficient for large-sized data sets as its average and worst case complexity are of Ο(n2),
	 where n is the number of items.

	 Step 1 − Choose the highest index value as pivot
	 Step 2 − Take two variables to point left and right of the list excluding pivot
	 Step 3 − Left points to the low index
	 Step 4 − Right points to the high index
	 Step 5 − While value at left is less than pivot, move right
	 Step 6 − While value at right is greater than pivot, move left
	 Step 7 − If both step 5 and step 6 do not match, swap left and right
	 Step 8 − If left ≥ right, the point where they meet is new pivot
	 */

	public MyList<Integer> quickSort(MyList<Integer> m){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyList<Integer> res = null;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;

		if (m.length() == 0)									// empty
			scenario = 1;
		else {													// contains 1 element
			if (m.length() == 1)
				scenario = 2;
			else												// contains more than 1 element
				scenario = 3;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 							// D&C code examples, part 11
		//-----------------------------

		switch(scenario){

			case 1:												// empty
				res = new MyDynamicList<Integer>();				// create new list
				break;

			case 2:												// contains 1 element
				res = new MyDynamicList<Integer>();					// create new list

				int e0 = m.getElement(0);					// get first (only) element
				res.addElement(0, e0);					// add element to list
				break;

			case 3:												// contains more than 1 element
				res = new MyDynamicList<Integer>();					// create new list

				int x = m.getElement(0);					// get first element
				m.removeElement(0);						// remove first element

				MyList<Integer> l = smallerMyList(m, x);		// l = left side, smaller than
				MyList<Integer> r = biggerEqualMyList(m, x);	// r = right side, bigger than or equal to

				MyList<Integer> ls = quickSort(l);				// left side, smaller than
				MyList<Integer> rs = quickSort(r);				// right side, bigger than or equal to
				rs.addElement(0,  x);

				res = concatenate(ls, rs);

				m.addElement(0,  x);
				break;
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}
}