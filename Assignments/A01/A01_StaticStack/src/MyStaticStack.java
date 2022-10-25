import java.util.Arrays;

/**
 * ADT MyStack: Private Part<br>.
 * The class implements all the operations available in MyStack<br>
 */
public class MyStaticStack implements MyStack {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------
    private int items[];                                    // stores the items of MyStack
    private int maxItems;                                   // represents the max number of items a MyStack can contain
    private int numItems;                                   // represents the number of items of MyStack

    //-------------------------------------------------------------------
    // Basic Operation --> Check if myStack is empty: myCreateEmpty
    //-------------------------------------------------------------------
    //public myStack myCreateEmpty(){}

    public MyStaticStack(int m){
            this.maxItems = m;
            this.items = new int[this.maxItems];
            this.numItems = 0;
    }

    //-------------------------------------------------------------------
    // Basic Operation --> Check if MyStack is empty: isEmpty
    //-------------------------------------------------------------------

    public boolean isEmpty(){                               // returns true if length = 0, otherwise false
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        boolean res = true;

        //-----------------------------
        //SET OF OPS
        //-----------------------------


        //-----------------------------
        // I. SCENARIO IDENTIFICATION --> does it have anything in it?
        //-----------------------------
        int scenario = 0;

        if (this.numItems == 0) {                           // stack is empty
            scenario = 1;
        }
        else if (this.numItems > 0) {                       // stack is not empty
            scenario = 2;
        }

        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch(scenario){
            case 1:
                res = true;
                break;

            case 2:
                res = false;
                break;
        }

        //-----------------------------
        //Output Variable --> Return FinalValue
        //-----------------------------
        return res;
    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> Get and remove first element from top of MyStack: pop
    //-------------------------------------------------------------------

    public int pop() {                                      // pop == removal
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        int res = -1;

        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario = 0;

        if (this.numItems == 0) {                           // stack is empty
            scenario = 1;
        }

        else {                                              // stack is not empty
            scenario = 2;
        }

        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch(scenario) {
            case 1:                                         // stack is empty
                System.out.println("There are no items in the stack.\n");
                res = 0;
                break;

            case 2:                                         // stack contains items
                res = this.items[0];

                System.out.println(Arrays.toString(this.items));
                System.out.println("There are " + this.numItems + " items in the stack.\n");

                for (int i = 0; i < this.numItems - 1; i++) {
                    this.items[i] = this.items[i + 1];
                }
                this.items[this.numItems -1 ] = 0;
                this.numItems = this.numItems - 1;
                break;
        }

        //-----------------------------
        //Output Variable --> Return FinalValue
        //-----------------------------
        return res;
    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> Add element to the top of MyStack: push
    //-------------------------------------------------------------------

    public void push(int element){                          // push == addition
        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario = 0;

        if (this.numItems == 0) {                           // stack is empty
            scenario = 1;
            System.out.println("The stack is empty.\n");
        }

        else if (this.numItems > 0 && this.numItems < this.maxItems) {      // stack has some elements
            scenario = 2;
            System.out.println("The stack is not empty.\n");
        }

        else {                                              // stack is full
            scenario = 3;
            System.out.println("The stack is full.\n");
        }

        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch(scenario){
            case 1:
               this.items[0] = element;
               this.numItems = this.numItems + 1;

               System.out.println("Element " + element + " has been added.");
               break;

            case 2:
                for (int i = this.numItems; i > 0; i--) {
                    this.items[i] = this.items[i - 1];
                }
                this.items[0] = element;
                this.numItems = this.numItems + 1;

                System.out.println("Element " + element + " has been added.");
                break;

            case 3:
                System.out.println("The stack is full.");
                break;
        }
    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> prints all the elements from MyStack: print
    //-------------------------------------------------------------------

    public void print(){

        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario = 0;

        if (isEmpty()) {					                // stack is empty
            scenario = 1;
        }
        else {								                // stack is not empty
            scenario = 2;
        }

        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch (scenario) {
            case 1:
                System.out.println("The stack is empty.");
                break;

            case 2:
                System.out.println(Arrays.toString(this.items));
                break;
        }
    }
}