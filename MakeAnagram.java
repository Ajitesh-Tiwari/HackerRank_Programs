import java.util.ArrayList;
import java.util.Scanner;


public class MakeAnagram {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Character> al1=new ArrayList<Character>();
		ArrayList<Character> al2=new ArrayList<Character>();
		String s1=in.next();
		String s2=in.next();
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
		System.out.println(al1.size()+al2.size());
		
		in.close();
	}

}
