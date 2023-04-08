import java.util.Scanner;

public class challenge
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		int c = n;
		for(int i=0;i<n;i++){
				int j=0;
				do{
					System.out.print(" ");
					j++;				
				}while(j<=c-1);
				j=0;
				do{
					System.out.print("#");
					j++;				
				}while(j<=i);
				j=0;
			System.out.println("");
			c--;
			}
	}
}
