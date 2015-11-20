
import java.util.Scanner;


public class PalindromeIndex {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		for(int z=0;z<turns;z++)
		{
		String s=in.next();
		char[] arr=s.toCharArray();
		int i,j;
		for(i=0,j=arr.length-1;!(i>=j);i++,j--)
		{
			if(arr[i]==arr[j])
			{
				continue;
			}
			else
			{
				if((arr[i]==arr[j-1])&&(arr[i+1]==arr[j-2]))
					System.out.println(j);
				else if((arr[i+1]==arr[j])&&(arr[i+2]==arr[j-1]))
					System.out.println(i);
				break;
			}
		}
		if(i>=j)
			System.out.println("-1");
		}
		in.close();
	}
	
}
