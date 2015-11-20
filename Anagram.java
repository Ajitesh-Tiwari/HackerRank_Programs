import java.util.ArrayList;
import java.util.Scanner;


public class Anagram {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		for(int z=0;z<turns;z++)
		{
			String s=in.next();
			if(s.length()%2!=0)
			{
				System.out.println("-1");
			}
			else{
				String s1=s.substring(0,(s.length()/2));
				String s2=s.substring(s.length()/2);
				//System.out.println(s1);
				ArrayList<Character> al1=new ArrayList<Character>();
				ArrayList<Character> al2=new ArrayList<Character>();
				for(int i=0;i<s1.length();i++)
					al1.add(s1.charAt(i));
				for(int i=0;i<s2.length();i++)
					al2.add(s2.charAt(i));
				for(int i=0;i<al2.size();i++)
				{
					if(al1.indexOf(al2.get(i))!=-1){
						al1.remove(al1.indexOf(al2.get(i)));
						al2.remove(i);
						i--;
					}
				}
				System.out.println(al1.size());
			}
		}
		in.close();
	}

}
