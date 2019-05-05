
package bankaccount;

import static bankaccount.BankAccount.currentBalance;
import java.text.NumberFormat;
import java.util.Scanner;


public class SavingsAccount extends BankAccount{
    
    Scanner sc = new Scanner(System.in);
    
   
    
    public double makeWithdrawal(double currentBalance) {
        
       
        if (accountStatus == true) {
             System.out.println("Enter withdrawal amount: ");
        if (sc.hasNextDouble()) {
            amountOfWithdrawal = sc.nextDouble();
        } else {
            amountOfWithdrawal = -1;
        }
        sc.nextLine();
        
        while (amountOfWithdrawal < 0) {
            System.out.println("Invalid amount! Enter withdrawal amount: ");
            if (sc.hasNextDouble()) {
                amountOfWithdrawal = sc.nextDouble();
            } else {
                amountOfWithdrawal = -1;
            }
            sc.nextLine();
        }
        
         
        
         
        super.makeWithdrawawal(amountOfWithdrawal);
         
       
        
       
          
            
        } 
        
         
        
       
       
        return currentBalance;
}
    
    @Override
    public double makeDeposit(double currentBalance) {
         if (accountStatus == false) {
            if (amountOfDeposit + currentBalance > 25) {
                accountStatus = true;
            }
         
         }
    
         
        System.out.println("Enter deposit amount: ");
                   
        if (sc.hasNextDouble()) {
            amountOfDeposit = sc.nextDouble();
        } else {
            amountOfDeposit = -1;
        }
        sc.nextLine();
        
        while (amountOfDeposit < 0) {
            System.out.println("Invalid amount! Enter deposit amount: ");
            if (sc.hasNextDouble()) {
                amountOfDeposit = sc.nextDouble();
            } else {
                amountOfDeposit = -1;
            }
            sc.nextLine();
        }
       
        super.makeDeposit(amountOfDeposit);
        
       
       
      return currentBalance;
    }
   
    
    
    @Override
   public void doMonthlyReport() {
          if (numberOfWithdrawals > 4) {
              totalServiceCharge = 1.00 * (numberOfWithdrawals - 4);
       
   }
      
          if (accountStatus = false) {
                 accountStatusString =  "Inactive";
            } else {
                accountStatusString =  "Active";
            }
         
          
            String startingBalanceString = NumberFormat.getCurrencyInstance().format(startingBalance);
             String totalServiceChargeString = NumberFormat.getCurrencyInstance().format(totalServiceCharge);
             String currentBalanceString = NumberFormat.getCurrencyInstance().format(currentBalance);
            System.out.println("Starting Balance\tTotal Amount of Deposits\tTotal Amount of Withdrawals\tService Charges\t\tCurrent Balance\t\tAccount Status");
            System.out.println("_______________________________________________________________________________________________________________________________________________________");
           System.out.println(startingBalanceString + "\t\t\t\t" + numberOfDeposits + "\t\t\t\t" + numberOfWithdrawals + "\t\t\t" + totalServiceChargeString + "\t\t\t" + currentBalanceString + "\t\t\t" + accountStatusString);
           
           super.doMonthlyReport();
      
   }
    
}



