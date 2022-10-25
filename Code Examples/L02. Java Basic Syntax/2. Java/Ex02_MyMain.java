
/**
 * The main class of our project.<br>.
 */

import java.util.*;

public class MyMain {

    //-------------------------------------
    //	myFunction
    //-------------------------------------
    public static void myFunction(){
        //1. We assign a to an integer value
        int a = 3;

        //2. We assign b to an float value
        double b = 3.5;

        //3. We assign c to a Boolean value
        boolean c = true;

        //4. We assign d to an String value
        String d = "Hello";

        //5. We assign e to a list of integer values
        ArrayList<Integer> e = new ArrayList<Integer>();
        e.add(1);
        e.add(2);
        e.add(3);

        //6. We assign f to a tuple of a pair of values, the first one a float and the second one a Boolean
        //Not directly supported

        //7. We assign g to a dictionary or hash table with three entries: 'Name', assigned to a String value; 'Age', assigned to an integer value; 'Goals', assigned to an integer value.
        // create a new hashtable
        Dictionary g = new Hashtable();
        g.put("Name", "Messi");
        g.put("Age", 29);
        g.put("Goals", 500);

        //8. Due to static typing, we cannot change the datatype of a variable
        //a = "Hello";

        //9. Due to strong typing, a value does not magically change its datatype
        d = "123";
        //int new_var = d + 5;
        int new_var = Integer.parseInt(d) + 5;
    }

    //-------------------------------------
    //	main
    //-------------------------------------
    /**
     * Main Method:<br>
     * Main method of the class.<br>
     * @param args: We will run the program parameter free, so do not worry about it.
     */
    public static void main(String[] args) {
        //1. We call to myFunction
        myFunction();
    }

}
