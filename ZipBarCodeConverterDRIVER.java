import java.util.Scanner;

/* Name: Christopher Kouba
 * Course: CSC 135
 * Project: Final Project
 * File Name: ZipBarCodeConverterDRIVER.java
 */
//---------------------------------------------------------------------------------
// This program is the driver class for the ZipBarCodeConverter program.
//---------------------------------------------------------------------------------
public class ZipBarCodeConverterDRIVER {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int digit, num, sum = 0, checkDigit;
        String zipCode, strZip, barCode = "", option = "";
        boolean choice = true;
        
        while(choice) {
                sum = 0;  // Resets sum for each iteration of the loop
                
                System.out.println("Enter either a five or full nine digit zip code: ");
                zipCode = scan.next();

                if (zipCode.length() == 5) {
                    zipCode += "0000";
                }
                if (zipCode.length() == 9) {
                    // ZipCode is the correct length
                } else {
                    System.out.println("ERROR! You can only enter a five or a full nine digit valid zip code: ");
                    continue; // Starts loop again
                }

                System.out.println("Your zipCode is: \n" + zipCode);

                strZip = zipCode;
                System.out.print("|");      //Left frame bar

                for (int i = 0; i < strZip.length(); i++)    {

              digit = Integer.parseInt(strZip.substring(i, i+1));  


             switch(digit) {

                 case 0:
                     barCode += "||:::";
                     break;

                 case 1:
                     barCode += ":::||";
                     break;

                 case 2:
                     barCode += "::|:|";
                     break;

                 case 3:
                     barCode += "::||:";
                     break;   

                 case 4:
                     barCode += ":|::|";
                     break;

                 case 5:
                     barCode += ":|:|:";
                     break;     

                 case 6:
                     barCode += ":||::";
                     break; 

                 case 7:
                     barCode += "|:::|";
                     break;    

                 case 8:
                     barCode += "|::|:";
                     break;    

                 case 9:
                     barCode += "|:|::";
                     break;    
             }
        }

             num = Integer.parseInt(strZip);   

                while (num > 0) {
                    digit = num % 10;
                    sum = sum + digit; 
                    num = num / 10;
                }

                if (sum % 10 != 0) {
                    checkDigit = (((sum / 10) + 1) * 10) - sum;
                }
                else
                    checkDigit = 0;

            switch(checkDigit) {

                 case 0:
                     barCode += "||:::";
                     break;

                 case 1:
                     barCode += ":::||";
                     break;

                 case 2:
                     barCode += "::|:|";
                     break;

                 case 3:
                     barCode += "::||:";
                     break;   

                 case 4:
                     barCode += ":|::|";
                     break;

                 case 5:
                     barCode += ":|:|:";
                     break;     

                 case 6:
                     barCode += ":||::";
                     break; 

                 case 7:
                     barCode += "|:::|";
                     break;    

                 case 8:
                     barCode += "|::|:";
                     break;    

                 case 9:
                     barCode += "|:|::";
                     break;   
            }
               barCode += "|";

               System.out.print(barCode);   
               System.out.println("\n");

               System.out.println("Do you want to enter another zip code? Enter YES or NO. "); 
               option = scan.next();
               option = option.toLowerCase();
               
               if(option.equals("yes")) {
                   System.out.println("");
                   barCode = "";
               }
               else if(option.equals("no")) {
                   choice = false;
                   System.out.println("Thank you for using the zip code converter! ");
                   break;
               }
               else {
                   System.out.println("ERROR! Should have entered yes or no");
               }
        }
    }

}
    
