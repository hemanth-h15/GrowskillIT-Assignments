package LoopConcept;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 12321; 
		int pal = num1;
		int rev = 0;
		
		while(num1!=0)
			{
		int remin = num1%10 ; // ---->2 
		num1 =  num1/10; //-------->
		rev = rev*10 + remin ; ///-------> 2 
		
		}
		 System.out.println(rev);
		if(rev == pal) {
		System.out.println(true);
        }else {
        	System.out.print(false);
        }
	}

}
