
/**
* The main class of our project.<br>. 
*/
public class MyMain {
	
	//-------------------------------------
	//	testMyList 
	//-------------------------------------	
	/** 
	* This function test the MyList interface and its static implementation.<br>
	* @param mode: A boolean variable stating whether we use the static or dynamic implementation.	 
	* @param size: In case static implementation is used, this var states the maximum amount of elements it can host.	 
	* 
	*/
	public static void testMyList(boolean mode, int size) {
		
		//-------------------------------------
		//	1. We create MyList
		//-------------------------------------
		MyList m;
		//m = createEmpty(); //--> We cannot create a new MyList using explicitly myCreateEmpty()
		
		//if (mode == false)
		//	m = new MyStaticList(size);								// notebook concept
		//else
		//	m = new MyDynamicList();								// ringbinder concept
		
		
		m = new MyStaticList(size);
		//m = new MyDynamicList();
		
		
		//-------------------------------------
		//	2. Check length 
		//-------------------------------------
		System.out.println("Num of elements: " + m.length()); //--> The current length is 0 as MyList is created initially empty
				
		//-------------------------------------
		//	3. Add items 
		//-------------------------------------
		m.addElement(0,3); //--> m : [3]
		m.addElement(1,4);	//--> m : [3, 4]	
		m.addElement(3,6); //--> Fails, as MyList does not have that many elements	
		m.addElement(2,5); //--> m : [3, 4, 5]
		m.addElement(0,6); //--> Fails, as MyList is already full
				
		//-------------------------------------
		//	4. Get items 
		//-------------------------------------	
		System.out.println("First item = " + m.getElement(0)); //--> Returns 3
		System.out.println("Second item = " + m.getElement(1)); //--> Returns 4		
		m.removeElement(0); //--> m : [4, 5]
		m.getElement(2); //--> Fails, MyList does not have that many elements	
		System.out.println("First item = " + m.getElement(0)); //--> Returns 4
		
		//-------------------------------------
		//	5. Remove items
		//-------------------------------------			
		m.removeElement(1); //--> m : [4]
		m.removeElement(0); //--> m : []
		m.removeElement(0); //--> Fails, MyList is already empty
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
		//1. Use a parameter dynamic to determine which implementation to follow up
		//dynamic == false --> Static Implementation
		//dynamic == true --> Dynamic Implementation
		boolean dynamic = true;
		int size = 3;
		
		//2. We call to the function testMyList
		testMyList(dynamic, size);
	}

}
