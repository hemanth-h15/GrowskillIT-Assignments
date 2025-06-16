package LoopConcept;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1 = 123459757;
       int  c1 = 0;
        if(n1 == 0)
		{
			c1 = 1;
		}
		while(n1!=0) {
			n1 = n1/10 ;
			c1++;
		}
		System.out.println(c1);
	}

}
