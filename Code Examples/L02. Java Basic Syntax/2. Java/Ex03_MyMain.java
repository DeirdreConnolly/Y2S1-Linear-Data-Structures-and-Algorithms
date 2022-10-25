
/**
 * The main class of our project.<br>.
 */

import java.util.*;

public class MyMain {

    //-------------------------------------
    //	myFunction
    //-------------------------------------
    public static void myFunction(){
        // 1. Example of an arithmetic operator
        int x1 = 6 + 3;
        int x2 = 6 / 3;

        // 2. Example of a relational operator
        boolean y1 = 6 == 3;
        boolean y2 = 6 >= 3;

        // 3. Example of a logical operator
        boolean z1 = (6 > 0) && (0 > 2);
        boolean z2 = !(6 > 5);

        //4. Example of an assignment operator
        int t1 = x2;
        int t2 = t1 + 1;
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
