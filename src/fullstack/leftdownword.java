package fullstack;

public class leftdownword {
      public static void main(String []args) {
    	  int k=5;
    	  for(int i=1;i<=k;i++) {
    		  for(int j=i;j<=k;j++) {
    			  System.out.print("*");
    		  }System.out.println();
    			  }
    	//int k=5;
    	  for(int i=1;i<=k;i++) {
    		  for(int j=k;j>=i;j--) {
    		  System.out.print(j+" ");
    		  }System.out.println( );
    		  }
    	  
    	  String n="krushna";
    	  for (int i=7;i>0;i--) {
    	  	for(int j=0;j<=i-1;j++) {
    	  		System.out.print(n.charAt(j));	
    	  	}
    	  		System.out.println();
    	  	} 
      }
    
    	  }	
	
