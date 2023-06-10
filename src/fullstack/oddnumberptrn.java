package fullstack;

public class oddnumberptrn {

	public static void main(String[] args) {
		String m="khandagale";
		for (int i=0;i<=9;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(m.charAt(j));	
			}
				System.out.println();
			}
		String n="krushna";
for (int i=7;i>0;i--) {
	for(int j=0;j<=i-1;j++) {
		System.out.print(n.charAt(j));	
	}
		System.out.println();
	} 

	
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
/*for(int i=1;i<=k;i++) {
for(int j=1;j<=i;j++) {
  if(j%2!=0) {
System.out.print(j +" ");
 }	}System.out.println();
}*/
//$$$$$$$$$$$$$$ ODD NUMBER $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
/*int r=6;
for (int i = 1; i <= r; i++)
   {
  for (int j = r; j > i; j--)
  {
  System.out.print(" ");
  }
 int t = 1;
  for (int k = 1; k <= i; k++)
  {
  System.out.print(t + " ");
  t = t * (i - k) / (k);
  }
  System.out.println();
 } */
//$$$$$$$$$$$$(pascal)$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
/*int fp=20/2,sp=20/2;
for(int i=1;i<=10;i++) {
for(int j=1;j<=20;j++) {
if(j==fp||j==sp||i==10/2 | j>sp && j<sp) 
	System.out.print("*");	
else 
	System.out.print(" ");
}
System.out.println();
fp--;
sp++;
}
System.out.println("################### alpha A ################");
 */
}
}