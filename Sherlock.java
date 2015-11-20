
import java.util.Scanner;


public class Sherlock {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int arr[];
		int turns=in.nextInt();
		for(int a=0;a<turns;a++)
		{
			int n=in.nextInt();
			int size=n;
			arr=new int[n];
			while(n>0)
			{
			int x=n%3;
			if(x==0)
			{
				for(int i=0;i<n;i++)
					arr[i]=5;
				n=0;
			}
			else if(n>=5)
			{
				for(int i=0;i<5;i++)
					arr[n-i-1]=3;
				n-=5;
			}
			else{
				n=-1;
			}
			
			}
			if(n==0)
			{
				for(int i=0;i<size;i++)
					System.out.print(arr[i]);
			}
			else
				System.out.print("-1");
			
			System.out.println();	
		}
		
		in.close();
	}

}
