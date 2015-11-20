import java.util.Scanner;


public class Encryption {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int row=(int) Math.floor(Math.sqrt(s.length()));
		int column=(int) Math.ceil(Math.sqrt(s.length()));
		if((row*column)<s.length())
		{
			row++;
		}
		char[][] arr=new char[row][column];
		int c=0;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=' ';
				
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=s.charAt(c++);
				if(c>=s.length())
					break;
			}
		}
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
				if(arr[j][i]!=' ')
					System.out.print(arr[j][i]);
			}
			System.out.print(" ");
		}
		
		in.close();
	}

}
