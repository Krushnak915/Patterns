package fullstack;

public class diamond {

	public static void main(String[] args) {
		char n='A';
	    for(int i=1;i<=5;i++) {
				for (int j=i;j<=5;j++)
				 {
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
				System.out.print(n +" ");	
				}
					System.out.println();
	n++;}
	    char c='f';	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");}
				for(int j=i;j<=5;j++) {
					System.out.print(c +" ");
				}System.out.println();
		c++;}
System.out.println("||||||||||||||||||||||||||||(1)|||||||||||||||||||||");
char z='1';
for(int i=1;i<=5;i++) {
		for (int j=i;j<=5;j++)
		 {
System.out.print(" ");
}
for(int j=1;j<=i;j++) {
		System.out.print(z +" ");	
		}
			System.out.println();
z++;
}
char b='6';	
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(" ");}
		for(int j=i;j<=5;j++) {
			System.out.print(b +" ");
		}System.out.println();b--;
}
System.out.println("||||||||||||||||||||||||||||(2)|||||||||||||||||||||");

	}

}
