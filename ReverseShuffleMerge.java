
import java.util.Arrays;
import java.util.Scanner;


public class ReverseShuffleMerge {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char a[]=s.toCharArray();
		Arrays.sort(a);
		char arr[]=new char[a.length/2];
		int c=0;
		for(int i=0;i<a.length;i=i+2)
		{
			arr[c++]=a[i];
		}
		
		while(true)
		{
			int i = arr.length - 1;
			char revarr[]=new char[arr.length];
			int ch=0;
			for(int ij=arr.length-1;ij>=0;ij--)
			{
				revarr[ch++]=arr[ij];
			}
			if(s.contains(new String(revarr))){
		    	System.out.println(new String(arr));
		    	break;}	
		
	    while (i > 0 && arr[i - 1] >= arr[i])
	        i--;
	    if (i <= 0){
	        System.out.println(new String(arr));
	        System.exit(0);
	    }
	    int j = arr.length - 1;
	    while (arr[j] <= arr[i - 1])
	        j--;
	    char temp = arr[i - 1];
	    arr[i - 1] = arr[j];
	    arr[j] = temp;
	    
	    // Reverse suffix
	    j = arr.length - 1;
	    while (i < j) {
	        temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	        i++;
	        j--;
	    }
		}
	    
		in.close();
	}

}
