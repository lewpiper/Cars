
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
    
    //Adds gas to keep the gallons in tank variable updated correctly from the gas amount passed in
    public void addGas(double gasAmount)
    {
        gallonsInTank += gasAmount;
    }
    
    //Removes gas from the tank based on the MPG and miles driven passed in from the tester class
    public void drive(double milesDriven)
    {
        gallonsInTank -= (milesDriven/milesPerGallon);
    }
    
    //Calculates the remaining range at any point by multiplying the gallons left by the MPG
    public double range()
    {
        return gallonsInTank*milesPerGallon;
    }
}
