import java.util.Scanner;
import java.text.NumberFormat;
public class FutureValueApp {
 public static void main(String[] args) {
 System.out.println("The Future Value Calculator\n");

 try (Scanner sc = new Scanner(System.in)) {
    String choice = "y";
    while (choice.equalsIgnoreCase("y")) {
     // get input from the user
     System.out.print("Enter monthly investment: ");
     double monthlyInvestment = sc.nextDouble();
     // get the input from the user
     System.out.print("Enter number of years: ");
     int years = sc.nextInt();
    
     // get interest rate from user:
     NumberFormat currency = NumberFormat.getCurrencyInstance();
     NumberFormat percent = NumberFormat.getPercentInstance();
    
     // calculate the monthly interest rate:
    
    String table = "";
    
     // calculate the future value:
     String header = "Year(s)\t";
     for (double rate = 5.0; rate < 7.0; rate+= .5) {
     header += percent.format(rate/100) + "\t";
     }
    
    table += header + "\n";
    
     // calculating future value:
    
     for (int year = 1; year <= years; year++) {
     String row = year + "\t";
    
     // calculating the future value for each rate:
    
     for (double rate = 5.0; rate < 7.0; rate += .5) {
    
     int months = year * 12;
     double monthlyRate = rate / 12 / 100;
    
     double futureValue = 0.0;
     for (int i = 1; i <= months; i++) {
     futureValue = (futureValue + monthlyInvestment) * (1 +
    monthlyRate);
     }
     // add the future value for this rate to the row
     row += currency.format(futureValue) + "\t";
    
     }
     // add row to table
     table += row + "\n";
    
    
     }
    
     System.out.println(table);
    
     // get another calculation from user 
     System.out.print("Continue? (y/n): ");
     choice = sc.next();
     System.out.println();
     }
}
 System.out.println(" Bye Bye Bye Bye Bye!");
 }
}



