
/**
 * The main class of our project.<br>.
 */

import java.lang.Math;

public class MyMain {

    //-------------------------------------
    //	myFunction
    //-------------------------------------
    public static void myFunction(String x){
        //1. Turn the value into an integer
        int value = Integer.parseInt(x);

        //2. Compute the logarithm
        double result = Math.log10(value);

        //3. Print the result
        System.out.println(result);
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
        //1. We collect the argument
        String x = args[0];

        //2. We call to myFunction
        myFunction(x);
    }

}
