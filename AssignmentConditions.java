package ConditionalClasses;

public class AssignmentConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int maths = 60 ;
        int science = 83;
        int english = 75;
        int averagemarks = ((maths + science + english)/3);
        
        if(averagemarks < 40)
        	System.out.print("fail" + "Please work hard next time");
        	
        else if (averagemarks < 59)
        	System.out.print("C Grad" + " Keep improving");
        	
        else if (averagemarks < 74)
        	System.out.print("B Grad" + " Keep improving");
        
        else if(averagemarks < 89)
            System.out.print("A Grad" + " Excellent performance!");	
            
        else 
          	System.out.print("A+ Grad" + " Excellent performance!");
        
	}
	
}

