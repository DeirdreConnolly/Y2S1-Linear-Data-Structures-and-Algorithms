
/**
 * The main class of our project.<br>.
 */

public class MyMain {

    //-------------------------------------
    //	Global Variable
    //-------------------------------------
    public static int a = 2;

    //-------------------------------------
    //	myFunction
    //-------------------------------------
    public static void myFunction(){
        // 1. We access to the global variable
        if (a > 1) {
            System.out.println("A");
        }

        // 2. If we try to use a non-declared variables, the program fails
        //if (b > 1) {
        //    System.out.println("B");
        //}

        //3. If we declare b first, then we can use it inside the function
        int c = 3;
        if (c > 1){
            System.out.println("C");
        }

        //4. What we declare inside a loop statement is not accessible outside from it
        for (int var = 0; var < 5; var++) {
            int d = 8;
        }
        //System.out.println(d);
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
