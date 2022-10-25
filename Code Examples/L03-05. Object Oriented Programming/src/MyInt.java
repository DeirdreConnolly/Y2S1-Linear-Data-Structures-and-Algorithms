
/**
 * Our second pure Object Oriented Programming Java class, it models an 'int' variable wrapper object.<br>.
 * The myInt class produces and give functionality to any 'int' wrapper objects<br>
 */
public class MyInt {

    //---------------------------------------
    //	Attributes
    //---------------------------------------
    /**
     * @param value: It represents the integer value.
     */
    private int value;

    //---------------------------------------
    //	Constructor
    //---------------------------------------
    /**
     * The constructor creates 1 instance (1 object) of the class myInt<br>
     * @param n: The integer value you want the object to take.
     */
    public MyInt(int n){
        this.value = n;
    }

    //---------------------------------------
    //	Get Method
    //---------------------------------------
    /**
     * Given a concrete integer wrapper object (this), the function returns its integer value.<br>
     * @return: The integer value of the concrete object (this) calling to the method.
     */
    public int get_value(){
        return this.value;
    }

    //---------------------------------------
    //	Set Method
    //---------------------------------------
    /**
     * Given a concrete integer wrapper object (this), the function modifies its integer value.<br>
     * @param n: The new integer value for the concrete object (this) calling to the method.
     */
    public void set_value(int n){
        this.value = n;
    }

}