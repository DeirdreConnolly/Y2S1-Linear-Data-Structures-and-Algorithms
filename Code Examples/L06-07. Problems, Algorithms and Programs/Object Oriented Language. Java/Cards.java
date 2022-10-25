import java.util.ArrayList;

public class Cards {

	//--------------------------------------------------
	// 0.Attributes
	//--------------------------------------------------
	private ArrayList<Integer> items;
	
	//--------------------------------------------------
	// 0. Constructor
	//--------------------------------------------------
	public Cards(){
		this.items = new ArrayList<Integer>();
	}
	
	//--------------------------------------------------
	// 1. Get number of integers in Cards: my_get_length
	//--------------------------------------------------
	public int my_get_length(){
		return this.items.size();
	}
	
	//--------------------------------------------------
	// 2. Get integer of Cards at a concrete index: my_get_element
	//--------------------------------------------------
	public int my_get_element(int index){
		int value = 0;
		
		try{			
			value = this.items.get(index);		
		}
		catch (Exception e){
			System.out.println("Sorry, not such an index to access");
		}
		
		return value;	
	}
	
	//--------------------------------------------------
	// 3. Add integer to Cards at a concrete index: my_add_element
	//--------------------------------------------------
	public void my_add_element(int index, int value){
		try{
			this.items.add(index, value);		
		}
		catch (Exception e){
			System.out.println("Sorry, not such an index to add");
		}		
	}

	//--------------------------------------------------
	// 4. Remove integer from Cards: my_remove_element
	//--------------------------------------------------
	public void my_remove_element(int index){
		try{			
			this.items.remove(index);		
		}
		catch (Exception e){
			System.out.println("Sorry, not such an index to remove");
		}		
	}
	
}
