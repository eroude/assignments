
package bankaccount;

import static bankaccount.BankAccount.currentBalance;
import java.text.NumberFormat;
import java.util.Scanner;


public class CheckingAccount extends BankAccount {
    
    Scanner sc = new Scanner(System.in);
    
    
    public double makeWithdrawal(double amountOfWithdrawal) {
        
        
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
        
        
        
        if (currentBalance - amountOfWithdrawal < 0) {
            currentBalance = currentBalance - serviceCharge;
            
            String serviceChargeString = NumberFormat.getCurrencyInstance().format(serviceCharge);
            System.out.println();
            System.out.println("Your account is overdrawn! You are being charged a service charge of " + serviceChargeString + ".");
            System.out.println();
            accountStatus = false;
          
        }
        
         
        
            
            super.makeWithdrawawal(amountOfWithdrawal);
            if (currentBalance < 0) {
            System.out.println("Your account is overdrawn! You cannot withdraw at this time.");
            System.exit(0);
            
            
        }
           
        return currentBalance;

    }
    
   
 
    
      
    @Override
    public void doMonthlyReport(){
       serviceCharge = monthlyFee + (super.getTotalWithdrawals() * 0.10);
        
       super.doMonthlyReport();
       
    }
   
}
