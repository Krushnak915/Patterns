package fullstack;
public class characteptrn {

		public static void main(String[] args) {
			int alphbet=65;
			int n=5;
			for(int i=0;i<=n;i++) {
					for (int j=0;j<=i;j++)
					 {
			System.out.print("");
			}
			for(int j=i;j<=n;j++) {
					System.out.print((char)(alphbet+j)+" ");	
					}
						System.out.println();
				}	
			for(int i=0;i<=n;i++) {
				for (int j=0;j<=i;j++)
				 {
		System.out.print("");
		}
		for(int j=0;j<=i;j++) {
				System.out.print((char)(alphbet+j)+" ");	
				}
					System.out.println();
			}	

		}
	}
