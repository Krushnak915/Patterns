package fullstack;
//import java.util.Scanner;
public class mirrstr {

	public static void main(String[] args) {
//		System.out.println("enter number");
//Scanner sc=new Scanner(System.in)	;
//int n=sc.nextInt();
		//char n='1';
		for(int i=1;i<=5;i++) {
				for (int j=i;j<=5;j++)
				 {
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
				System.out.print("*");	
		} 
					System.out.println();
					}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$1$$$$$$$$$$$$$$$");
		char m='1';
		for(int i=1;i<=5;i++) {
				for (int j=i;j<=5;j++)
				 {
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
				System.out.print(m+"");	
		} 
					System.out.println();
					}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$2$$$$$$$$$$$$$$$$$$$$");
     int  p=1;
		for(int i=1;i<=5;i++) {
				for (int j=i;j<=5;j++)
				 {
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
				System.out.print(p++ +"");	
		} 
					System.out.println();
					}
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$3$$$$$$$$$$$$$$$$$");
		int  r=5;
		for(int i=r;i>=1;i--) {
				for (int j=1;j<=i;j++)
				 {
 	System.out.print(j+" ");	
		} 
			 		System.out.println(); 
					
			}
		System.out.println("$$$$$$$$$$$$$$$$$$$4$$$$$$$$$$$$$$$$$$$$$$");
     char v='9'; 
		for(int i=1;i<=5;i++) {
			for (int j=i;j<=5;j++)
			 {
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
			System.out.print(v +"");	
	} 
				System.out.println();
		v--;		
		}
	System.out.println("$$$$$$$$$$$$$$$$$$$5$$$$$$$$$$$5$$$$$$$$$$");

	}}
	


