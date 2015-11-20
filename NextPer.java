import java.util.Scanner;


public class NextPer {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turns=in.nextInt();
		for(int z=0;z<turns;z++)
		{
		String s=in.next();
		char array[]=s.toCharArray();
		int i = array.length - 1;
	    while (i > 0 && array[i - 1] >= array[i])
	        i--;
	    if (i <= 0){
	        System.out.println("no answer");
	        continue;
	    }
	    int j = array.length - 1;
	    while (array[j] <= array[i - 1])
	        j--;
	    char temp = array[i - 1];
	    array[i - 1] = array[j];
	    array[j] = temp;
	    
	    // Reverse suffix
	    j = array.length - 1;
	    while (i < j) {
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        i++;
	        j--;
	    }
	    System.out.println(new String(array));
		}
		in.close();
	}
}
