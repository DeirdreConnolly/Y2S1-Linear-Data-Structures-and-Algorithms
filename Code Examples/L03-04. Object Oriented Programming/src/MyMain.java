
/**
 * The main class of our project.<br>.
 */
public class MyMain {

    //--------------------------------------------------
    //	drinkFunctionality
    //--------------------------------------------------
    /**
     * This function shows the main class and object-related concepts we must know for the module.<br>
     */
    public static void drinkFunctionality(){
        System.out.println("\n------------------------------\n\n   DRINK FUNCTIONALITY\n\n------------------------------\n");
        //1. We create some Drink objects.
        System.out.println("\n----------- 1. drink instances creation -----------");

        //1.1. A coffee with 5 sugar spoons
        Drink o1 = new Drink(true, 5);

        //1.2. A tea with 3 sugar spoons
        Drink o2 = new Drink(false, 3);

        //2. We use our objects to call to the getMethods.
        System.out.println("\n----------- 2. drink test for getMethods -----------");

        //2.1. Check the attributes of o1.
        boolean auxVar1 = o1.getType();
        System.out.println("\n--- 2.1. value of the attribute 'type' of the object o1 is referencing to ---");
        System.out.println(auxVar1);

        int auxVar2 = o1.getSugarSpoons();
        System.out.println("\n--- 2.2. value of the attribute 'sugarSpoons' of the object o1 is referencing to ---");
        System.out.println(auxVar2);

        //2.2. Check the attributes of o2.
        auxVar1 = o2.getType();
        System.out.println("\n--- 2.3. value of the attribute 'type' of the object o2 is referencing to ---");
        System.out.println(auxVar1);

        auxVar2 = o2.getSugarSpoons();
        System.out.println("\n--- 2.4. value of the attribute 'sugarSpoons' of the object o2 is referencing to ---");
        System.out.println(auxVar2);

        //3. We use our objects to call to the setMethods.
        System.out.println("\n----------- 3. drink test for setMethods -----------");

        o2.setType(true);
        o2.setSugarSpoons(4);

        auxVar1 = o2.getType();
        System.out.println("\n--- 3.1. New value of the attribute 'type' of the object o2 is referencing to ---");
        System.out.println(auxVar1);

        auxVar2 = o2.getSugarSpoons();
        System.out.println("\n--- 3.2. New value of the attribute 'sugarSpoons' of the object o2 is referencing to ---");
        System.out.println(auxVar2);

        //4. We use our objects to call to the extra functionality.
        System.out.println("\n----------- 4. drink test for extra functionality -----------");

        auxVar2 = o1.countCalories();
        System.out.println("\n--- 4.1. Amount of calories of the object o1 is referencing to ---");
        System.out.println(auxVar2);

        auxVar2 = o2.countCalories();
        System.out.println("\n--- 4.2. Amount of calories of the object o2 is referencing to ---");
        System.out.println(auxVar2);
    }

    //-------------------------------------
    //	refVars1
    //-------------------------------------
    /**
     * This function shows the difference in values between a primitive and a reference-based variable.<br>
     */
    public static void refVars1(){
        System.out.println("\n------------------------------\n         refVars1\n------------------------------");
        //1. Create 3 variables
        int i;
        boolean b;
        MyInt j;

        //2. Assign the 3 variables
        i = 3;
        b = true;
        j = new MyInt(7);

        //3. Print the variable values
        System.out.println("\n--- 1. Value of i ---");
        System.out.println(i);
        System.out.println("\n--- 2. Value of b ---");
        System.out.println(b);
        System.out.println("\n--- 3. Value of j ---");
        System.out.println(j); //--> j Prints a Memory address! The address of myInt previously created.

        System.out.println(j.get_value()); //--> j Prints a Memory address! The address of myInt previously created.


    }

