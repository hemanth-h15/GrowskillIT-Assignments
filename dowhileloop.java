package LoopConcept;

public class dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      first initializing value of i and adding condition and also incrementing i value with 1		
		for(int i = 1;i<=100;i++) {
			
//          adding condition to it where i divided by 5 gives reminder 0			
			if(i%5 == 0)continue; // continue ----> will skip the multiples of 5
			{
				System.out.println(i);
			}
		}

	}

}
