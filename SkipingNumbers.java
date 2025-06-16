package LoopConcept;

public class SkipingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 5;
        
        for(int i =0; i<=100; i++)
        {
        	int Skip = (i/a);
        	if (Skip == 0) {
        		continue;
        	}
        	System.out.println(i);
        	
        }
		
		
	}

}