    //-------------------------------------
    //	refVars2
    //-------------------------------------
    /**
     * This function shows the difference between a reference variable pointing to no object (i.e., null) or to an actual object.<br>
     */
    public static void refVars2(){
        System.out.println("\n------------------------------\n         refVars2\n------------------------------");
        //1. We can initialise reference variables with the special address 'null'.
        System.out.println("\n--- 1. Value of j when it is assigned to no object ---");
        MyInt j = null;	//--> It is a way of telling the Java compiler: "Hey, I'm declaring this reference variable. However, as I still don't know where is it going to point, I just make it to point to null by the moment"
        System.out.println(j);

        //2. When we create the object, the Reference variable points to it.
        System.out.println("\n--- 2. Value of j when it is assigned to new object being created ---");
        j = new MyInt(7);
        System.out.println(j); //--> Now j does not print to 'null', but to the concrete heap address where the new myInt has been created.

        //3. We cannot access to myInt explicitly.
        //   Instead, we need to access to it implicitly via the Reference Variable pointing to it.
        System.out.println("\n--- 3. Value of the attribute 'value' of the object j is referencing ---");
        System.out.println(j.get_value()); //--> We access to myInt operations via j. Here we use j to access to an observer operation.
        j.set_value(12); 	 			   //--> Here we use j to access to a mutable operation.

        //4. If we loose the reference variable, we can no longer access to myInt.
        System.out.println("\n--- 4. Value of j when it is dereferenced from its object to start pointing to no object ---");
        j = null;
        System.out.println(j);
        //You see, how do I access to myInt now?
        //myInt?? Who is myInt?
        //Indeed, as myInt is no longer accessible, the Java Garbage Collector removes it.
        //The Java Garbage Collector acts on the heap:
        //For each Object placed there, it checks if it is still accesible by the stack: "Hey, Object, are you still accessible? Are you referenced (directly or by transitivity) by any variable alive in the stack?"
        //If the answer is 'yes', then perfect. Object I allow you to keep staying in the heap.
        //If the answer is 'no', then Object, I'm sorry but I have to remove you from the heap, as you are occupying memory and nobody can access to you.
    }

    //-------------------------------------
    //	refVars3
    //-------------------------------------
    /**
     * This function shows the pass by value policy of Java for primitive variables.<br>
     */
    public static void refVars3(){
        System.out.println("\n------------------------------\n         refVars3\n------------------------------");
        int i = 3;

        System.out.println("\n--- 1. Value of i before calling to refVars3Extra ---");
        System.out.println(i);

        refVars3Extra(i);

        System.out.println("\n--- 2. Value of i after calling to refVars3Extra ---");
        System.out.println(i);
    }

    //-------------------------------------
    //	refVars3Extra
    //-------------------------------------
    /**
     * Extra function for refVars3. Needed to check the parameter passing policy.<br>
     * @param n: The primitive variable being passed as argument.
     */
    public static void refVars3Extra(int n){
        System.out.println("\n--- 1. Value of n before assigning it to 5 ---");
        System.out.println(n);

        //You see, example3 used i as a parameter, but in this function the parameter is called n.
        //Java uses "Value parameter passing" --> The argument is copied.

        //Also, you see, we can define one variable called 'i' here (let's call it example3_extra::i).
        //This variable is different from example3::'i' of example3.
        int i = 4;

        //We can modify 'n' here. But, as 'n' is a copy of example3::'i', this latter is not affected.
        n = 5;

        System.out.println("\n--- 2. Value of n after assigning it to 5 ---");
        System.out.println(n);
    }

    //-------------------------------------
    //	refVars4
    //-------------------------------------
    /**
     * This function shows the pass by reference policy of Java for reference-based variables.<br>
     */
    public static void refVars4(){
        System.out.println("\n------------------------------\n         refVars4\n------------------------------");
        MyInt i = null;
        i = new MyInt(3);
        System.out.println("\n--- 1. Value of i ---");
        System.out.println(i);

        System.out.println("\n--- 2. Value of the attribute 'value' of the object i is referencing before calling to refVars4Extra---");
        System.out.println(i.get_value());

        refVars4Extra(i);

        System.out.println("\n--- 3. Value of the attribute 'value' of the object i is referencing after calling to refVars4Extra---");
        System.out.println(i.get_value());
    }

