package fullstack;

public class alphaptrn {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=n;i>=0;i--) {
			int alphbet=65;
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphbet+j)+" ");	
				}
					System.out.println();
           }
		System.out.println("#################1###################");
//----------------------------------------------------------------------
		char B='A';
		for(int i=0;i<=n;i++) {
				for (int j=0;j<=i;j++)
				 {
		System.out.print("");
		}
		for(int j=0;j<=i;j++) {
				System.out.print(B++ +" ");	
				
				}
					System.out.println();
           }
		System.out.println("##################2##################");
		char R='Z';
		for(int i=0;i<=n;i++) {
//				for (int j=0;j<=i;j++)
//				 {
//		System.out.print("");
//		}
		for(int j=0;j<=i;j++) {
				System.out.print(R+" ");	
				
				}
					System.out.println();
        R--; 
        }
		System.out.println("###################3#################");
	
		char N='Z';
		for(int i=0;i<=n;i++) {
		for(int j=0;j<=i;j++) {
				System.out.print(N-- +" ");	
				
				}
					System.out.println();
          }
		System.out.println("#####################4###############");
char l='A';
for(int i=0;i<=n;i++) {
for(int j=0;j<=i;j++) {
		System.out.print(l+" ");	
		
		}
			System.out.println();
 
}
System.out.println("###################5#################");

	
	}
	}
