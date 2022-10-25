
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
	// 1. iterativeSumList --> Iteratively adds all the elements of a MyList 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, it adds iteratively all its elements.
	 * @param m: The MyList we want to add its elements.	  
	 * @return: The sum of all elements of MyList.
	 */	
	public int iterativeSumList(MyList<Integer> m){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = 0;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		//Rule 1. MyList is empty
		if (m.length() == 0) 
			scenario = 1;
		//Rule 2. MyList has some elements
		else
			scenario = 2;		

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. MyList is empty 
		case 1: 
			//1. We assign res to 0
			res = 0;
			
			break;
			
		//Rule 2. MyList has some elements
		case 2: 
			//1. We assign res to 0
			res = 0;
			
			//2. We traverse the elements of the list, adding them all
			int size = m.length();
			for (int i = 0; i < size; i++)
				res = res + m.getElement(i);
			
			break;
		}		
			
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;	
	}
	
	//-------------------------------------------------------------------
	// 2. recursiveSumList --> Recursively adds all the elements of a MyList 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, it adds recursively all its elements.
	 * @param m: The MyList we want to add its elements.	  
	 * @return: The sum of all elements of MyList.
	 */	
	public int recursiveSumList(MyList<Integer> m){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = 0;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		//Rule 1. MyList is empty
		if (m.length() == 0) 
			scenario = 1;
		//Rule 2. MyList has some elements
		else
			scenario = 2;		

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. MyList is empty 
		case 1: 
			//1. We assign res to 0
			res = 0;
			
			break;
			
		//Rule 2. MyList has some elements
		case 2: 
			//1. We get the first element of MyList
			int e0 = m.getElement(0);
			
			//2. We remove the first element from MyList we just checked
			m.removeElement(0);
			
			//3. We recursively solve the smaller problem
			res = recursiveSumList(m);
			
			//4. We compute the final result, based on the value that we were hosting.
			res = e0 + res; 
			
			//5. We also add the element back to m, so as to not to modify its original state
			m.addElement(0, e0);
			
			break;
		}		
			
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;	
	}
	
	//-------------------------------------------------------------------
	// 3. fibonacci --> Computes an element of the fibonacci series 
	//-------------------------------------------------------------------	
	/**
	 * Computes an element of the fibonacci series.
	 * @param n: The index of the element of the serie we want to compute.	  
	 * @return: The fibonacci element for that index.
	 */	
	public int fibonacci(int n){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = 0;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		//Rule 1. We look for the index 0 
		if (n < 2)
			scenario = 1;
		else
			scenario = 2;

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. We look for the index 0 
		case 1: 
			//1. We assign res to 0
			res = n;
			
			break;

		//Rule 2. We look for an index bigger than 1
		case 2: 
			//1. We recursively solve the the smaller problem of computing n-1
			int res1 = fibonacci(n-1);
			
			//2. We recursively solve the the smaller problem of computing n-2
			int res2 = fibonacci(n-2);
			
			//3. We compute the final result 
			res = res1 + res2;
			
			break;
		}		
			
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;	
	}
		
	//-------------------------------------------------------------------
	// 4. iterativeDisplayElements --> Displays all elements of a MyList 
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
		
		//Rule 1. MyList is empty
		if (m.length() == 0) 
			scenario = 1;
		//Rule 2. MyList is non-empty
		else
			scenario = 2;

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. MyList is empty
		case 1: 
			//1. We print the empty message
			System.out.println("Empty MyList");
			
			break;
			
		//Rule 2. MyList is non-empty
		case 2: 
			//1. We print the initial message
			int size = m.length();
			System.out.println("MyList Contains the following " + size + " items: ");
			
			//2. We traverse the items
			for (int i = 0; i < size; i++)
				System.out.println("Item " + i + ": " + m.getElement(i));
			
			break;
	
		}
		
	}
	
	//-------------------------------------------------------------------
	// 5. isSorted --> Determine whether MyList is Sorted: isSorted 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, it determines whether it is sorted or not.
	 * @param m: The MyList we want to display its elements.	  
	 * @return: Whether MyList is sorted or not.
	 */	
	public boolean isSorted(MyList<Integer> m){
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
		
		//Rule 1. MyList is empty or contains just one element
		if (m.length() < 2)
			scenario = 1;
		//Rule 2. MyList has more than one element
		else
			scenario = 2;
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. MyList is empty or contains just one element
		case 1: 
			//1. We assign res to true
			res = true;
			
			break;
			
		//Rule 2. MyList has more than one element
		case 2: 
			//1. We get the first two elements of MyList
			int e0 = m.getElement(0);
			int e1 = m.getElement(1);
			
			//2. If the first one is smaller than the second, we keep testing the rest of MyList
			if (e0 <= e1){
				//2.1. We remove the first element from MyList
				m.removeElement(0);
				
				//2.2. We recursively solve the smaller problem
				res = isSorted(m);
				
				//2.3. We also add elem0 back to m1, so as to not to modify its original state
				m.addElement(0, e0);
			}
			//3. If the first one is bigger than the second one, we can conclude MyList is not sorted
			else
				res = false;
			
			break;
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;	
	}
	
	//-------------------------------------------------------------------
	// 6. insertOrdered --> Inserts and element into an ordered MyList 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete sorted MyList, it inserts the element in its corresponding position.
	 * @param e: The element we want to insert in MyList.	  
	 * @param m: The MyList we want to insert the element at.	  
	 * @return: The new MyList after inserting the element.	  	  
	 */	
	public MyList<Integer> insertOrdered(int e, MyList<Integer> m){
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
		
		//Rule 1. MyList is empty
		if (m.length() == 0) 
			scenario = 1;
		else{
			//We get the first element of MyList
			int elem0 = m.getElement(0);
			
			//Rule 2. Elem is smaller or equal than first element of MyList
			if (e <= elem0)
				scenario = 2;				
			//Rule 3. Elem is bigger than first element of MyList
			else
				scenario = 3;
		}
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. MyList is empty
		case 1: 
			//1. We create the new list as a result
			res = new MyDynamicList<Integer>();
			
			//2. We add element to be the only element of MyList
			res.addElement(0, e);
			
			break;
		
		//Rule 2. Elem is smaller or equal than first element of MyList	
		case 2: 
			//1. We create the new list as a result
			res = new MyDynamicList<Integer>();
			
			//2. We traverse all elements of m, adding them to the list
			int size = m.length() - 1;
			while (size >= 0){
				//2.1. We access to the element in m2
				int auxE = m.getElement(size);
				
				//2.2. We append the element to res
				res.addElement(0, auxE); 
				
				//2.3. We decrease the index of size
				size--;
			}			
			
			//3. We add the element e as the head of the list 
			res.addElement(0, e);
			
			break;
			
		//Rule 3. Elem is bigger than first element of MyList
		case 3: 
			//1. We get the first element of MyList
			int e0 = m.getElement(0);
			
			//2. We remove the first element from MyList we just checked
			m.removeElement(0);
			
			//3. We recursively solve the smaller problem
			res = insertOrdered(e, m);
			
			//4. We add e0 as the first element of the result
			res.addElement(0, e0);
			
			//5. We also add the element back to m, so as to not to modify its original state
			m.addElement(0, e0);

			break;
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;			
	}
	
	//-------------------------------------------------------------------
	// 7. insertionSort --> Sort a MyList using the method insertion sort 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, it returns the sorted list using the method Insertion Sort.
	 * @param m: The MyList we want to sort.	
	 * @return: The new MyList being sorted.	  	    
	 */	
	public MyList<Integer> insertionSort(MyList<Integer> m){		
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
		
		//Rule 1. MyList is empty
		if (m.length() == 0) 
			scenario = 1;
		else{
			//Rule 2. MyList is non-empty
			scenario = 2;
		}
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. MyList is empty
		case 1: 
			//1. We create an empty list as a result
			res = new MyDynamicList<Integer>();
			
			break;
					
		//Rule 2. MyList is non-empty
		case 2: 
			//1. We get the first element of MyList
			int e0 = m.getElement(0);
			
			//2. We remove the first element from MyList we just checked
			m.removeElement(0);
			
			//3. We recursively solve the smaller problem
			res = insertionSort(m);
			
			//4. We insert e0 into res in the proper order
			res = insertOrdered(e0, res);
			
			//5. We also add the element back to m, so as to not to modify its original state
			m.addElement(0, e0);

			break;
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;					
	}

	//-------------------------------------------------------------------
	// 8. takeN --> Take first n element of a given MyList 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList and a number n, it takes the first n elements from MyList
	 * @param n: The amount of elements to take from the list.	  
	 * @param m: The original MyList
	 * @return: The new list after taking the first n elements from m.	  
	 */	
	public MyList<Integer> takeN(int n, MyList<Integer> m){
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
		
		//Rule 1. MyList is empty
		if (m.length() == 0) 
			scenario = 1;
		else{
			//Rule 2. Non-empty list and n == 0
			if (n == 0)
				scenario = 1;
			//Rule 3. Non-empty list and n > 0
			else
				scenario = 2;
		}
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rules 1 and 2. (MyList is empty) or (Non-empty list and n == 0)
		case 1: 
			//1. We create the new list as a result
			res = new MyDynamicList<Integer>();
			
			break;
					
		//Rule 3. Non-empty list and n > 0
		case 2: 
			//1. We get the first element of MyList
			int e0 = m.getElement(0);
			
			//2. We remove the first element from MyList we just checked
			m.removeElement(0);
			
			//3. We recursively solve the smaller problem
			res = takeN(n - 1, m);
			
			//4. We add back e0 to the resulting list.
			res.addElement(0, e0);
			
			//5. We also add the element back to m, so as to not to modify its original state
			m.addElement(0, e0);
			
			break;
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;			
	}

	//-------------------------------------------------------------------
	// 9. dropN --> Drop first n element of a given MyList 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList and a number n, it drops the first n elements from MyList
	 * @param n: The amount of elements to drop from the list.	  
	 * @param m: The original MyList
	 * @return: The new list after dropping the first n elements from m.	  
	 */	
	public MyList<Integer> dropN(int n, MyList<Integer> m){
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
		
		//Rule 1. MyList is empty
		if (m.length() == 0) 
			scenario = 1;
		else{
			//Rule 2. Non-empty list and n == 0
			if (n == 0)
				scenario = 2;
			//Rule 3. Non-empty list and n > 0
			else
				scenario = 3;
		}
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. MyList is empty
		case 1: 
			//1. We create an empty list as a result
			res = new MyDynamicList<Integer>();
			
			break;
					
		//Rule 2. Non-empty list and n == 0
		case 2: 
			//1. We create an empty list 
			res = new MyDynamicList<Integer>();
			
			//2. We populate the list with the content of m
			int size = m.length() - 1;
			while (size >= 0){
				//2.1. We access to the element in m 
				int auxE = m.getElement(size);
				
				//2.2. We append the element to res
				res.addElement(0, auxE); 
				
				//2.3. We decrease the index of size
				size--;
			}			
			
			break;
		
		//Rule 3. Non-empty list and n > 0
		case 3: 
			//1. We get the first element of MyList
			int e0 = m.getElement(0);
			
			//2. We remove the first element from MyList we just checked
			m.removeElement(0);
			
			//3. We recursively solve the smaller problem
			res = dropN(n - 1, m);
			
			//4. We also add the element back to m, so as to not to modify its original state
			m.addElement(0, e0);
			
			break;
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;			
	}	
	
	
	//-------------------------------------------------------------------
	// 10. mergeTwoSortedLists --> It merges two lists that are already ordered
	//-------------------------------------------------------------------	
	/**
	 * Given two concrete MyList that are already ordered, it merges them into a single ordered list.
	 * @param m1: First ordered MyList.	  
	 * @param m2: Second ordered MyList.	  
	 * @return: The new sorted list resulting after merging m1 and m2.	  
	 */	
	public MyList<Integer> mergeTwoSortedLists(MyList<Integer> m1, MyList<Integer> m2){
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
		
		//Rule 1. MyList m1 is empty
		if (m1.length() == 0) 
			scenario = 1;
		else{
			//Rule 2. MyList m2 is empty
			if (m2.length() == 0) 
				scenario = 2;
			else{
				int m1E0 = m1.getElement(0);
				int m2E0 = m2.getElement(0);
				
				//Rule 3. m1 first element smaller or equal than m2 first element
				if (m1E0 < m2E0)
					scenario = 3;	
				//Rule 4. m1 first element bigger than m2 first element
				else
					scenario = 4;	
			}
		}
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		
		int size = 0;
		int e0 = 0;
		int auxE = 0;
			
		switch(scenario){	
				
		//Rule 1. MyList m1 is empty
		case 1: 
			//1. We create the new list as a result
			res = new MyDynamicList<Integer>();
			
			//2. We traverse all elements of m2, adding them to the list
			size = m2.length() - 1;
			while (size >= 0){
				//2.1. We access to the element in m2
				auxE = m2.getElement(size);
				
				//2.2. We append the element to res
				res.addElement(0, auxE); 
				
				//2.3. We decrease the index of size
				size--;
			}
			
			break;
		
		//Rule 2. MyList m2 is empty
		case 2: 
			//1. We create the new list as a result
			res = new MyDynamicList<Integer>();
			
			//2. We traverse all elements of m1, adding them to the list
			size = m1.length() - 1;
			while (size >= 0){
				//2.1. We access to the element in m1
				auxE = m1.getElement(size);
				
				//2.2. We append the element to res
				res.addElement(0, auxE); 
				
				//2.3. We decrease the index of size
				size--;
			}
			
			break;

		//Rule 3. m1 first element smaller or equal than m2 first element
		case 3: 
			//1. We get the first element of m1
			e0 = m1.getElement(0);
			
			//2. We remove the first element from m1 we just checked
			m1.removeElement(0);
			
			//3. We recursively solve the smaller problem
			res = mergeTwoSortedLists(m1, m2);
			
			//4. We add back e0 to the resulting list.
			res.addElement(0, e0);
			
			//5. We also add the element back to m1, so as to not to modify its original state
			m1.addElement(0, e0);

			break;			

		//Rule 4. m1 first element bigger than m2 first element
		case 4: 
			//1. We get the first element of m1
			e0 = m2.getElement(0);
			
			//2. We remove the first element from m1 we just checked
			m2.removeElement(0);
			
			//3. We recursively solve the smaller problem
			res = mergeTwoSortedLists(m1, m2);
			
			//4. We add back e0 to the resulting list.
			res.addElement(0, e0);

			//5. We also add the element back to m1, so as to not to modify its original state
			m2.addElement(0, e0);
			
			break;							
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;			
	}	

	//-------------------------------------------------------------------
	// 11. mergeSort --> Sort a MyList using the method merge sort
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, it returns the sorted list using the method Merge Sort.
	 * @param m: The MyList we want to sort.
	 * @return: The new MyList being sorted.	  	  
	 */	  
	public MyList<Integer> mergeSort(MyList<Integer> m){
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
		
		//Rule 1. MyList m is empty
		if (m.length() == 0) 
			scenario = 1;
		else{
			//Rule 2. MyList m contains one element
			if (m.length() == 1)
				scenario = 2;
			//Rule 3. MyList m contains more than one element	
			else
				scenario = 3;
		}
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
			
		switch(scenario){	
				
		//Rule 1. MyList m is empty or contains just one element
		case 1: 
			//1. We create an empty list as a result
			res = new MyDynamicList<Integer>();
			
			break;
		
		//Rule 2. MyList m contains one element
		case 2: 
			//1. We create an empty list as a result
			res = new MyDynamicList<Integer>();
			
			//2. We get the first element of m
			int e0 = m.getElement(0); 
			
			//3. We append this element to res 
			res.addElement(0, e0);
			
			break;			
			
		//Rule 3. MyList m contains more than one element
		case 3: 
			//1. We calculate the half of the size of the list
			int half = m.length() / 2;
			
			//2. We take the first n elements from 'm'
			MyList<Integer> f = takeN(half, m);
			
			//3. We drop the first n elements from 'm'
			MyList<Integer> s = dropN(half, m);

			//4. We recursively solve the smaller problem of sorting 'f'
			f = mergeSort(f);
			
			//5. We recursively solve the smaller problem of sorting 's'
			s = mergeSort(s);			
			
			//6. We merge the new two sorted sublists into the final result
			res = mergeTwoSortedLists(f, s);	

			break;							
		}		
	
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;		
	}		

	//-------------------------------------
	//	13. solveHanoi 
	//-------------------------------------	
	/**
	 * Given a concrete Hanoi Problem, it prints the movements so as to solve it.
	 * @param n: The number of disks to be moved from source to destination.
	 * @param source: The name of the source column.
	 * @param sourceDisks: The list of disks contained in the source column.
	 * @param aux: The name of the aux column.
	 * @param auxDisks: The list of disks contained in the aux column.
	 * @param destination: The name of the destination column.
	 * @param destinationDisks: The list of disks contained in the destination column.
	 */	  	
	public void solveHanoi(int n, 
						   char source, MyList<Integer> sourceDisks, 
						   char aux, MyList<Integer> auxDisks, 
						   char destination, MyList<Integer> destinationDisks){

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		//Rule 1. Number of disks 'n' == 1
		if (n == 1) 
			scenario = 1;
		//Rule 2. Number of disks 'n' > 1
		else
			scenario = 2;
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
			
		switch(scenario){	
				
		//Rule 1. Number of disks 'n' == 1
		case 1: 
			//1.1. Get the disk to be moved
			int disk = sourceDisks.getElement(0);
			
			//1.2. Remove it from the source stack
			sourceDisks.removeElement(0);
			
			//1.3. Add it to the destination stack
			destinationDisks.addElement(0, disk);
			
			//1.4. Print the new movement
			System.out.println("Move the disk " + disk + " from column " + source + " to " + destination);
			
			break;
		
		//Rule 2. Number of disks 'n' > 1
		case 2: 
			//2.1. Move n-1 disks from source to aux (using destination as intermediate stack) 
			solveHanoi(n-1, 
					   source, sourceDisks, 
					   destination, destinationDisks, 
					   aux, auxDisks);
			
			//2.2. Move 1 disks from source to destination (using aux as intermediate stack) 
			solveHanoi(1, 
					   source, sourceDisks, 
					   aux, auxDisks, 
					   destination, destinationDisks);
			
			//2.3. Move n-1 disks from aux to destination (using source as intermediate stack) 
			solveHanoi(n-1, 
					   aux, auxDisks, 
					   source, sourceDisks, 
					   destination, destinationDisks);
			
			break;			
			
		}		
			
	}
	
	//-------------------------------------
	//	12. hanoi 
	//-------------------------------------	
	/**
	 * Given a value n, this function creates and solves a Hanoi problem with n disks.
	 * @param n: The number of disks of the Hanoi problem.
	 */	  	
	public void hanoi(int n){
		//1. Get the initial status of the puzzle
		
		//1.1. Initialise the stack source with all the disks
		MyList<Integer> sourceDisks = new MyDynamicList<Integer>();
		for (int i = n; i > 0; i--)
			sourceDisks.addElement(0, i);
		
		//1.2. Initialise the stack intermediate to be empty
		MyList<Integer> auxDisks = new MyDynamicList<Integer>();
		
		//1.3. Initialise the stack destination to be empty
		MyList<Integer> destinationDisks = new MyDynamicList<Integer>();
		
		//2. Solve the puzzle
		solveHanoi(n, 
				   'A', sourceDisks, 
				   'B', auxDisks, 
				   'C', destinationDisks);		
	}
	
}
