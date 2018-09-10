import java.util.Scanner;
import java.util.Random;

public class Lab2p1 {
	public static void main(String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
				System.out.println("Perform the following methods:");
				System.out.println("1: multiplication test");
				System.out.println("2: quotient using division by subtraction");
				System.out.println("3: remainder using division by subtraction");
				System.out.println("4: count the number of digits");
				System.out.println("5: position of a digit");
				System.out.println("6: extract all odd digits");
				System.out.println("7: quit");
				choice = sc.nextInt();
				
				switch (choice) {
					case 1: /* add mulTest() call */
						mulTest();
						break;
					case 2: /* add divide() call */
						System.out.println("m = ");
						int m = sc.nextInt();
						System.out.println("n = ");
						int n = sc.nextInt();
						System.out.println(m + " / " + n + " = " + divide(m,n));
						break;
					case 3: /* add modulus() call */
						System.out.println("m = ");
						int m2 = sc.nextInt();
						System.out.println("n = ");
						int n2 = sc.nextInt();
						System.out.println(m2 + " % " + n2 + " = " + modulus(m2,n2));
						break;
					case 4: /* add countDigits() call */
						System.out.println("n = ");
						int n3 = sc.nextInt();
						if (n3<0)
							System.out.println("Error input!!");
						else
							System.out.println("count = " + countDigits(n3));
						break;
					case 5: /* add position() call */
						System.out.println("n : ");
						int n4 = sc.nextInt();
						System.out.println("digit : ");
						int digit = sc.nextInt();
						System.out.println("Position = " + position(n4,digit));
						break;
					case 6: /* add extractOddDigits() call */
						System.out.println("n : ");
						long n5 = sc.nextLong();
						if (n5<0)
							System.out.println("Error input!!");
						else
							System.out.println("oddDigits = " + extractOddDigits(n5));
						break;
					case 7: System.out.println("Program terminating …");
				}
		} while (choice < 7);
	}
	
	/* add method code here */
	public static void mulTest() {
		
		int actualans = 0;
		int correct = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			Random rand = new Random();
			int  m1 = rand.nextInt(9) + 1;
			int  m2 = rand.nextInt(9) + 1;
			System.out.println("How much is " + m1 + " times " + m2 + " ?");
			int ans = sc.nextInt();
			actualans = m1*m2;
			
			if(actualans == ans)
				correct += 1;
			
		}
		
		System.out.println(correct +" answers out of 5 are correct.");
	}
	
	public static int divide(int m, int n) {
		int count =0;
		
		while (m>=n) {
			m = m-n;
			count++;
		}
		return count;
	}
	
	public static int modulus(int m, int n) {
		while (m>=n) {
			m = m-n;
			//count++;
			if (m == 0)
				return 0;
		}
		return m;
	}
	
	public static int countDigits(int n) {
		int count = 0;
		
		if(n==0)
			count = 1;
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
	
	public static int position(int n, int digit) {
		int pos=0;
	    do {
	      pos++;
	      if (n % 10 == digit)
	         return pos;
	      n = n / 10;
	    } while (n > 0);
	   return -1;
	}
	
	public static long extractOddDigits(long n) {
		String output="";
	    do{
	        if (n % 2 == 1) {
	        	long lastDigit = n%10;
	        	output = Long.toString(lastDigit)+output;
	        }
	           n = n/10;
	    } while (n > 0 );
	    
	    if (output == "") {
			return -1;
		} else {
			return Long.parseLong(output);
		}
	}
	
	
}