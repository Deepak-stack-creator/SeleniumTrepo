package week2.homeassignment2;

public class FibonacciSeries {

	public static void main(String[] args) {

        int range = 8;

        int a = 0;
        int b = 1;

        System.out.print(a + ", " + b);

        for (int i = 2; ; i++) {

            int next = a + b;

            System.out.print(", " + next);

            a = b;
            b = next;

            if (next > range) {
                break;
            }
        }
    }

	}


