
import java.util.Scanner;


public class ArrayListExam {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sum=0;
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			sum+=in.nextInt();
		}
		System.out.println(sum);
		in.close();
		
	}

}
