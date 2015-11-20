import java.util.Scanner;


public class SherlockSquares {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		for(int i=0;i<turns;i++)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println((int)Math.floor(Math.sqrt(b))-(int)Math.ceil(Math.sqrt(a))+1);
			
		}
		in.close();
	}

}
