
/**
 * The main class of our project.<br>.
 */

import java.util.Random;

public class MyMain {

    //--------------------------
    // FUNCTION printPlusOne
    // -------------------------
    // It receives one input parameter but compute no output result
    public static void printPlusOne(int value) {
        //1. We use the input parameter
        int my_var = value + 1;

        //2. We do not return anything,just print the value of my_var
        System.out.println(my_var);
    }

    //--------------------------
    // FUNCTION myGenerate
    // -------------------------
    // It receives no input parameters but computes one output result
    public static int myGenerate() {
        //1. We create the output variable to return
        int res = 0;

        //2. We assign res to a random number
        Random r = new Random();
        res = r.nextInt(2);

        //3. We return res
        return res;
    }

    //---------------------------
    // FUNCTION myAdd
    //---------------------------
    // It receives two input parameters and compute one output result
    public static int myAdd(int x, int y) {
        // 1. We create the output variable to return
        int res = 0;

        // 2. We use the input parameters to compute the value of res
        res = x + y;

        // 3. We return res
        return res;
    }

    // ---------------------------
    // FUNCTION myFunction
    // ---------------------------
    // It receives no input parameters and computes no output result
    public static void myFunction() {
        // 1. We generate two random numbers
        int num1 = myGenerate();
        int num2 = myGenerate();

        // 2. We add them
        int new_num = myAdd(num1, num2);

        // 3. We print the result +1
        printPlusOne(new_num);
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
