import java.util.Scanner;


public class Sherlock2 {
	public static void main(String[] args) {
		int x=0,y=0;
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		for(int z=0;z<turns;z++)
		{
			x=0;
			y=0;
			int n=in.nextInt();
			int i=0;
			while(i<=n)
			{
				if(((n-(5*i))%3==0)&&((n-(5*i))>=0))
				{
					x=i;
					y=(n-(5*i))/3;
					break;
				}
				i++;
			}
			if((x==0)&&(y==0))
				System.out.print("-1");
			for(int j=0;j<y;j++)
			{
				System.out.print("555");
			}
			for(int j=0;j<x;j++)
			{
				System.out.print("33333");
			}
			System.out.println();
		}
		in.close();
	}

}
