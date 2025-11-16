package week2.homeassignmentday2;

public class TwoArrays {

	public static void main(String[] args) {
		 
		int a[] = {3, 2, 11, 4, 6, 7};
	        int b[] = {1, 2, 8, 4, 9, 7};

	        for (int i = 0; i < a.length; i++) {          // Outer loop → for array a
	            for (int j = 0; j < b.length; j++) {      // Inner loop → for array b

	                if (a[i] == b[j]) {                   // Compare values
	                    System.out.println(a[i]);         // Print match
	                }
	            }
	        }
	    }
	
	}


