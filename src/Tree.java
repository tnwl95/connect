
public class Tree {
	
	public static void main(String []args) {
	
	for (int i=0;i<5;i++){
	  for (int j=0; j<5;j++)
	  {
	     if (i<=5/2)
	     {
	        if (i+j<=5/2-1)
	           System.out.print(" ");
	        else if (j-i>=5/2+1) 
	        	System.out.print(" ");
	        else
	           System.out.print("*");
	     }
	     else if (i>5/2) 
	     {
	        if (i-j>=5/2+1) 
	        	System.out.print(" ");
	        else if (i+j>=5/2*3+1)
	        	System.out.print(" ");
	        else
	        	System.out.print("*");
	     }
	  }
	  System.out.println();
	}
		
	}
}
//
	