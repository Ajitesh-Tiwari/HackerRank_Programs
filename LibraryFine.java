
import java.util.Scanner;


public class LibraryFine {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int fine=0;
		int arrDt1[]=new int[3];
		int arrDt2[]=new int[3];
		for(int i=0;i<3;i++)
		{
			arrDt1[i]=in.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			arrDt2[i]=in.nextInt();
		}
		if(arrDt1[2]==arrDt2[2])
		{
			if(arrDt1[1]==arrDt2[1])
				if(arrDt1[0]>arrDt2[0])
					fine=15*(arrDt1[0]-arrDt2[0]);
				else
					fine=0;
			else if(arrDt1[1]>arrDt2[1])
				fine=500*(arrDt1[1]-arrDt2[1]);
			else
				fine=0;
		}
		else if(arrDt1[2]>arrDt2[2])
			fine=10000;
		else
			fine=0;
		System.out.println(fine);
		in.close();
	}

}
