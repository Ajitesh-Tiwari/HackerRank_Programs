import java.util.Scanner;


public class CommonChild {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		StringBuilder sb1=new StringBuilder(s1);
		StringBuilder sb2=new StringBuilder(s2);
		int max=0;
		int arr[][]=new int[sb1.length()][sb2.length()];
		for(int i=0;i<sb1.length();i++)
		{
			for(int j=0;j<sb2.length();j++)
			{
				if(sb1.charAt(i)==sb2.charAt(j))
				{
					if((i==0)||(j==0))
					{
						arr[i][j]=1;
					}
					else{
						arr[i][j]=max(arr, i, j)+1;
					}
					if(arr[i][j]>max)
						max=arr[i][j];
				}
				else{
					arr[i][j]=0;
				}
			}
		}
		for(int i=0;i<sb1.length();i++)
		{
			for(int j=0;j<sb2.length();j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(max);
		in.close();
	}
	public static int max(int arr[][],int ii,int jj)
	{
		int max=0;
		for(int i=0;i<ii;i++)
		{
			for(int j=0;j<jj;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		return max;
	}

}
/*WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS
FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC*/
//15
