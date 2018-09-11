package Exercise_3;

import java.util.Arrays;

public class Largest_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    int [] myArray = new int[10];
        myArray[0]= 10;
        myArray[1]= 20;
        myArray[2]= 30;
        myArray[3]= 40;
        myArray[4]= 50;
        myArray[5]= 60;
        myArray[6]= 70;
        myArray[7]= 80;
        myArray[8]= 90;
        myArray[9]= 100;
        
        System.out.println(Arrays.toString(myArray));
            int index=0;
        int largest = myArray[0];
        for (int i =0; i<myArray.length; i++){
            largest = myArray[i];
            index=i;
        }
        System.out.println("The largest number is "+largest+" and index is "+index);
        
    }	
	

}
