
/**
 * Our first pure Object Oriented Programming Java class, in the sense it is used to model a concept (a type of objects) of the problem we want to solve<br>.
 * The drink class produces and give functionality to n >= 0 Drink Objects<br>
 */
public class Drink {

    //---------------------------------------
    //	Attributes
    //---------------------------------------
    /**
     * @param: type: It represents the type of a drink (true - coffee; false - tea).
     * @param: sugarSpoons: It represents the amount of sugar spoons of a drink.
     */
    private boolean type;
    private int sugarSpoons;

    //---------------------------------------
    //	Constructor
    //---------------------------------------
    /**
     * The constructor creates 1 instance (1 object) of the class drink<br>
     * @param: t: The type of drink you want the object to be.
     * @param: s: The amount of sugar spoons you want the object to contain.
     */
    public Drink(boolean t, int s){
        this.type = t;
        this.sugarSpoons = s;
    }

    //---------------------------------------
    //	Get Methods
    //---------------------------------------
    /**
     * Given a concrete drink (this), the function returns its type.<br>
     * @return: The type of drink of the concrete object (this) calling to the method.
     */
    public boolean getType(){
        return this.type;
    }

    /**
     * Given a concrete drink (this), the function returns its number of sugar spoons.<br>
     * @return: The sugar spoons of the concrete object (this) calling to the method.
     */
    public int getSugarSpoons(){
        return this.sugarSpoons;
    }

    //---------------------------------------
    //	Set Method
    //---------------------------------------
    /**
     * Given a concrete drink (this), the function modifies the type of Drink it is.<br>
     * @param: The new type of drink for the concrete object (this) calling to the method.
     */
    public void setType(boolean t){
        this.type = t;
    }

    /**
     * Given a concrete drink (this), the function modifies the amount of sugar spoons it contains.<br>
     * @param: The new amount of sugar spoons for the concrete object (this) calling to the method.
     */
    public void setSugarSpoons(int s){
        this.sugarSpoons = s;
    }

    //---------------------------------------
    //	Extra Functionality
    //---------------------------------------

    /**
     * Given a concrete drink (this), the function computes its calories.<br>
     * @return: The amount of calories contained in the drink.
     */
    public int countCalories(){
        //---------------------------------------------
        //Output Variable --> InitialValue
        //---------------------------------------------
        int cal = 0;

        //---------------------------------------------
        //SET OF OPS
        //---------------------------------------------
        //OP1. If the drink is a coffee
        if (this.type == true)
            //OP1.1. We count 100 calories per sugar spoon
            cal = 100 * this.sugarSpoons;
            //OP2. If the drink is a tea
        else
            //OP2.1. We count 50 calories per sugar spoon
            cal = 50 * this.sugarSpoons;

        //---------------------------------------------
        //Output Variable --> Return FinalValue
        //---------------------------------------------
        return cal;
    }

}
