
package internetserviceprovider;

import java.text.NumberFormat;
import java.util.Scanner;


public class InternetServiceProvider {

    
    private String packageChoice = "";
    private double hoursUsed;
    private double hoursIncluded;
    private double cost;
   
    private String gettingPackage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which package did you purchase? Enter A, B or C: ");
        if (sc.hasNext()) {
          packageChoice =  sc.next().toUpperCase();
        } else {
           packageChoice = "";
        }
        sc.nextLine();
        
        while ((!packageChoice.equals("A")) && (!packageChoice.equals("B")) && (!packageChoice.equals("C"))) {
            System.out.println("Invalid package! Please choose package A, B or C: ");
            if (sc.hasNext()) {
                packageChoice = sc.next().toUpperCase();
            } else {
                packageChoice = "";
            }
            sc.nextLine();
        }
        return  packageChoice;
    }
    
    private double gettingHours() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of hours used: ");
        if (sc.hasNextDouble()) {
            hoursUsed = sc.nextDouble();
        } else {
            hoursUsed = -1;
        }
        sc.nextLine();
        
        while ((hoursUsed < 0) || (hoursUsed > 744)) {
            System.out.println("Invalid number Enter a valid number of hours used (not greater than 744 hours): ");
            if (sc.hasNextDouble()) {
                hoursUsed = sc.nextDouble();
            } else {
                hoursUsed = -1;
            }
            sc.nextLine();
                    }
        return hoursUsed;
    }
    
        private double calculateCost(String packageChoice, double hoursUsed) {
            switch (packageChoice)
            {
                case "A":
                    hoursIncluded = 10.0;
                    if (hoursUsed <= hoursIncluded) {
                        cost = 9.95;
                    } else {
                        cost = (hoursUsed - hoursIncluded) * 2.00 + 9.95;
                    }
                    break;
                case "B":
                    hoursIncluded = 20.0;
                    if (hoursUsed <= hoursIncluded) {
                        cost = 14.95;
                    } else {
                        cost = ((hoursUsed - hoursIncluded) * 1.00) + 14.95;
                    }
                    break;
                case "C":
                    cost = 19.95;
                    break;
            }
            
            return cost;
        }
        
        public void perform() {
            System.out.println("Calculate Your Monthly Internet Cost!");
            System.out.println();
            gettingPackage();
            System.out.println("You chose package " + packageChoice + ".");
            gettingHours();
            System.out.println("You used " + hoursUsed + " hours.");
            calculateCost(packageChoice, hoursUsed);
            String costString = NumberFormat.getCurrencyInstance().format(cost);
            System.out.println("Your cost this month is " + costString + ".");
        }
    
    
    public static void main(String[] args) {
        InternetServiceProvider ISP = new InternetServiceProvider();
        ISP.perform();
    }
    
}
