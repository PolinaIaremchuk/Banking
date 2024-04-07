/*Runnable class RunBank.
#A method main() that creates 3 objects, starts each with a balance of $100.
#Scanner class for user input*/
import java.util.Scanner;
public class RunBank {

    //A while loop that displays the following menu each time through the loop.
    //Balance is updated each time utilizing objects to perform the transactions.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input;
        boolean exit = false;

        //Creating objects
    Checking checking = new Checking("Checking", 222222222, 0);
    Savings savings = new Savings("Savings", 333333333, 0);
    CreditCard creditCard = new CreditCard("Credit Card", 444444444, 0);
        checking.makeDeposit(100);
        savings.makeDeposit(100);
        creditCard.setBalance(100);
    while(!exit)
    {

        checking.menu();
        System.out.println("*****************************************************************************************************************");
        System.out.println("||"+checking.getName()+":"+checking.getBalance() + "||                          ||"+savings.getName()+": " +savings.getBalance() +"||                                ||"+creditCard.getName()+": "+ creditCard.getBalance()+"||");
        System.out.println("*****************************************************************************************************************");
        checking.showOptions();
        System.out.println("*****************************************************************************************************************");
        System.out.println("||"+checking.getName()+":"+checking.getBalance() + "||                          ||"+savings.getName()+": " +savings.getBalance() +"||                                ||"+creditCard.getName()+": "+ creditCard.getBalance()+"||");
        System.out.println("*****************************************************************************************************************");
        checking.menu();
        System.out.println("What would you like to do? Select the option by entering the number from 1 to 10.");
        input =  scan.nextInt();
        if (input < 1 || input > 10) {
            System.out.println("Error, select only 1-10 options.");
            } else {
            switch (input) {  //switch for each option case
                case 1: System.out.println("Your Selection - 1. Savings Deposit. How much would you like to deposit?"); savings.makeDeposit(scan.nextDouble()); break;
                case 2: System.out.println("Your Selection - 2. Savings withdrawal. How much would you like to withdraw?"); savings.doWithdraw(scan.nextDouble()); break;
                case 3: System.out.println("Your Selection - 3. Checking Deposit. How much would you like to deposit?"); checking.makeDeposit(scan.nextDouble()); break;
                case 4: System.out.println("Your Selection - 4. Write A Check. Indicate check number. How much would you like to write for a check?"); checking.writeCheck(scan.nextInt(), scan.nextDouble()); break;
                case 5: System.out.println("Your Selection - 5. Credit Card Payment. What amount would you like to use from your Credit Card?"); creditCard.makePayment(scan.nextDouble()); break;
                case 6: System.out.println("Your Selection - 6. Make A Charge. What amount would you like charge to pay off your Credit Card? Enter month for the record and amount."); creditCard.debitCharge(scan.next(), scan.nextDouble());break;
                case 7: System.out.println("Your Selection - 7. Display Savings."); savings.display(); break;
                case 8: System.out.println("Your Selection - 8. Display Checking."); checking.display(); break;
                case 9: System.out.println("Your Selection - 9. Display Credit Card."); creditCard.display(); break;
                case 10: System.out.println("Your Selection - 10. Exit."); exit = true; break;
                }
              }

        }

    }


}
