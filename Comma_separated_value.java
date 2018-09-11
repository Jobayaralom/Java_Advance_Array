package Exercise_5;

import java.util.Scanner;
import java.util.Arrays;

public class Comma_separated_value {

	public static void main(String[] args) {

        Scanner userInput =new Scanner(System.in);
        
        System.out.println("Enter multiple words seperated by commas(,) ");
        String sentence = userInput.nextLine();
        userInput.close();
        System.out.println("Your input is: "+sentence);
        
        System.out.println("After  Separated String Array is: ");
       
        String[] words = sentence.split(",");
        
         System.out.println(Arrays.toString(words));
        
        
         ///Actually you don't need to do that but if u like it you can show them.
       
        }

		
	}


