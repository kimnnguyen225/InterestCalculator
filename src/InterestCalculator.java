import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        /**
         * This application should use the BigDecimal class to make sure that all calculations are accurate. It should round the interest that’s calculated to two decimal places, rounding up if the third decimal place is five or greater.
         * The application should format currencies to allow for up to 2 decimal places and percentages to allow for up to 3 decimal places.
         * Assume that the user will enter valid double values for the loan amount and interest rate.
         * The application should continue only if the user enters “y” or “Y” to continue.
         */

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // display welcome message
        System.out.println("Welcome to the Interest Calculator");
        System.out.println();

        // perform calculation until choice isn't y or Y
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input data from user
            System.out.println("Enter loan amount: ");
            String loanString = sc.next();
            System.out.println("Enter interest rate: ");
            String interestRateString = sc.next();
            System.out.println();

            // math
            // Without BigDecimal arithmetic, these values:
            // loan = 4944.5
            // interestRate = .01
            // would result in a rounding error of $49.445

            // With BigDecimal arithmetic, these values
            // will be rounded correctly to $49.45
            BigDecimal loan = new BigDecimal(loanString);
            BigDecimal interestRate = new BigDecimal(interestRateString);
            BigDecimal interest = loan.multiply(interestRate).setScale(2, RoundingMode.HALF_UP);
            // interest = interest.setScale(2, RoundingMode.HALF_UP);

            // create NumberFormat object for percentages
            NumberFormat interestRatePercent = NumberFormat.getPercentInstance();
            interestRatePercent.setMaximumFractionDigits(3);

            // create NumberFormat object for currency
            NumberFormat currency = NumberFormat.getCurrencyInstance();

            // display result
            System.out.println("Loan amount: " + currency.format(loan));
            System.out.println("Interest rate: " + interestRatePercent.format(interestRate));
            System.out.println("Interest: " + currency.format(interest));

            // ask if user wants to continue
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        sc.close();
    }
}
