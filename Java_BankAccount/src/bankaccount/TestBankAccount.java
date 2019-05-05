
package bankaccount;

import static bankaccount.BankAccount.currentBalance;
import java.util.Scanner;


public class TestBankAccount {
    SavingsAccount sa = new SavingsAccount();
    CheckingAccount ca = new CheckingAccount();
    
     
    
    String bankMenuChoice = "";
    String bankAccountOperation = "";
    String savingsMenuChoice = "";
    
    
    
    
      
          public void gettingBankMenuChoice() {
               
           
          
    
         Scanner sc = new Scanner(System.in);   
        System.out.println("Which account would you like to access?");
        System.out.println("A:   Savings \nB:   Checking \nC:   Exit");
        if (sc.hasNext()) {
            bankMenuChoice = sc.next();
        } else {
            bankMenuChoice = "F";
        }
        sc.nextLine();
        
        while (!(bankMenuChoice.equalsIgnoreCase("A")) && !(bankMenuChoice.equalsIgnoreCase("B")) && !(bankMenuChoice.equalsIgnoreCase("C"))) {
            System.out.println();
            System.out.println("Invalid selection. Which account would you like to access?\nA:   Savings \nB:   Checking \nC:   Exit");
            if (sc.hasNext()) {
                bankMenuChoice = sc.next();
            } else {
                bankMenuChoice = "F";
            }
            sc.nextLine();
        }
        if (bankMenuChoice.equalsIgnoreCase("A")) {
            System.out.println("You chose Savings.");
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("A:   Deposit\nB:   Withdraw\nC:   Report\nD:   Return to Bank Menu");
                if (sc.hasNext()) {
            bankAccountOperation = sc.next();
        } else {
            bankAccountOperation = "F";
        }
        sc.nextLine();
        
        while (!(bankAccountOperation.equalsIgnoreCase("A")) && !(bankAccountOperation.equalsIgnoreCase("B")) && !(bankAccountOperation.equalsIgnoreCase("C")) && !(bankAccountOperation.equalsIgnoreCase("D"))) {
            System.out.println();
            System.out.println("Invalid selection. What would you like to do? \nA:   Deposit\nB:   Withdraw\nC:   Report\nD:   Return to Bank Menu");
            if (sc.hasNext()) {
                bankAccountOperation = sc.next();
            } else {
                bankAccountOperation = "F";
            }
            sc.nextLine();
        }
            if (bankAccountOperation.equalsIgnoreCase("A")) {
            System.out.println("You chose Deposit.");
            System.out.println();
            sa.makeDeposit(currentBalance);
            System.out.println();
            gettingBankMenuChoice();
     
        } else if (bankAccountOperation.equalsIgnoreCase("B")) {
            
            System.out.println("You chose Withdraw.");
            System.out.println();
            sa.makeWithdrawal(currentBalance);
            System.out.println();
             
            System.out.println();
            gettingBankMenuChoice();
        } else if (bankAccountOperation.equalsIgnoreCase("C")) {
            System.out.println("You chose Report.");
            System.out.println();
            sa.doMonthlyReport();
            System.out.println();
            gettingBankMenuChoice();
        } else { 
            System.out.println();
            gettingBankMenuChoice();
        }
            System.out.println();
        }
        if (bankMenuChoice.equalsIgnoreCase("B")) {
            System.out.println("You chose Checking.");
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("A:   Deposit\nB:   Withdraw\nC:   Report\nD:   Return to Bank Menu");
            if (sc.hasNext()) {
            bankAccountOperation = sc.next();
        } else {
            bankAccountOperation = "F";
        }
        sc.nextLine();
        
        while (!(bankAccountOperation.equalsIgnoreCase("A")) && !(bankAccountOperation.equalsIgnoreCase("B")) && !(bankAccountOperation.equalsIgnoreCase("C")) && !(bankAccountOperation.equalsIgnoreCase("D"))) {
            System.out.println();
            System.out.println("Invalid selection. What would you like to do? \nA:   Deposit\nB:   Withdraw\nC:   Report\nD:   Return to Bank Menu");
            if (sc.hasNext()) {
                bankAccountOperation = sc.next();
            } else {
                bankAccountOperation = "F";
            }
            sc.nextLine();
        }
            if (bankAccountOperation.equalsIgnoreCase("A")) {
            System.out.println("You chose Deposit.");
            System.out.println();
            sa.makeDeposit(currentBalance);
            System.out.println();
            gettingBankMenuChoice();
        } else if (bankAccountOperation.equalsIgnoreCase("B")) {
            
            
            
            System.out.println("You chose Withdraw.");
            System.out.println();
           
            ca.makeWithdrawal(currentBalance);
            System.out.println();
           
            gettingBankMenuChoice();
        } else if (bankAccountOperation.equalsIgnoreCase("C")) {
            System.out.println("You chose Report.");
            System.out.println();
            sa.doMonthlyReport();
            System.out.println();
            gettingBankMenuChoice();
        } else { 
            System.out.println();
            gettingBankMenuChoice();
        }
            System.out.println();
        }
            if (bankMenuChoice.equalsIgnoreCase("C")) {
                System.out.println();
                System.out.println("Thank you. Goodbye.");
                System.exit(0);
            }
            }
          
        
        public void perform() {
            System.out.println("Welcome to the Banking App!\n");
            gettingBankMenuChoice();
         
        
        
        
        }
        
    
    public static void main(String[] args) {
       TestBankAccount tba = new TestBankAccount();
       tba.perform();
    }
}
    
    
    
    
  