    //-------------------------------------
    //	refVars4Extra
    //-------------------------------------
    /**
     * Extra function for refVars4. Needed to check the parameter passing policy.<br>
     * @param n: The reference-based variable being passed as argument.
     */
    public static void refVars4Extra(MyInt n){
        //You see, example4 used i as a parameter, but in this function the parameter is called n.
        //Java uses "Value parameter passing" --> The argument is copied.
        //However, here n is a reference variable. So, yes, 'n' is a copy of 'i', they are DIFFERENT variables. But BOTH POINT to the SAME Object in the heap!
        System.out.println("\n--- 1. Value of n ---");
        System.out.println(n);

        System.out.println("\n--- 2. Value of the attribute 'value' of the object n is referencing before setting it to 5 ---");
        System.out.println(n.get_value());

        //We can modify myOjbect via its reference variable 'n'.
        //As example4_function1::'n' and example4::i point to the same myInt, if we modify it from 'n' will see myInt it points to modified as well!
        n.set_value(5);
        System.out.println("\n--- 3. Value of the attribute 'value' of the object n is referencing after setting it to 5 ---");
        System.out.println(n.get_value());
    }

    //-------------------------------------
    //	refVars5
    //-------------------------------------
    /**
     * This function shows the difference between the reference-based variable itself and the object it points to.<br>
     */
    public static void refVars5(){
        System.out.println("\n------------------------------\n         refVars5\n------------------------------");
        //1. We create one reference variable
        MyInt o1 = null;
        o1 = new MyInt(3);

        //2. We create another one. As we see, both point to the same myInt.
        System.out.println("\n--- Scenario 1: o2 is assigned to o1 ---");
        MyInt o2 = o1;
        System.out.println("\n--- Do o1 and o2 reference the same object? ---");
        System.out.println(o1 == o2);
        System.out.println("\n--- Do the objects referenced by o1 and o2 contain the same integer? ---");
        System.out.println(o1.get_value() == o2.get_value());

        //3. Let's suppose now we create a new object and make o2 point to it.
        System.out.println("\n--- Scenario 2: o2 is assigned to reference a new object being created ---");
        o2 = new MyInt(7);
        System.out.println("\n--- Do o1 and o2 reference the same object? ---");
        System.out.println(o1 == o2);
        System.out.println("\n--- Do the objects referenced by o1 and o2 contain the same integer? ---");
        System.out.println(o1.get_value() == o2.get_value());

        //3. Let's suppose now we create a new object (with same value as the first we created) and make o2 point to it.
        System.out.println("\n--- Scenario 3: o2 is assigned to reference a new object being created, and the attribute 'value' of this object is the same as the one of the object o1 is referencing to ---");
        o2 = new MyInt(3); //Please remember, at this moment the object created before is removed by the Java Garbage Collector.
        System.out.println("\n--- Do o1 and o2 reference the same object? ---");
        System.out.println(o1 == o2);
        System.out.println("\n--- Do the objects referenced by o1 and o2 contain the same integer? ---");
        System.out.println(o1.get_value() == o2.get_value());
    }

    //--------------------------------------------------
    //	refVarsFunctionality
    //--------------------------------------------------
    /**
     * This function shows the main primitive vs reference variables concepts we must know for the module.<br>
     */
    public static void refVarsFunctionality(){
        System.out.println("\n------------------------------------------\n\n   REFERENCE VARIABLES FUNCTIONALITY\n\n------------------------------------------\n");
        refVars1();
        refVars2();
        refVars3();
        refVars4();
        refVars5();
    }

    //--------------------------------------------------
    //	MAIN
    //--------------------------------------------------
    /**
     * Main Method:<br>
     * 1) It calls to drinkFunctionality.<br>
     * The function shows the main class and object-related concepts we must know for the module.<br>
     * 2) It calls to refVarsFunctionality.<br>
     * The function shows the main primitive vs. reference variables concepts we must know for the module.<br>
     * @param args: We will run the program parameter free, so do not worry about it.
     */
    public static void main(String[] args) {
        //We call to drinkFunctionality
        drinkFunctionality();

        //We call to refVarsFunctionality
        refVarsFunctionality();
    }

}