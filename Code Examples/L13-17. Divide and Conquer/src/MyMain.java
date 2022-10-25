
/**
* The main class of our project.<br>. 
*/
public class MyMain {
	
	/**
	 * This function is used to test the divide and conquer algorithms.
	 */
	public static void test(){
		//1. We create the object to test the exercises
		DivideAndConquerAlgorithms ex = new DivideAndConquerAlgorithms();
		
		//2. We create extra variables for the tests
		
		// m1 = []
		MyList<Integer> m1 = new MyDynamicList<Integer>();
		
		// m2 = [3,2,9]
		Integer e0 = 0;
		MyList<Integer> m2 = new MyStaticList<Integer>(e0.getClass(), 3);
		m2.addElement(0, 2);
		m2.addElement(1, 3);
		m2.addElement(2, 9);
		
		// m3 = [4,8,1,3,7,5,2,6]		
		MyList<Integer> m3 = new MyDynamicList<Integer>();
		m3.addElement(0, 4);
		m3.addElement(1, 8);
		m3.addElement(2, 1);	
		m3.addElement(3, 3);			
		m3.addElement(4, 7);
		m3.addElement(5, 5);
		m3.addElement(6, 2);	
		m3.addElement(7, 6);	
		
		//3. We create extra variables for the results		
		int resI = 0;
		boolean resB = false; 
		MyList<Integer> resM = null;
		
		//---------------------
		// TESTS
		//---------------------		

		//----------------------------
		//1. We test iterativeSumList
		//----------------------------
		System.out.println("\n----------- Test: iterativeSumList -------------\n");
		
		resI = ex.iterativeSumList(m1);
		System.out.println(resI);
		
		resI = ex.iterativeSumList(m2);
		System.out.println(resI);		
		
		resI = ex.iterativeSumList(m3);
		System.out.println(resI);
		
		//----------------------------
		//2. We test recursiveSumList
		//----------------------------
		System.out.println("\n----------- Test: recursiveSumList -------------\n");
	
		resI = ex.recursiveSumList(m1);
		System.out.println(resI);
		
		resI = ex.recursiveSumList(m2);
		System.out.println(resI);		
		
		resI = ex.recursiveSumList(m3);
		System.out.println(resI); 
		
		//----------------------------
		//3. We test fibonacci
		//----------------------------	
		System.out.println("\n----------- Test: fibonacci -------------\n");
		
		resI = ex.fibonacci(0);
		System.out.println(resI);
		
		resI = ex.fibonacci(1);
		System.out.println(resI);		
		
		resI = ex.fibonacci(4);
		System.out.println(resI); 		
		
		//----------------------------
		//4. We test iterativeDisplayElements
		//----------------------------
		System.out.println("\n----------- Test: iterativeDisplayElements -------------\n");
		
		ex.iterativeDisplayElements(m1);

		ex.iterativeDisplayElements(m2);
		
		ex.iterativeDisplayElements(m3);
		
		//----------------------------
		//5. We test isSorted
		//----------------------------
		System.out.println("\n----------- Test: isSorted -------------\n");

		resB = ex.isSorted(m1);
		System.out.println(resB);
		
		resB = ex.isSorted(m2);
		System.out.println(resB);		
		
		resB = ex.isSorted(m3);
		System.out.println(resB); 
	
		//----------------------------
		//6. We test insertionSort
		//----------------------------
		System.out.println("\n----------- Test: insertionSort -------------\n");
		
		resM = ex.insertionSort(m1);
		ex.iterativeDisplayElements(resM);
		
		resM = ex.insertionSort(m3);
		ex.iterativeDisplayElements(resM);		
		
		//----------------------------
		//7. We test mergeSort
		//----------------------------
		System.out.println("\n----------- Test: mergeSort -------------\n");
		
		resM = ex.mergeSort(m1);
		ex.iterativeDisplayElements(resM);
		
		resM = ex.mergeSort(m3);
		ex.iterativeDisplayElements(resM);			

		//----------------------------
		//8. We test hanoi
		//----------------------------
		System.out.println("\n----------- Test: mergeSort -------------\n");
		
		ex.hanoi(3);
		
	}
	
	/**
	 * Main Method.
	 * @param args: We will run the program parameter free, so do not worry about it.
	 */
	public static void main(String[] args) {
		test();
		
		//DivideAndConquerAlgorithms ex = new DivideAndConquerAlgorithms();
		
		//ex.hanoi(10);
		
		
	}

}
