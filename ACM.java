import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Scanner;


public class ACM {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int nppl=in.nextInt();
		int ntopic=in.nextInt();
		BitSet temp;
		ArrayList<Integer> result=new ArrayList<Integer>();
		ArrayList<BitSet> al=new ArrayList<BitSet>(nppl);
		for(int i=0;i<nppl;i++)
		{
			temp=new BitSet(ntopic);
			temp.clear();
			String s=in.next();
			for(int j=0;j<ntopic;j++)
			{
				if(Integer.parseInt(""+s.charAt(j))==1)
					temp.set(j);
			}
			al.add(temp);
		}
		for(int i =0;i<nppl;i++)
		{
			for(int j=i;j<nppl;j++)
			{
				if(i!=j)
				{
					BitSet imp=new BitSet();
					imp=(BitSet)al.get(i).clone();
					imp.or(al.get(j));
					result.add(new Integer(count(imp)));
				}
			}
		}
				System.out.println(Collections.max(result));
				System.out.println(Collections.frequency(result, Collections.max(result)));
		
		in.close();
	}
	static int count(BitSet bs)
	{
		int count=0;
		for(int i=0;i<bs.size();i++)
		{
			if(bs.get(i)==true)
			{
				count++;
			}
		}
		return count;
	}

}
