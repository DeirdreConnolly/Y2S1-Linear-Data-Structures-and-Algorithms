/**
* Our first pure Object Oriented Programming Java class, in the sense it is used to model a concept (a type of objects) of the problem we want to solve<br>. 
* The student class produces and give functionality to n >= 0 student objects<br>
*/
public class Student {

	//---------------------------------------
	//	Attributes
	//---------------------------------------
    private boolean firstYear;
    private int age;
    private String name;

	
	//---------------------------------------
	//	Constructor
	//---------------------------------------
    public Student(boolean t, int s, String n){
        this.firstYear = t;
        this.age = s;
        this.name = n;
    }
	
	//---------------------------------------
	//	Get Methods
	//---------------------------------------	
    public boolean getFirstYear(){
        return this.firstYear;
    }

    public int getAge(){
        return this.age;
    }

    public String getName() {
        return this.name; }
	
	//---------------------------------------
	//	Set Method
	//---------------------------------------
    public void setFirstYear(boolean t){
        this.FirstYear = t;
    }

    public void setAge(int s){
        this.Age = s;
    }

    public void setName(String n) {
        this.Name = n; }

	
	//---------------------------------------
	//	Extra Functionality
	//---------------------------------------		
    public void birthday() {

        System.out.print("Happy birthday " + name + "!");

        if (this.firstYear == true)
            System.out.print("We hope you are enjoying your first year in college!");
        else
            System.out.print("We hope you are enjoying your year in college!");

        return;
    }
	
}
