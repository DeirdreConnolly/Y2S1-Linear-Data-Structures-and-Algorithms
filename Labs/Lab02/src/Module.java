/**
* Our second pure Object Oriented Programming Java class, in the sense it is used to model a concept (a type of objects) of the problem we want to solve<br>. 
* The module class produces and give functionality to n >= 0 module objects<br>
*/
public class Module {

	//---------------------------------------
	//	Attributes
	//---------------------------------------
	   private String name;
       private int code;
       private int numStudents;
       private String studentRegistered;
       private final int MAX_STUDENTS = 100;

	
	//---------------------------------------
	//	Constructor
	//---------------------------------------
	public Module(String n, int c, String stuReg, int max){
	    this.name = n;
	    this.code = c;
	    this.NumStudents = 0;
	    this.MAX_STUDENTS = max;
        this.studentRegistered = stuReg;


    }
	
	//---------------------------------------
	//	Get Methods
	//---------------------------------------
    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public String getStudentRegistered() {
        return studentRegistered;
    }

    public int getMAX_STUDENTS() {
        return MAX_STUDENTS;
    }

    public Student getStudentInfo​(int i){
	    return StudentInfo;
    }


    //---------------------------------------
	//	Set Method
	//---------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public void setStudentRegistered(String studentRegistered) {
        this.studentRegistered = studentRegistered;
    }

    public void setMAX_STUDENTS(int MAX_STUDENTS) {
        this.MAX_STUDENTS = MAX_STUDENTS;
    }


    //---------------------------------------
	//	Extra Functionality
	//---------------------------------------		

	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();

    public void registerStudent​(Student s){
        if (this.numStudents <= this.MAX_STUDENTS) {
            this.studentRegistered[this.numStudents] = s;
            this.numStudents++;
        }
        else
            System.out.print("Sorry, this module is full.")
    }
}
