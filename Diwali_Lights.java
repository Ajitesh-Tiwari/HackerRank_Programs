
import java.math.BigInteger;
import java.util.Scanner;


public class Diwali_Lights {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		BigInteger sum;
		
		for(int i=0;i<n;i++)
		{	
			int x=in.nextInt();
			sum=BigInteger.valueOf(2).pow(x).subtract(BigInteger.ONE).mod(new BigInteger("100000"));
			System.out.println(sum);
			
		}
		in.close();
	}
	

}
