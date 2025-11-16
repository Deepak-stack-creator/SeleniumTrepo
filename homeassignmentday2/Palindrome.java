package week2.homeassignmentday2;

public class Palindrome {

	public static void main(String[] args) {

		  int input = 121;     // You can change this number
	        int output = 0;      // To store reversed number
	        int rem;             // To store last digit

	        // Using temporary variable for loop
	        
	        for(int i = input; i > 0; i = i / 10) {

	            rem = i % 10;                     //  get last digit
	            output = (output * 10) + rem;     //  build reversed number
	        }

	        // Compare original and reversed number
	        
	        if(input == output) {
	        	
	            System.out.println(input + " is a Palindrome");
	            
	        } 
	        
	        else {
	        	
	            System.out.println(input + " is NOT a Palindrome");
	        }
	    }
	

	}


