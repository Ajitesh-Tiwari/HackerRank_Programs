
import java.util.Scanner;


public class Kaprekar {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int p=in.nextInt();
		int q=in.nextInt();
		int res=-1;
		for(long i=p;i<=q;i++)
		{
			if(i==1)
			{
				System.out.print("1 ");
				continue;
			}
			if((i==2)||(i==3))
				continue;
			String s=String.valueOf(i*i);
			if((Integer.parseInt(s.substring(0, (int)(s.length()/2)))+
					Integer.parseInt(s.substring((int)(s.length()/2))))==i)
			{
				System.out.print(i+" ");
				res=0;
			}
		}
		if(res==-1)
			System.out.println("INVALID RANGE");
		in.close();
	}

}
