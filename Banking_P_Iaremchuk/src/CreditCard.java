/* A specific derived class that represents a Credit Card account. It inherits
    Account.
    #Methods: debitCharge( String name, double amount ),makePayment( double amount) ,display(). */

public class CreditCard extends Account{


//Variables (private) :
    private int cardnumber; //– an int credit card's number.
    private String[] last10charges = new String[10];// – a string array of size 10. The last 10 names of the charges.
    int charge = 0; //counter for each charge

    //Constructor:
//A constructor with no parameters and one with name, taxID and balance parameters.
    public CreditCard(){
        cardnumber = 123456789;

    }
    public CreditCard(String Name, int TaxID, double Balance){
        super(Name,TaxID,Balance);
        cardnumber = 123456789;
    }


    //Methods:

    //@param String name, double amount.
    // Adjusts the balance and lists it as a withdrawal in the base class.
    public void debitCharge( String name, double amount ){

        if(amount<=balance) {
            balance = balance - amount; //we pay off our credit card
            last10charges[charge] = name;
            last10withdraws[numWithdraws++] = amount;

        charge++;}else {System.out.println("Error, you can't charge more than your current balance");}

    }

    //@param double amount.
    //Adjusts the balance and lists it as a deposit in the base class.
   public void makePayment( double amount) {
       if(numDeposits<10&&numDeposits>=0){
           balance = balance + amount;
           last10deposits[numDeposits++] = amount;

       }else{System.out.print("Error, number of deposits is out of its limits");
       }
       System.out.println();
   }

    //Displays the accounts charges ( name and amount ) and deposit record
    public void display() {
        super.display();
        System.out.println("Your Card Number: " + cardnumber);
        System.out.println("Your Credit Card charges: ");
        for(int i = 0; i<last10charges.length;i++){
            System.out.println(last10charges[i]+ ".  "+ last10withdraws[i]);}
        System.out.println("Deposit record: ");
        for(int i = 0; i< last10deposits.length; i++) {
            System.out.println(i+ ".  " +last10deposits[i]);
        }
    }

}
