import java.util.Scanner;


public class FunnyStr {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		for(int z=0;z<turns;z++)
		{
		int c=0;
		String s=in.next();
		StringBuilder sb=new StringBuilder(s);
		String rev=sb.reverse().toString();
		for(int i=0;i<s.length()-1;i++)
		{
			if(Math.abs(s.charAt(i)-s.charAt(i+1))!=Math.abs(rev.charAt(i)-rev.charAt(i+1)))
			{
				System.out.println("Not Funny");
				c=-1;
				break;
			}
		}
		if(c!=-1)
		System.out.println("Funny");
		}
		in.close();
		
	}

}
