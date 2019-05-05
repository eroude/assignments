
package bankaccount;

import java.text.NumberFormat;
import java.util.Scanner;


public abstract class BankAccount {

    
    
    Scanner sc = new Scanner(System.in);
    
    protected double startingBalance = 200.0;
    protected static double currentBalance;
    protected static double totalDeposits;
    protected static int numberOfDeposits;
    protected static double totalWithdrawals;
    protected static int numberOfWithdrawals;
    protected double annualInterestRate = 3.0;
    protected double serviceCharge = 15.0;
    protected boolean accountStatus = true;
    protected String accountBalanceString = "";
    protected double amountOfDeposit;
    protected double amountOfWithdrawal;
    protected static double totalServiceCharge;
    protected double monthlyFee = 5.00;
    protected String accountStatusString = "";
    
    
    BankAccount() {
       
    }
    
    //CHECKED IT IS CORRECT
    //CHECK IF CURRENT BALANCE OR STARTING BALANCE SHOULD BE USED HERE, IF INCORRECT CHANGE ARGUMENTS & IN BODY
    public BankAccount(double accountCurrentBalance, double accountAnnualInterestRate) {
       currentBalance = accountCurrentBalance; 
       annualInterestRate = accountAnnualInterestRate;
    }
    
    
    public double getStartingBalance() {
        return startingBalance;
    }
    
    public void setStartingBalance(double accountStartingBalance) {
        startingBalance = accountStartingBalance;
    }
    
    public double getCurrentBalance() {
        return currentBalance;
    }
    
    public void setCurrentBalance(double accountCurrentBalance) {
        currentBalance = accountCurrentBalance;
    }
    
    public double getTotalDeposits() {
        return totalDeposits;
    }
    
    public void setTotalDeposits(double accountTotalDeposits) {
        totalDeposits = accountTotalDeposits;
    }
    
    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }
    
    public void setNumberOfDeposits(int accountNumberOfDeposits) {
        numberOfDeposits = accountNumberOfDeposits;
    }
    
    public double getTotalWithdrawals() {
        return totalWithdrawals;
    }
    
    public void setTotalWithdrawals(double accountTotalWithdrawals) {
        totalWithdrawals = accountTotalWithdrawals;
    }
    
    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }
    
    public void setNumberOfWithdrawals(int accountNumberOfWithdrawals) {
        numberOfWithdrawals = accountNumberOfWithdrawals;
    }
    
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
     
    public double getTotalServiceCharge() {
        
        return totalServiceCharge;
    }
    
    public boolean getAccountStatus() {
        return accountStatus;
    }
    
     
    public void setAccountStatus(boolean accountAccountStatus) {
        accountStatus = accountAccountStatus;
    }
    
    
    public double makeDeposit(double amountOfDeposit) {
         
       
        
       
        numberOfDeposits++;
        
       
        currentBalance = currentBalance + amountOfDeposit;
        String currentBalanceString = NumberFormat.getCurrencyInstance().format(currentBalance);
        
        System.out.println("Current Balance: " + currentBalanceString);
        
        return currentBalance;
    }
    
   
    public double makeWithdrawawal(double amountOfWithdrawal) {
        
        
        numberOfWithdrawals++;
       
        currentBalance = currentBalance - amountOfWithdrawal;
        String currentBalanceString = NumberFormat.getCurrencyInstance().format(currentBalance);
        System.out.println("Current Balance: " + currentBalanceString);
        
        return currentBalance;
    }
    
    //CHECK THIS METHOD
    public double calculateInterest() {
        double monthlyInterestRate = (annualInterestRate / 12);
        double monthlyInterest = currentBalance * monthlyInterestRate;
        currentBalance = currentBalance + monthlyInterest;
        return currentBalance;
    }
    
    
    public void doMonthlyReport() {
       
        calculateInterest();
        numberOfWithdrawals = 0;
        numberOfDeposits = 0;
        totalServiceCharge = 0;
        
    }

}
