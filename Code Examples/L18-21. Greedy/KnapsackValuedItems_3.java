
/**
* Classical Knapsack problem: Each item has an associated value.<br> 
* Selection function with more elaborated policy: Max ratio value/weight.<br>
* The class encapsulates all the functions of the Greedy schema<br>
*/

public class KnapsackValuedItems_3 {
	
	//---------------------------------------
	//	Constructor
	//---------------------------------------
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public KnapsackValuedItems_3(){}

	//-------------------------------------------------------------------
	// 0. displayElements --> Displays all elements of a MyList 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, this function displays its elements by screen (if any).
	 * @param m: The MyList we want to display its elements.	  
	 */	
	public void displayElements(MyList<Integer> m){
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
			System.out.print("MyList has " + size + " items: [");
			
			//2. We traverse the items
			for (int i = 0; i < size - 1; i++)
				System.out.print(m.getElement(i) + ", ");
			System.out.println(m.getElement(size - 1) + "]");
			
			break;
	
		}
		
	}
	
	//-------------------------------------------------------------------
	// 1. isFinal --> It selects if the current solution is the final solution  
	//-------------------------------------------------------------------	
	/**
	 * Given a current solution, this function states whether it is a final solution or it can still be improved.<br> 
	 * To determine it, it checks whether there is (at least) one item that has not been considered.
	 * @param itemsConsidered: The MyList stating whether a candidate has been considered so far or not.
	 * @return: Whether the current state is final or not.
	 */	
	public boolean isFinal(MyList<Integer> itemsConsidered){
		
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		boolean res = true;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//OP1. Auxiliary variables:
		//We use 'size' to compute just once the length of MyList 'itemsConsidered'.
		int size = itemsConsidered.length();
		
		//We use 'index' to state the index of the candidate being checked.
		int index = 0;
		
		//OP1. We traverse all elements in items, so as to check if one not being selected so far can be added to the knapsack. 
		while ((res == true) && (index < size)){
			//OP1.1. If the item has not been considered before
			if (itemsConsidered.getElement(index) == 0){
				res = false;
			}
			
			//OP1.2. We increase 'index' so as to try the next item
			index++;
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;		
	}	
	
	
	//-------------------------------------------------------------------
	// 2. getCandidate --> It selects the next candidate to be considered.  
	//-------------------------------------------------------------------	
	/**
	 * Given a current solution that is not a final solution, this function selects the new candidate to be added to it.<br> 
	 * The policy followed is more elaborated: Pick the unused item with maximum ration value/weight.
	 * @param itemsWeight: The MyList containing the weight of the set of items.
	 * @param itemsValue: The MyList containing the value of the set of items. 
	 * @param itemsConsidered: The MyList stating whether a candidate has been considered so far or not.
	 * @return: The index of MyList for the new candidate being considered.
	 */	
	public int getCandidate(MyList<Integer> itemsWeight, 
							MyList<Integer> itemsValue, 
							MyList<Integer> itemsConsidered){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = -1;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//OP1. Auxiliary variables:
		//We use 'maxRatio' to keep track of the item with best ratio value/weight found so far. 
		//We use 'index' to compute just once the length of MyList 'items'.
		double maxRatio = Double.MIN_VALUE;
		int index = itemsWeight.length() - 1;
		
		//OP1. We traverse all items of MyList, to find the 'index' of the item with maximum ratio value/weight
		while (index >= 0){
			//OP1.1. Auxiliary variables: 
			//We use 'r0', 'w0' and 'e0' to access to the list of 'items' just once.
			int w0 = itemsWeight.getElement(index);
			int v0 = itemsValue.getElement(index);
			double r0 = (double) v0 / (double) w0; 
			
			//OP1.1. If a not previously considered item improves maxRatio, we update 'res' and 'maxRatio'
			if ((itemsConsidered.getElement(index) == 0) && (r0 > maxRatio)){
				res = index;
				maxRatio = r0;
			}
			
			//OP1.2. We decrease 'index' so as to try the previous item of 'items'
			index--;
		}
								
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;	
	}
	
	//-------------------------------------------------------------------
	// 3. isValid --> It selects if a candidate can be added to the solution.  
	//-------------------------------------------------------------------	
	/**
	 * Given a current solution and a selected candidate, this function 
	 * states whether the candidate must be added to the solution or discarded.<br> 
	 * @param itemsWeight: The MyList containing the set of items.
	 * @param binCapacity: The capacity of the knapsack.
	 * @param capacityUsed: The weight of all items picked in the current solution. 
	 * @param indexSelected: The index of the candidate selected.
	 * @return: Whether the new state is valid or not.
	 */	
	public boolean isValid(MyList<Integer> itemsWeight,
						   int binCapacity,
						   int capacityUsed,
						   int indexSelected){
		
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		boolean res = false;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//OP1. We check if the candidate fits or not
		if (itemsWeight.getElement(indexSelected) + capacityUsed <= binCapacity)
			res = true;
					
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;		
	}
	

	//-------------------------------------------------------------------
	// 4. getQuality --> This function computes the value of the final solution.  
	//-------------------------------------------------------------------	
	/**
	 * Given the final solution to the problem, this function 
	 * computes its value according to the desired criteria.<br> 
	 * @param sol: The MyList containing the solution to the problem.
	 * @param itemsValue: The MyList containing the values of the set of items.
	 * @return: The value of such solution.
	 */	
	public int getQuality(MyList<Integer> sol, 
						  MyList<Integer> itemsValue){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = 0;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//OP1. Auxiliary variables:
		//We use 'size' to compute just once the length of MyList 'sol'.
		int size = sol.length() - 1;
		
		//OP1. We traverse all the items of the list
		while (size >= 0){
			//OP1.1. We add the value for each item taken in the solution 		
			res = res + (sol.getElement(size) * itemsValue.getElement(size));
			
			//OP1.2. We decrease 'size' so as to try the previous item of 'sol'
			size--;
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;		
	}
	
	//-------------------------------------------------------------------
	// 5. solve --> This function solves the problem using a greedy algorithm.  
	//-------------------------------------------------------------------	
	/**
	 * Given an instance of the GP1 problem, this function solves it using 
	 * a greedy algorithm.<br> 
	 * @param itemsWeight: A MyList containing the weight of all items. 
	 * @param itemsValue: The MyList containing the values of the set of items.
	 * @param binCapacity: The size of the bin storing the selected items. 
	 * @return: A MyList containing value 1 for items being selected.
	 */	
	public MyList<Integer> solve(MyList<Integer> itemsWeight, 
								 MyList<Integer> itemsValue, 
								 int binCapacity){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyList<Integer> res = null;
		int solutionValue = 0;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//OP1. Auxiliary variables:
		//We use 'size' to compute just once the length of MyList 'items'.
		int size = itemsWeight.length();
	
		//We use 'itemsConsidered' as a MyList with the items being considered by selectionFunction so far.
		MyList<Integer> itemsConsidered = null;

		//We use 'capacityUsed' to state the amount of weight our bin contains so far.
		int capacityUsed = 0;			
		
		//OP1. We initialise all variables: 
		
		//OP1.1. 'res' is initialised to be a list of the size of items, with all values being 0.
		res = new MyDynamicList<Integer>();
		for (int i = 0; i < size; i++)
			res.addElement(0, 0);

		//OP1.2. 'itemsConsidered' is initialised to be a list of the size of items, with all values being 0.
		itemsConsidered = new MyDynamicList<Integer>();
		for (int i = 0; i < size; i++)
			itemsConsidered.addElement(0, 0);
		
		//OP2. We construct the final solution:
		while (isFinal(itemsConsidered) == false){
			//OP2.1 Auxiliary variables:
			//We use 'itemSelected' to state the index of the candidate being selected.
			int itemSelected = -1;
			
			//OP2.1. We pick the most promising candidate
			itemSelected = getCandidate(itemsWeight, itemsValue, itemsConsidered);
					
			//OP2.2. If the candidate is feasible
			if (isValid(itemsWeight, binCapacity, capacityUsed, itemSelected) == true){
				//OP2.2.1. We add it to the solution
				res.removeElement(itemSelected);
				res.addElement(itemSelected, 1);
				
				//OP2.2.2. We update the capacity used in the bin
				capacityUsed = capacityUsed + itemsWeight.getElement(itemSelected);
			}
			
			//OP2.3. We discard the candidate for future iterations
			itemsConsidered.removeElement(itemSelected);
			itemsConsidered.addElement(itemSelected, 1);			
		}
	
		//OP3. We print the solution and its associated objective value
		displayElements(res);

		solutionValue = getQuality(res, itemsValue);
		System.out.println("Solution has a value of = " + solutionValue);
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;		
	}
	
}
	