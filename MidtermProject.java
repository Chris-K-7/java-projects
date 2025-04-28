
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/* Name: Christopher Kouba
 * Course: CSC 135
 * Project: MidtermV1-Kouba_Christopher
 * File Name: MidtermProject.java
 */

public class MidtermProject {
    //--------------------------------------------------------------------
    //This program asks for 3 values from the user, then prints out the user's monthly payment and other values using various interest rates.    //--------------------------------------------------------------------
    //-------------------------------------------------------------------- 
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    double aIR, mIR, M, monthlyPayment;
    int nOY;
    
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    DecimalFormat format = new DecimalFormat("0.00");
    
    System.out.println("Enter your annual interest rate(for example, if 5%, enter 5): ");
    aIR = scan.nextDouble();
    aIR = aIR/100;
            
    System.out.println("Enter number of years your mortgage will be held: ");
    nOY = scan.nextInt();
    
    System.out.println("Enter a number representing mortgage amount borrowed from the bank without the dollar sign:  ");
    M = scan.nextDouble();
    
    mIR = (aIR / 12);
    monthlyPayment = (mIR * M) / (1-(1/Math.pow(1+mIR, (12*nOY))));
    System.out.println("Your monthly payment is: " + "$" + format.format(monthlyPayment));
    
    
    double interestRate, totalPayment, $overPayment, percentOverpayment;
    interestRate = aIR * 100;
    System.out.println();
    System.out.println("Your mortgage amount in dollars is: " + "$" + format.format(M));
    System.out.println("The number of years your mortgage is held is: " + nOY);
    System.out.println("Range of Interest Rates: " + (interestRate - 1) + "% - " + (interestRate + 1) + "%");
    System.out.println();
    System.out.println();
    
    System.out.println("Interest Rate   " + "Monthly Payment   " + "Total Payment   " + "$ Overpayment   " +   "% Overpayment");
        
    interestRate  = interestRate - 1;
    monthlyPayment = (((interestRate/100) / 12) * M) / (1-(1/Math.pow(1+((interestRate/100)/12), (12*nOY))));
    totalPayment = monthlyPayment * (nOY*12);
    $overPayment = totalPayment - M;
    percentOverpayment = ($overPayment / M);
    percentOverpayment = percentOverpayment * 100;
    
    System.out.println(interestRate + "%            " + currency.format(monthlyPayment) + "            " + currency.format(totalPayment) + "       " + currency.format($overPayment) + "       " + format.format(percentOverpayment) + "%");
    interestRate  = interestRate + 0.5;
    monthlyPayment = ((interestRate / 100) / 12 * M) / (1-(1/Math.pow(1+((interestRate / 100)/12), (12*nOY))));
    totalPayment = monthlyPayment * (nOY*12);
    $overPayment = totalPayment - M;
    percentOverpayment = ($overPayment / M);
    percentOverpayment = percentOverpayment * 100;

    System.out.println(interestRate + "%            " + currency.format(monthlyPayment) + "            " + currency.format(totalPayment) + "       " + currency.format($overPayment) + "       " + format.format(percentOverpayment) + "%");
    interestRate  = interestRate + 0.5;
    monthlyPayment = ((interestRate / 100) / 12 * M) / (1-(1/Math.pow(1+((interestRate / 100)/12), (12*nOY))));    totalPayment = monthlyPayment * (nOY*12);
    $overPayment = totalPayment - M;
    percentOverpayment = ($overPayment / M);
    percentOverpayment = percentOverpayment * 100;
    
    System.out.println(interestRate + "%            " + currency.format(monthlyPayment) + "            " + currency.format(totalPayment) + "       " + currency.format($overPayment) + "       " + format.format(percentOverpayment) + "%");
    interestRate  = interestRate + 0.5;
    monthlyPayment = ((interestRate / 100) / 12 * M) / (1-(1/Math.pow(1+((interestRate / 100)/12), (12*nOY))));    totalPayment = monthlyPayment * (nOY*12);
    $overPayment = totalPayment - M;
    percentOverpayment = ($overPayment / M);
    percentOverpayment = percentOverpayment * 100;

    System.out.println(interestRate + "%            " + currency.format(monthlyPayment) + "            " + currency.format(totalPayment) + "       " + currency.format($overPayment) + "       " + format.format(percentOverpayment) + "%");
    interestRate  = interestRate + 0.5;
    monthlyPayment = ((interestRate / 100) / 12 * M) / (1-(1/Math.pow(1+((interestRate / 100)/12), (12*nOY))));    totalPayment = monthlyPayment * (nOY*12);
    $overPayment = totalPayment - M;
    percentOverpayment = ($overPayment / M);   
    percentOverpayment = percentOverpayment * 100;
    System.out.println(interestRate + "%            " + currency.format(monthlyPayment) + "            " + currency.format(totalPayment) + "       " + currency.format($overPayment) + "       " + format.format(percentOverpayment) + "%");
    
    }
    
}
