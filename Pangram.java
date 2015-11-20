import java.util.Scanner;


public class Pangram {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine().toLowerCase();
		int ch=0;
		for(char c='a';c<='z';c++)
		{
			if(!str.contains(c+""))
			{
				System.out.println("not pangram");
				ch=-1;
				break;
			}
		}
		if(ch!=-1)
		{
			System.out.println("pangram");
		}
		in.close();
	}

}
