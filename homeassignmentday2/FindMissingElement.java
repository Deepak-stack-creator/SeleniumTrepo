package week2.homeassignmentday2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int[] arr = {1, 4, 3, 2, 8, 6, 7};

        // Sort the array
		
        Arrays.sort(arr);

        // Loop from first number
        
        for (int i = 1; i <= arr.length; i++) {

            // If mismatch found, it's the missing number
        	
            if (i != arr[i - 1]) {
            	
                System.out.println("Missing number: " + i);
                
                break;
            }
        }
    }

	}


