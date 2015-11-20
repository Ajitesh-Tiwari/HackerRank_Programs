
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class CutTheSticks {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer> arrls=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arrls.add(new Integer(in.nextInt()));
		}
		while(!arrls.isEmpty())
		{
			int count=0;
			Integer min=Collections.min(arrls);
			for(int i=0;i<arrls.size();i++)
			{
				arrls.set(i, arrls.get(i)-min);
				count++;
			}
			System.out.println(count);
			for(int i=0;i<arrls.size();i++)
			{
				if(arrls.get(i)==0){
					arrls.remove(i);
					i--;
				}
			}
		}
		in.close();
	}

}
