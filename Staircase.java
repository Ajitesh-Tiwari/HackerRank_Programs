import java.util.Scanner;


public class Staircase {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i-1;j>0;j--)
				System.out.print(" ");
			for(int j=n-i+1;j>0;j--)
				System.out.print("#");
			System.out.println();
		}
		in.close();
	}

}
