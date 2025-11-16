package week2.homeassigment3;

public class REverseOddWords {

	public static void main(String[] args) {
		 
		String test = "I am a software tester";

	        String[] words = test.split(" ");

	        for (int i = 0; i < words.length; i++) {

	            if (i % 2 != 0) {  // odd index → reverse

	                char[] ch = words[i].toCharArray();

	                for (int j = ch.length - 1; j >= 0; j--) {
	                    System.out.print(ch[j]);
	                }

	                System.out.print(" ");  // add space after each word

	            } else {  // even index → print as it is
	                System.out.print(words[i] + " ");
	            }
	        }
	    
	}
}
