import java.util.Scanner;


public class FindDigits {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		for(int z=0;z<turns;z++)
		{
			int n=in.nextInt();
			int count=0;
			for(int i=n;i>0;i=i/10)
			{
				int r=i%10;
				if(r!=0)
				{
					if(n%r==0)
						count++;
				}
			}
			System.out.println(count);
		}
		in.close();
	}

}
