/* Name: Polina Iaremchuk
# Date: 03/11/2024
# Class: CSC 1120
# Pledge: I have neither given nor received unauthorized aid on this
program.
# Description: The Bank Account Class allows for updates and
modification to the child classes. Simulation of the banking system.
Account parent class, Checking, Savings, and CreditCard child classes.
RuBank runnable class with a method main.
# Methods: setName(), setTaxID(), setBalance(),
getName(), getTaxID(), getBalance(), makeDeposit(double amount), display().
# Input: The user types their choice of operation. After the selection, some choices like "Make a Charge"
might require two-step input: String and double.
# Output:The program will display the rolling balance of each of the
classes and guiding questions.
*/
//library
import java.util.ArrayList;
 public class Account {
     //variables
    protected String name;        //Name of account owner, a string.
    protected int taxID;         //social security number, an int.
    protected double balance;    //an amount in dollars, a double.
    protected double[] last10withdraws = new double[10]; // – a double array of size 10. The last 10 withdrawal amounts.
    protected double[] last10deposits = new double[10];// – a double array of size 10. The last 10 deposit amounts.
    protected int numDeposits = 0;      // – number of deposits, an int.
    protected int numWithdraws = 0;     // – number of withdrawals, an int.
    protected ArrayList<String> options = new ArrayList<>(); // An array list for storing options for a user.

    //Constructor:
    //A constructor with no parameters.
    public Account(){
        name = "";
        taxID = 0;
        balance = 0.0;
        //add values to the options ArrayList.
        options.add(0, " ");
        options.add(1, " Savings Deposit");
        options.add(2, " Savings withdrawal  ");
        options.add(3, " Checking Deposit");
        options.add(4, " Write A Check  ");
        options.add(5, " Credit Card Payment ");
        options.add(6, " Make A Charge");
        options.add(7, " Display Savings");
        options.add(8, " Display Checking    ");
        options.add(9, " Display Credit Card  ");
        options.add(10, " Exit");
    }

     //Constructor with a name, taxID and balance as parameters
    public Account(String Name, int TaxID, double Balance){
        name = Name;
        taxID = TaxID;
        balance = Balance;
        //add values to the options ArrayList.
        options.add(0, " ");
        options.add(1, " Savings Deposit");
        options.add(2, " Savings withdrawal  ");
        options.add(3, " Checking Deposit");
        options.add(4, " Write A Check  ");
        options.add(5, " Credit Card Payment ");
        options.add(6, " Make A Charge");
        options.add(7, " Display Savings");
        options.add(8, " Display Checking    ");
        options.add(9, " Display Credit Card  ");
        options.add(10, " Exit");
    }
   // Methods:
    //assigns a new value for each with error checking

   public void setName(String newName){ //assign new name
        name = newName;
   }
    public void setTaxID(int newTaxID){  // assign new taxID
        String str = Integer.toString(newTaxID);
        if (str.length() != 9) {
            System.out.println("Error, enter 9 digit SSN");
        }else {
            taxID = newTaxID;}
    }
    public void setBalance(double newBalance){ // assign new Balance
        if (balance>=0){
        balance = newBalance;}else{System.out.println("Error, balance can't be negative");}
    }

    // returns a value for each variable.
    //@returns name;
    public String getName(){
       return name;
    }
     //@returns taxID;
    public int getTaxID()
    {
        return taxID;
    }
     //@returns balance;
    public double getBalance()
    {
        return balance;
    }

    //@Param double amount.
    //Adjusts the balance and put it in the deposit array.
    public void makeDeposit( double amount )
    {
        if(numDeposits<10&&numDeposits>=0){
        balance = balance + amount;
        last10deposits[numDeposits++] = amount;

        }else{System.out.print("Error, number of deposits is out of its limits");
        }
        System.out.println();


    }

    // a method to display the name, taxID and balance.
    public void display() {
       System.out.println("Name: " + getName());
       System.out.println("SSN: "+ getTaxID());
       System.out.println("Balance: " + getBalance());
    }

     // a method to display the menu.
    public void menu(){
        System.out.println("=================================================================================================================");
        System.out.println("\t\t\t\t\t\t\t      Polina Banking LLC Financial Services.\t\t                                                   ");
        System.out.println("=================================================================================================================");
    }
     // a method to display the options. Prints out options Arraylist.
    public void showOptions()
    {
        System.out.println("Options:");
        for(int i = 1; i < options.size(); i++) {
            System.out.print(i + ". " + options.get(i) + "    ");
            if (i % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println();

    }

}
