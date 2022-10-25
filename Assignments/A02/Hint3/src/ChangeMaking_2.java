
/**
 * Classical Change making problem with an unlimited amount of coins of each type. <br>
 * Version 2: Selection function with more elaborated policy: First biggest-coin.<br>
 * Depending on the type of coins, it can lead to an optimal solution.<br>
 * The class encapsulates all the functions of the Greedy schema<br>
 */

public class ChangeMaking_2 {

	//---------------------------------------
	//	Constructor
	//---------------------------------------
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public ChangeMaking_2(){}

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
		// II. SCENARIO IMPLEMENTATION 							// Greedy code examples, part 1
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
	// 1. getCandidate --> It selects the next candidate to be considered.
	//-------------------------------------------------------------------
	/**
	 * Given a current solution that is not a final solution, this function selects the new candidate to be added to it.<br>
	 * The policy followed is more elaborated: Pick the biggest non-discarded type of coin.
	 * @param changeGenerated: The quantity of change we have generated so far.
	 * @param discarded: The MyList stating whether a candidate has been discarded so far or not.
	 * @param coinValues: A MyList containing the value of each type of coin supported.
	 * @return: The index of candidate to be selected.
	 */
	public int getCandidate(int changeGenerated,
							MyList<Integer> discarded,
							MyList<Integer> coinValues){

		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = -1;
		int scenario = 0;
		int maximumValue = 0;

		//-----------------------------
		//SET OF OPS
		//-----------------------------
		for (int i = 0; i < coinValues.length(); i++ ) {
			if(discarded.getElement(i) == 0) {
				if (coinValues.getElement(i) >= maximumValue) {		//
					maximumValue = coinValues.getElement(i);
					res = i;
				}
			}
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// 2. isValid --> It selects if a candidate can be added to the solution.
	//-------------------------------------------------------------------
	/**
	 * Given a current solution and a selected candidate, this function
	 * states whether the candidate must be added to the solution or discarded.<br>
	 * @param coinValues: A MyList containing the value of each type of coin supported.
	 * @param amount: The amount of change we want to generate.
	 * @param changeGenerated: The quantity of change we have generated so far.
	 * @param itemSelected: The index of the candidate selected.
	 * @return: Whether the candidate fits or not into the solution.
	 */

	public boolean isValid(MyList<Integer> coinValues,
						   int amount,
						   int changeGenerated,
						   int itemSelected){

		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		boolean res = false;
		int scenario = 0;

		//-----------------------------
		//SET OF OPS
		//-----------------------------
		if (coinValues.getElement(itemSelected) + changeGenerated <= amount)
			res = true;

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// 3. isFinal --> It selects if the current solution is the final solution
	//-------------------------------------------------------------------
	/**
	 * Given a current solution, this function states whether it is a final solution or it can still be improved.<br>
	 * To determine it, it checks whether there is (at least) one more coin that can be used as part of the change.
	 * @param changeGenerated: The change generated by the current solution.
	 * @param discarded: The MyList stating whether a candidate has been discarded so far or not.
	 * @param coinValues: The MyList containing the set of coins supported.
	 * @param amount: The amount of change we want to generate.
	 * @return: Whether the current solution is the final solution.
	 */
	public boolean isFinal(int changeGenerated,
						   MyList<Integer> discarded,
						   MyList<Integer> coinValues,
						   int amount){

		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		boolean res = true;

		//-----------------------------
		//SET OF OPS
		//-----------------------------
		int index = 0;

		if (changeGenerated == amount) {
			res = true;
		}
		else {
			while ((res == true) && (index < coinValues.length())){
				if (discarded.getElement(index) == 0) {
					res = false;
				}
				index++;
			}
		}

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// 4. objectiveFunction --> This function computes the value of the final solution.
	//-------------------------------------------------------------------
	/**
	 * Given the final solution to the problem, this function
	 * computes its value according to:<br>
	 * How many coins are used in the solution.<br>
	 * How accurate it is the change.<br>
	 * @param sol: The MyList containing the solution to the problem.
	 * @param changeGenerated: The change generated by the current solution.
	 * @param amount: The amount of change we want to generate.
	 * @return: The value of such solution.
	 */
	public MyList<Integer> getQuality(MyList<Integer> sol,
									  int changeGenerated,
									  int amount){

		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyList<Integer> res = new MyDynamicList<>();

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		int leftover = 0;

		leftover = amount - changeGenerated;

		res.addElement(0, leftover);

		int howMany = sol.length();
		int total = 0;

		for (int i = 0; i < sol.length(); i++ ) {
			total = total + sol.getElement(i);
		}
		res.addElement(0, total);

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
	 * @param coinValues: A MyList containing the value of each type of coin supported.
	 * @param amount: The amount of change we want to generate.
	 * @return: A MyList containing the amount of coins of each type being selected.
	 */
	public MyList<Integer> solve(MyList<Integer> coinValues,
								 int amount){

		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyList<Integer> res = null;
		MyList<Integer> solutionValue = null;

		//-----------------------------
		//SET OF OPS											// Greedy code examples, part 5
		//-----------------------------

		int size = coinValues.length();

		MyList<Integer> discarded = null;

		int changeGenerated = 0;

		res = new MyDynamicList<Integer>();
		for (int i = 0; i < size; i++)
			res.addElement(0, 0);

		discarded = new MyDynamicList<Integer>();
		for (int i = 0; i < size; i++)
			discarded.addElement(0, 0);

		while (isFinal(changeGenerated, discarded, coinValues, amount) == false){
			//OP2.1 Auxiliary variables:
			//We use 'itemSelected' to state the index of the candidate being selected.
			int itemSelected = -1;

			//OP2.1. We pick the most promising candidate
			itemSelected = getCandidate(changeGenerated, discarded, coinValues);

			//OP2.2. If the candidate is feasible
			if (isValid(coinValues, amount, changeGenerated, itemSelected) == true){
				//OP2.2.1. We add it to the solution
				int x = res.getElement(itemSelected);
				res.removeElement(itemSelected);
				res.addElement(itemSelected, x + 1);

				//OP2.2.2. We update the capacity used in the bin
				changeGenerated = changeGenerated + coinValues.getElement(itemSelected);
			}
			else {
				//OP2.3. We discard the candidate for future iterations
				discarded.removeElement(itemSelected);
				discarded.addElement(itemSelected, 1);
			}
		}
		//OP3. We print the solution and its associated objective value
		displayElements(res);

		solutionValue = getQuality(res, changeGenerated, changeGenerated);
		System.out.println("Solution = " + solutionValue + " items placed in the bin");		// points to memory address, how to fix?

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}
}