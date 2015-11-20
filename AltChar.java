import java.util.Scanner;


public class AltChar {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		for(int z=0;z<turns;z++)
		{
			int del=0;
			String s=in.next();
			for(int i=0;i<s.length()-1;i++)
			{
				if(s.charAt(i)==s.charAt(i+1))
				{
					del++;
				}
			}
			System.out.println(del);
		}
		in.close();
	}

}
