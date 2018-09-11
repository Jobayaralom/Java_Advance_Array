package Exercise_4;

import java.util.Arrays;
import java.util.Scanner;

public class How_Many_Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	    int [] myArray = new int[15];
        myArray[0]= 1;
        myArray[1]= 2;
        myArray[2]= 3;
        myArray[3]= 2;
        myArray[4]= 3;
        myArray[5]= 6;
        myArray[6]= 7;
        myArray[7]= 2;
        myArray[8]= 1;
        myArray[9]= 9;
        myArray[10]= 6;
        myArray[11]= 7;
        myArray[12]= 2;
        myArray[13]= 6;
        myArray[14]= 9;
        
        System.out.println(Arrays.toString(myArray));
		
        boolean x = false;
        
        System.out.println("Enter the Integer Number you looking for..");
        Scanner input = new Scanner(System.in);
        int User = input.nextInt();
        input.close();
        int count = 0;
        for (int i=0; i < myArray.length; i++) {

	        if (User == myArray[i]) { 
	        	x = true;
	            count++;

	        }

	    }
        if (x == true){
            System.out.println("Your number: " + User);
            System.out.println("Number of times it Appears: " + count);
        }
        else{
            System.out.println("*****Sorry, Your Number is Not Present in Array*****");
        }
	
	}
   
 }	
        
	


