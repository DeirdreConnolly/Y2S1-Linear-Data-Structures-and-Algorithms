
/**
* The main class of our project.<br>. 
*/
public class MyMain {
	
	//-------------------------------------
	//	testMyExtendedList 
	//-------------------------------------	
	/** 
	* This function test the MyExtendedList interface and its implementation.<br>
	*/
	public static void testMyGenericList() {

		// 1. We create a MyList of Integers with the static approach.
		MyList<Integer> m1;

		Integer obj = Integer.valueOf(5);
		m1 = new MyStaticList<Integer>(obj.getClass(), 3);

		m1.addElement(0, 4); //--> m : [4]
		m1.addElement(1, 5); //--> m : [4, 5]
		m1.addElement(2, 6); //--> m : [4, 5, 6]

		// 2. We create a MyList of Booleans with the dynamic approach.
		MyList<Boolean> m2;
		m2 = new MyDynamicList<Boolean>();
		m2.addElement(0,true); //--> m : [true]
		m2.addElement(1,false); //--> m : [true, false]
		m2.addElement(2,true); //--> m : [true, false, true]

		// 3. We create a list of MyPair<Integer, Boolean>
		MyPair<Integer, Boolean> p1 = new MyPair<Integer, Boolean>(5, true);
		MyPair<Integer, Boolean> p2 = new MyPair<Integer, Boolean>(7, false);
		MyPair<Integer, Boolean> p3 = new MyPair<Integer, Boolean>(9, true);

		MyList< MyPair<Integer, Boolean> > m3 = new MyDynamicList< MyPair<Integer, Boolean> >();
		m3.addElement(0, p1);
		m3.addElement(1, p2);
		m3.addElement(2, p3);

		// 4. We create a MyPair with a MyList<Integer> as first component and MyList<Boolean> as second component.
		MyPair< MyList<Integer>, MyList<Boolean> > p = new MyPair< MyList<Integer>, MyList<Boolean> >(m1, m2);

	}
	
	//-------------------------------------
	//	main 
	//-------------------------------------		
	/**
	 * Main Method:<br> 
	 * Calls to the function testMyList to test MyList and its implementation.<br>
	 * @param args: We will run the program parameter free, so do not worry about it. 
	 */	
	public static void main(String[] args) {
		//1. We call to the function testMyList
		testMyGenericList();
		
	}

}
