
/**
 * Calculates changes in range based on car object and mpg from CarTester class. 
 * 
 * @author Lew Piper
 * @version 9/18/2016
 */
public class Car
{
    //Instance Variables
    private double milesPerGallon = 0;
    private double gallonsInTank = 0;

    /* Copy the contents of the miles per gallon passed in based on the newly created 
    car object from the CarTester.java file. Also initalize the number of gallons in
    the tank for any new car object created
    */
    public Car(double milesPerGallon)
    {
        this.milesPerGallon = milesPerGallon;
        gallonsInTank = 3.5;
    }

    public int addGas()
    {
        // put your code here
        return gallonsInTank;
    }
    
    public int drive()
    {
        // put your code here
        return gallonsInTank;
    }
    
    public void range()
    {
        // put your code here
    }
}
