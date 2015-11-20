
import java.io.IOException;
import java.util.Scanner;


public class Grid {
	public static void main(String[] args)throws IOException {
		int ans,err=0;
		Scanner in=new Scanner(System.in);
		int z=in.nextInt();
		for(int y=0;y<z;y++)
		{
		int r=in.nextInt();
		int c=in.nextInt();
		String arr[]=new String[r];
		for(int i=0;i<r;i++)
		{
			arr[i]=String.valueOf(in.next());
		}
		int r1=in.nextInt();
		int c1=in.nextInt();
		String arr1[]=new String[r1];
		for(int i=0;i<r1;i++)
		{
			arr1[i]=String.valueOf(in.next());
		}
		
		for(int i=0;i<r;i++)
		{
			ans=0;
			if(arr[i].contains(arr1[0]))
			{
				ans++;
				int pos=arr[i].indexOf(arr1[0]);
				int k=i+1;
				for(int j=1;j<r1;j++)
				{
					if(arr[k++].substring(pos, pos+c1).contains(arr1[j]))
					{
						ans++;
					}
				}
				
			}
			if(ans==r1)
			{
				System.out.println("YES");
				err=10;
				break;
				
			}
			else{
				err=-1;
			}
		}
		if((err==0)||(err==-1))
			System.out.println("NO");
		}
		in.close();
		
	}

}
