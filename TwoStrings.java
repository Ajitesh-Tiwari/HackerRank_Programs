import java.util.Scanner;


public class TwoStrings {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		for(int z=0;z<turns;z++)
		{
			int result=0;
			String s1=in.next();
			String s2=in.next();
			for(char c='a';c<='z';c++)
			{
				if((s1.contains(c+""))&&(s2.contains(c+"")))
				{
					result=1;
					System.out.println("YES");
					break;
				}
			}
			if(result!=1)
				System.out.println("NO");
		}
		in.close();
	}

}
