
package calendargenerator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class CalendarGenerator {

    
    private int enteredYear;
    private int enteredMonth;
    
    public void perform() {
        System.out.println("Monthly Calendar Generator");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-digit year (after 1969): ");
        if(sc.hasNextInt()) {
            enteredYear = sc.nextInt();
        } else {
            enteredYear = -1;
        }
        sc.nextLine();
        
        while ((enteredYear < 1970) || (enteredYear > 9999)) {
            System.out.println("Invalid entry! Enter a 4-digit year greater than 1969: ");
            if (sc.hasNextInt()) {
                enteredYear = sc.nextInt();
            } else {
                enteredYear = -1;
            }
            sc.nextLine();
        }
        
        System.out.println();
        System.out.println("Enter a month (1 to 12): ");
        if(sc.hasNextInt()) {
            enteredMonth = sc.nextInt();
        } else {
            enteredMonth = -1;
        }
        sc.nextLine();
        
        while ((enteredMonth < 1) || (enteredMonth > 12)) {
            System.out.println("Invalid entry! Enter a month (1 to 12): ");
            if (sc.hasNextInt()) {
                enteredMonth = sc.nextInt();
            } else {
                enteredMonth = -1;
            }
            sc.nextLine();
        }
        
        enteredMonth = enteredMonth - 1;
        System.out.println();
        System.out.println();
        GregorianCalendar enteredCalendar = new GregorianCalendar(enteredYear, enteredMonth, 1);
        
        System.out.println((enteredMonth + 1) + " / " + enteredCalendar.get(Calendar.YEAR));
        System.out.println();
        System.out.print("Su\tMo\tTu\tWe\tTh\tFr\tSa");
       
        ArrayList<Object> dates = new ArrayList<Object>();
       
        switch (enteredCalendar.get(Calendar.DAY_OF_WEEK)) {
             
             case 1:
               dates.add(" ");
               break;
             case 2:
               dates.add(" ");
               dates.add(" ");
               break;
             case 3:
               dates.add(" ");
               dates.add(" ");
               dates.add(" ");
               break;
             case 4:
               dates.add(" ");
               dates.add(" ");
               dates.add(" ");
               dates.add(" ");
               break;
             case 5:
               dates.add(" ");
               dates.add(" ");
               dates.add(" ");
               dates.add(" ");
               dates.add(" ");
               break;
             case 6:
               dates.add(" ");
               dates.add(" ");
               dates.add(" ");
               dates.add(" ");
               dates.add(" ");
               dates.add(" ");
               break;
             case 7:
                dates.add(" ");
                dates.add(" ");
                dates.add(" ");
                dates.add(" ");
                dates.add(" ");
                dates.add(" ");
                dates.add(" ");
                break;
                    
            }
        
         while (enteredCalendar.get(Calendar.MONTH) == enteredMonth) {
        
            dates.add(enteredCalendar.get(Calendar.DAY_OF_MONTH));
            enteredCalendar.add(Calendar.DAY_OF_MONTH, 1);
            
         }
         
       
         
         for (int i = 0; i < dates.size(); i++) {
             
              StringBuilder sb = new StringBuilder();
              sb.append(dates.get(i));
              sb.append("\t");
            
                  
                 if ((i) % 7 == 0 ) {
                      sb.append("\n");
                  }
                 System.out.print(sb);
              }
         
     
              
               
               System.out.println();
               System.out.println();
    }

    
    
    public static void main(String[] args) {
        
        
         CalendarGenerator cg = new CalendarGenerator();
        cg.perform();
}
    }
    
