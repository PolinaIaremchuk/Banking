/*
 A specific derived class that represents a bank checking account.
  Child class Checking inherits from Account class.

  # Methods: writeCheck( int checkNum, double amount ),  display().
*/

public class Checking extends Account{

      //      parameters
    int check = 0; //counter for each check
    private int[] last10checks = new int[10];// – an int array of size 10. The last 10 check numbers.
    public Checking()
    {
        super();

    }
    public Checking(String Name, int TaxID, double Balance){
        super(Name,TaxID,Balance);

    }
    //Variables (private):

    //Methods:
    public void writeCheck( int checkNum, double amount ) // - adjust the balance and list it as a withdraw in the base class
    {

        if ( amount <= balance) {
            balance = balance - amount;
            last10checks[check] = checkNum;
            last10withdraws[numWithdraws++] = amount;
        } else {System.out.println("Error, amount is bigger than balance");
        }
        check++;
    }
    public void display(){ // - display the accounts check register (number and amount) and deposit  record.
        super.display();
        System.out.println("Accounts check register: ");
        for(int i = 0; i< last10checks.length; i++) {
            System.out.println(last10checks[i] + ".  " + last10withdraws[i]);
        }
        System.out.println("Deposit record: ");
        for(int i = 0; i< last10deposits.length; i++) {
            System.out.println(i+ ".  " +last10deposits[i]);
        }
    }


}
