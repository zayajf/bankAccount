/************************************************************************************************
 * File Name:   BankAccountStudent.java
 * 
 * Due Date:    <December 11th>
 * 
 * Author:      <Jonathon Zayas>
 * 
 * Program Description:  
 *              <Student Bank Account Using methods>  
 * 
 * Input:       <Account Inquiry - Deposit Withdrawl Balance>  
 *
 * Output:      <Display Inquiry choice and updated balance>  
 *
 * **********************************************************************************************/

import java.util.*;

public class BankAccount{
    

        //Main Function
        public static void main(String []args){
        
                //Declare Scanner object(s)
                Scanner input = new Scanner(System.in);

            
                //Declare other variables as needed
                int account = 0;
                int accountNum;//Variables for accountInfo
                
                //Declare and initialize a variable for balance to $5000.
                double balanceNum = 5000;
                
                //variables for menuchoice
                String menuChoice = " ";
                String choice = " ";
                String deposit = "D";
                String withdrawl = "W";
                String balance = "B";
                String exit = "X";
                
                //Display the welcome message 
                //Call the welecomeMessage() method
                welcomeMessage();


                //Prompt the user to enter the account number 
                //Call the accountInfo() method
                accountNum = accountInfo(account);
            
        
                //This will Display the menu and Call the Function(s) based on the user's choice until the user enters X 
                //Using a do while loop
                do{
                         
                        //Call the displayMenu() method - displays menu for user to choose Bank Inquiry 
                        menuChoice = displayMenu(choice);
                                     
                        //If Else statements used to call methods based on user input                
                        if ( menuChoice.equals(deposit) ) {
                            
                            //call statement for Deposit() method
                            balanceNum = deposit(balanceNum);
                            
                            //continue used to fix bug - error message displayed after user input for deposit
                            continue;
                        }
                            else if ( menuChoice.equals(withdrawl) ){
                            
                            //call statement for Withdrawl() method
                            balanceNum = withdrawl(balanceNum);
                            
                            //continue used to fix bug - error message displayed after user input for withdrawl
                            continue;
                        }
                            else if ( menuChoice.equals(balance) ) {
                            
                            //call statement for Balance() method
                            balance(accountNum, balanceNum);
                            
                            //continue used to fix bug - error message displayed after user input for balance
                            continue;
                        }
                            //If statement used to fix bug - when user enters X Error message was prompted
                            if (menuChoice.equals(exit) ){
                            
                            }//end of if
                            
                            else{ 
                            System.out.println("!ERROR! You must enter D, W, B, or X!");
                        }
                                
             
                }//end of do
                
                while(!menuChoice.equals(exit) );  
        
            
            //Display final message
            System.out.println("\nThank You for being a Loyal Seminole Bank Customer!");
            
        }//end of main
        
             
        /**************************************************** FUNCTION DEFINITIONS *****************************************************/

         //Display welcome message 
         public static void welcomeMessage(){  
             
            //Welcome User to Seminole Bank
            System.out.println("\n********************************************************");
            System.out.println("\t\tWelcome to Seminole Bank!");
            System.out.println("********************************************************");
             
             }//end of welcomeMessage
         
         //Prompt and Read users’ account number.  RETURN the account number to main().
         public static int accountInfo (int account){
            
            //Scanner 
            Scanner input = new Scanner(System.in);
        
            //local variable(s)
            int result;
        
            //Prompt user for menu choice
            System.out.print("\nPlease Enter your 5 - digit Seminole account number: ");
            result = input.nextInt();
        
            System.out.println("\nTHANK YOU!");

            return result;

            }//end of accountInfo
         
        
         //Display menu choices to the user and Read the users’ banking choice.  RETURN the user’s menu choice to main().
         public static String displayMenu (String choice){
              //Scanner
              Scanner input = new Scanner(System.in);
              
              //local variables
              String menuChoice = " ";
              
            //Prompt user to choose menu option
            System.out.print("\n\nEnter D for Deposit, W for Withdrawl, B for balance, or X to exit the menu: ");
                menuChoice = input.next().toUpperCase();
            
            return menuChoice;
         }//end of displayMenu
         
         
         //Prompt the user for the amount to deposit and Read deposit amount.  Update the balance and RETURN the balance to main().
         public static double deposit(double balanceNum){
            //Scanner
            Scanner input = new Scanner(System.in);
            
            //local varialbes
            double depositNum;
            
            System.out.print("\nEnter the amount of deposit: ");
                depositNum = input.nextDouble(); 
            
                balanceNum = balanceNum + depositNum;
                
                return balanceNum;
             
             }//end of deposit
         
    
         //Prompt the user for the amount to withdraw and Read withdrawal amount.  Update the balance and RETURN the balance to main().
         public static double withdrawl(double balanceNum){
             //scanner
             Scanner input = new Scanner(System.in);
             
             //local varialbes
            double withdrawlNum;
            
            System.out.print("\nEnter the amount of withdrawl: ");
                withdrawlNum = input.nextDouble(); 
                
                balanceNum = balanceNum - withdrawlNum;
                
                return balanceNum;
             
             }//end of withdrawl
     
         //Display the balance and DO NOT RETURN anything to main().
         public static void balance(int accountNum, double balanceNum){
             //local variables
             
             System.out.printf("\nAccount Number: " + accountNum + " has a current balance of: $%.2f", balanceNum);
             
             }//end of checkBalance 
                  
        /**************************************************END OF FUNCTION DEFINITIONS **************************************************/
    
    
}//end of BankAccount Class 

