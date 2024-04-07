/* A specific derived class that represents a bank savings account. It inherits
    Account.
    #Methods: doWithdraw(double amount), display(). */
public class Savings extends Account{
   //  A constructor with no parameters and one with name, taxID and balance
   //parameters
    public Savings()
    {
        super();
    }
   public Savings(String Name, int TaxID, double Balance){
       super(Name,TaxID,Balance);
   }

    // Methods:
   //@param double amount
   //adjusts the balance and lists it as a withdraw in the base class
    public void doWithdraw( double amount)
    {
        if(numWithdraws<10&&numWithdraws>=0){
            balance = balance - amount;
            last10withdraws[numWithdraws++] = amount;
        }else{System.out.print("Error, number of deposits is out of its limits");}

    }

    //displays the accounts withdrawal and deposit record
    public void display(){
        super.display();
        System.out.println("Accounts withdraws: ");
        for(int i = 0; i< last10withdraws.length; i++) {
            System.out.println(i + ".  " + last10withdraws[i]);
        }
        System.out.println("Deposit record: ");
        for(int i = 0; i< last10deposits.length; i++) {
            System.out.println(i+ ".  " +last10deposits[i]);
        }
    }

}
