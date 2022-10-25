
/**
 * The main class of our project.<br>.
 */

public class MyMain {

    //-------------------------------------
    //	myFunction
    //-------------------------------------
    public static void myFunction(){
        // 1. We provide an if example
        int a = 2;
        if (a > 1) {
            System.out.println("1");
        }

        // 2. We provide an if-then-else example
        int b = 2;
        if (b < 1) {
            System.out.println("2A");
        }
        else {
            System.out.println("2B");
        }

        // 3. We provide a nested if example
        int c = 1;
        if (c > 2){
            if (c > 3) {
                System.out.println("3A");
            }
            else {
                System.out.println("3B");
            }
        }
        else {
            if (c > 1) {
                System.out.println("3C");
            }
            else {
                System.out.println("3D");
            }
        }


        // 4. We provide a while example
        int d = 5;
        while (d > 0) {
            System.out.print("D");
            d = d - 1;
        }
        System.out.println();


        // 5. We provide a for example
        int e = 7;
        for (int i = 0; i < e; i++) {
            System.out.print("E");
        }
        System.out.println();
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
