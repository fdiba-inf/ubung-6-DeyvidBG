package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.next();

        if (password.length() < 8) {   
          // its not valid
        } else {      
          char c;  
          int count = 0;   
          for (int i = 0; i < password.length(); i++) {  
            c = password.charAt(i);  
            if (!Character.isLetterOrDigit(c)) {          
                // its not a valid password
            } else if (Character.isDigit(c)) {  
                count++;     
            }  
          }
          if (count < 2)   {     
            // its not valid
          } else {
            System.out.println("Password valid!");  
          }  
        }
    }
}
