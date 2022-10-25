
/**
* The main class of our project.<br>. 
*/
public class MyMain {
	
	/**
	 * This function is used to test the divide and conquer algorithms.
	 */
	public static void test(){
		//1. We create extra variables for the tests
		
		// m1 = []
		MyList<Integer> m1 = new MyDynamicList<Integer>();
		
		// m2 = [9,2,3]
		MyList<Integer> m2 = new MyDynamicList<Integer>();
		m2.addElement(0, 9);
		m2.addElement(1, 2);
		m2.addElement(2, 3);
		
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
		
		// m4 = []
		MyList<Integer> m4 = new MyDynamicList<Integer>();
		
		// m5 = [9,2,3]
		MyList<Integer> m5 = new MyDynamicList<Integer>();
		m5.addElement(0, 27);
		m5.addElement(1, 5);
		m5.addElement(2, 10);
		
		// m6 = [4,8,1,3,7,5,2,6]		
		MyList<Integer> m6 = new MyDynamicList<Integer>();
		m6.addElement(0, 1);
		m6.addElement(1, 1);
		m6.addElement(2, 1);	
		m6.addElement(3, 1);			
		m6.addElement(4, 1);
		m6.addElement(5, 1);
		m6.addElement(6, 1);	
		m6.addElement(7, 1);	
		
		//3. We create extra variables for the results		
		MyList<Integer> resM = null;
		
		//---------------------
		// TESTS
		//---------------------		

		//----------------------------
		//1. We test KnapsackBasic_1
		//----------------------------
		System.out.println("\n----------- Test: KnapsackBasic_1 -------------\n");

		KnapsackBasic_1 ex1 = new KnapsackBasic_1();
				
		resM = ex1.solve(m1, 10);
		System.out.println();
		
		resM = ex1.solve(m2, 10);
		System.out.println();

		resM = ex1.solve(m3, 15);
		System.out.println();

		System.out.println();

		//----------------------------
		//2. We test KnapsackBasic_2
		//----------------------------
		System.out.println("\n----------- Test: KnapsackBasic_2 -------------\n");

		KnapsackBasic_2 ex2 = new KnapsackBasic_2();
				
		resM = ex2.solve(m1, 10);
		System.out.println();
		
		resM = ex2.solve(m2, 10);
		System.out.println();

		resM = ex2.solve(m3, 15);
		System.out.println();
	
		System.out.println();

		//----------------------------
		//3. We test KnapsackValuedItems_3
		//----------------------------
		System.out.println("\n----------- Test: KnapsackValuedItems_3 -------------\n");

		KnapsackValuedItems_3 ex3 = new KnapsackValuedItems_3();
				
		resM = ex3.solve(m1, m4, 10);
		System.out.println();
		
		resM = ex3.solve(m2, m5, 10);
		System.out.println();

		resM = ex3.solve(m3, m6, 15);
		System.out.println();
	
		System.out.println();		
		
	}
	
	/**
	 * Main Method.
	 * @param args: We will run the program parameter free, so do not worry about it.
	 */
	public static void main(String[] args) {
		test();
	}

}
