/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projecttester;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class ProjectTester {
   
      // This method checks if the entered username is valid based the given standard
    public static boolean checkUserUsername (String username){
         return username.length() >= 5 && !username.matches("");// This Checks if the username meets the reqirements and that is not an empty string
   
         
}
     // This method checks if the entered password is valid based the given standard
    public static boolean checkPasswordComplexity (String password) {
         // this Regular expression ("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$") validates the password complexity
         return password.matches ("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$")&& password.length()== 8;
        
}    
    public static boolean checkCellPhoneNumber(String number) {
         // this Regular expression ("\\+27\\d{12}") validates the cellphone number complexity
         return  number.matches ("\\+27\\d{9}")&& number.length()== 12;   
         
}
    public static void main(String[] args) {
       //String username prompts the user that they are creating an account and what they should enter first
      String username = JOptionPane.showInputDialog("Creating an account!:\n Create a username (max 5 chars, use_):");
      //Checks if username does not have the requirements
      if (!username.contains("_")|| username.length() >5)  {
          // Show an error message if the username is incorrect
          JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length");
          
      }else{ 
           // Show success message if the username is correct
           JOptionPane.showMessageDialog(null,"Username is succefully captured.");
           
           
       // asks the users last name
      String userlastname = JOptionPane.showInputDialog("Create a  last name:");
      
      
      //Asks the user to create a password
      String password = JOptionPane.showInputDialog("Create a password with (min 8 chars, a capital letter, a number, and a special character.):");
       // checks for the complexity reqiurements
        if (password.matches ("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$")){ 
             JOptionPane.showMessageDialog(null, "password successfully captured.");
              
       }else{ 
            JOptionPane.showMessageDialog(null, "Password is not correctly formated ; please ensure that the password contains at least eight characters , a capital letter, a number, and a special character.");
            //to  exit the program if the pasword is incorrect
            System.exit(0);
                
}
      // asks for the South African phone number that has the international code +27
      String Phone = JOptionPane.showInputDialog("Enter SA phone number (+27XXXXXXXXX):");
      //Checks if the number is correct
       if (checkCellPhoneNumber(Phone)) {
           JOptionPane.showMessageDialog(null,"Cell phone number successfully added" );
          
      }else{
            JOptionPane.showMessageDialog(null,"Cell phone number incorrectly formatted or does not contain international code." );
           // To exit program if the phone number is incorrect
           System.exit(0);
               
}
        //Account creation confirmation
       JOptionPane.showMessageDialog(null, "Account created!");
       
           
        // promts the user if they want to login or not
       String input = JOptionPane.showInputDialog("Do you want to login? (enter '1' for Yes or enter '0' for No)");
       int response = Integer.parseInt(input);// To parse the users response as an intger
       if (response == 1 ){
           JOptionPane.showMessageDialog(null,"Logging in.");// to show a message if the user wants to login
           
        //Prompts the user for their username and password in order to login
       String userLogin = JOptionPane.showInputDialog("Enter username to login:");
       String passLogin = JOptionPane.showInputDialog("Enter password:");
       
       //Checks if the username or password is correct
       if(username.equals(userLogin)&& password.equals(passLogin)){
           JOptionPane.showMessageDialog(null, " Welcome back, " + username + userlastname + " It is great to see you again. ");//show a message if login is successful
           
       }else{
           JOptionPane.showMessageDialog(null,"Username or password incorrect, please try again." );
           System.exit(0);
}
       }else if(response == 0) { // shows a message if the user does not want to login
          JOptionPane.showMessageDialog (null, "Not logging in.");
         
       }else{
           JOptionPane.showMessageDialog(null," Invalid input. please enter 1 or 0.");// if the input of choice is not what is required user is told it is invalid
       
       }
      }
    }
}
       
        
    
    


