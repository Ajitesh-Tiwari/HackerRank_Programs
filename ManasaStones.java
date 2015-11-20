import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ManasaStones {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		ArrayList<Integer> arr;
		for(int z=0;z<turns;z++)
		{
			arr=new ArrayList<Integer>();
			int n=in.nextInt();
			int a=in.nextInt();
			int b=in.nextInt();
			for(int i=0;i<n;i++)
			{
				arr.add(new Integer((a*(n-i-1))+(b*i)));
				arr.add(new Integer((a*(i))+(b*(n-i-1))));
			}
			int pre=-1;
			Collections.sort(arr);
			for(int i=0;i<arr.size();i++)
			{
				if(arr.get(i)!=pre)
					System.out.print(arr.get(i)+" ");
				pre=arr.get(i);
			}
			System.out.println();
		}
		in.close();
	}

}
