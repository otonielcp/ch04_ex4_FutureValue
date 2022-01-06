import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {
    public static void main(String[] args) {
        String choice = "y";
        double futureValue;
        NumberFormat nf;
        try (Scanner sc = new Scanner(System.in)) {
            // Create a NumberFormat object for currency
            while (choice.equalsIgnoreCase("y")) {
                System.out.print("Enter monthly investment amount: ");
                double monthlyInvestment = sc.nextDouble();
                System.out.print("Enter number of years: ");
                int years = sc.nextInt();
                System.out.print("Years\t");
                nf = NumberFormat.getPercentInstance();
                nf.setMinimumFractionDigits(1);

                // the for loop below will print the year and the future value
                for (double rate = 5.0; rate <= 6.5; rate = rate + 0.5) {

                    System.out.print(nf.format(rate / 100) + "\t\t");
                }
                nf = NumberFormat.getCurrencyInstance();  // the
                System.out.println();
                for (int i = 1; i <= years; i++) {
                    System.out.print(i + "\t");
                    // the for loop below will print the future value for each year
                    for (double rate = 5.0; rate <= 6.5; rate = rate + 0.5) {
                        futureValue = 0;
                        // calculate the future value for each year
                        for (int j = 1; j <= i * 12; j++) {
                            futureValue = (futureValue + monthlyInvestment)
                                    * (1 + rate / 1200);
                        }

                        System.out.print(nf.format(futureValue) + "\t"); // the future value is printed
                    }
                    System.out.println(); // the next year is printed

                }

                // Display the table header again
                System.out.print("Continue(Y/N) :");
                char ch = sc.next(".").charAt(0);
                if (ch == 'Y' || ch == 'y')
                    continue;
                else {
                    System.out.println("Bye Bye");
                    break;
                }

            }
        }

    }

}


