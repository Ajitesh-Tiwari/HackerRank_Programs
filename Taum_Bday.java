import java.util.Scanner;


public class Taum_Bday {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		for(int k=0;k<turns;k++)
		{
			long b,w,x,y,z;
			b=in.nextInt();
			w=in.nextInt();
			x=in.nextInt();
			y=in.nextInt();
			z=in.nextInt();
			if((z+x)<=y)
			{
				y=z+x;
			}
			else if((z+y)<=x)
			{
				x=z+y;
			}
			
			System.out.println((y*w)+(x*b));
		}
		in.close();
	}

}
