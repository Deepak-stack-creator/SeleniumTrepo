package week2.homeassignment2;

public class IsPrimeNumber {

	public static void main(String[] args) {

		int n = 13;
		boolean isPrime = true;

	
		for (int i = 2; i < n; i++) {
	
		if (n % i == 0)
		isPrime = false;
		break;// Found a number that divides n
     
}

	 if (isPrime) {
         System.out.println(n + " is a prime number");
     } else {
         System.out.println(n + " is not a prime number");
     }
	 
	}
	
}
	
