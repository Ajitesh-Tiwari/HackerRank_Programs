import java.util.Scanner;


public class AngryProfessor {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		for(int z=0;z<turns;z++)
		{
		int count=0;
		int n=in.nextInt();
		int k=in.nextInt();
		for(int i=0;i<n;i++)
		{
			if(in.nextInt()<=0)
				count++;
		}
		if(count>=k)
			System.out.println("NO");
		else
			System.out.println("YES");
		}
		in.close();
	}

}
