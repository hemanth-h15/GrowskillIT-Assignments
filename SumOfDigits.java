package LoopConcept;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1234;
		int b= 0;
		
		while(a != 0){   // i need last digit
		int rem = a%10 ;  // give reminder last digit
		b = b + rem;     //--------> this will give you value of be to next loop
		a = a/10;
		}
		System.out.println(b);

	}

}
