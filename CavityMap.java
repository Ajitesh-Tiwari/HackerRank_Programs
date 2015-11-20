import java.io.IOException;
import java.util.Scanner;


public class CavityMap {
	public static void main(String[] args) throws IOException {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			String s=in.next();
			for(int j=0;j<s.length();j++)
			{
				arr[i][j]=Integer.parseInt(""+s.charAt(j));
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==0)||(i==(n-1))||(j==0)||(j==(n-1)))
				{
					System.out.print(arr[i][j]);
				}
				else
				{
					int x=arr[i][j];
					if((arr[i-1][j]==-1)||(arr[i+1][j]==-1)||(arr[i][j-1]==-1)||(arr[i][j+1]==-1))
					{
						System.out.print(arr[i][j]);
						continue;
					}
					else{
					if((x>arr[i-1][j])&&(x>arr[i+1][j])&&(x>arr[i][j-1])&&(x>arr[i][j+1]))
					{
						System.out.print("X");
						arr[i][j]=-1;
						if(j<n-1)
						{
							System.out.print(arr[i][++j]);
						}
						
					}
					else
					{
						System.out.print(arr[i][j]);
					}
					}
				}
			}
			System.out.println();
		}
		in.close();
	}

}
