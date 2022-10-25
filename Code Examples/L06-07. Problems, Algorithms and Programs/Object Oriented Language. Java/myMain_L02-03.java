
public class myMain_L02-03 {

	//--------------------------------------------------
	// init_cards
	//--------------------------------------------------	
	public static void init_cards(Cards c, int n){
		int position = 0;
		while (n > 0){
			c.my_add_element(position, (n % 10));
			n = n / 10;
			position = position + 1;
		}
	}
	
	//--------------------------------------------------
	// bubble_sort
	//--------------------------------------------------	
	public static void bubble_sort(Cards a){
		for (int i = 0; i < a.my_get_length(); i++)
			for (int j = 0; j < ((a.my_get_length() - 1) - i); j++)
				if (a.my_get_element(j) > a.my_get_element(j + 1)) {
					a.my_add_element(j+2, a.my_get_element(j));
					a.my_remove_element(j);					
				}
	}
	
	//--------------------------------------------------
	// are_equal
	//--------------------------------------------------	
	public static boolean are_equal(Cards a1, Cards a2){
		boolean res = true;
		int size = a1.my_get_length();
		int i = 0; 
		
		while ((i < size) && (res == true)){
			if (a1.my_get_element(i) != a2.my_get_element(i))
				res = false;
			else
				i = i + 1;
		}			
		
		return res;
	}
		
	//--------------------------------------------------
	// anagrams2
	//--------------------------------------------------
	public static boolean anagrams2(Cards a1, Cards a2){		
		//Sort the numbers
		bubble_sort(a1);
		bubble_sort(a2);
		
		//Compare the ordered arrays
		boolean res = are_equal(a1, a2);
		
		return res;	
	}
	
	//--------------------------------------------------
	// apperances
	//--------------------------------------------------	
	public static void count_appearances(Cards c, Cards app){
		for (int i = 0; i < c.my_get_length(); i++){
			int index = c.my_get_element(i);
			int value = app.my_get_element(index);
			
			app.my_remove_element(index);
			app.my_add_element(index, value + 1);
		}	
	}	

	//--------------------------------------------------
	// anagrams3
	//--------------------------------------------------
	public static boolean anagrams3(Cards a1, Cards a2){	
		//Declare the additional data structures
		Cards app1 = new Cards();
		for (int i = 0; i < 10; i++)
			app1.my_add_element(i, 0);
		
		Cards app2 = new Cards(); 		
		for (int i = 0; i < 10; i++)
			app2.my_add_element(i, 0);
		
		//Count the appearances
		count_appearances(a1, app1);
		count_appearances(a2, app2);		

		//Compare the appearance arrays
		boolean res = are_equal(app1, app2);		
		
		return res;			
	}	
		
	//--------------------------------------------------
	// main
	//--------------------------------------------------
	public static void main(String[] args) {
		// Input numbers
		int num1 = 76655;
		int num2 = 55667;	
		
		//Input mode //--> true for anagrams2 and false for anagrams3
		boolean mode = true;
		
		// Output result
		boolean res;
		
		//1. Create the cards players
		Cards c1 = new Cards();
		init_cards(c1, num1);

		Cards c2 = new Cards();
		init_cards(c2, num2);
			
		if (mode == true)
			res = anagrams2(c1, c2);
		else
			res = anagrams3(c1, c2);
				
		System.out.println(res);
		
	}	
		
}
