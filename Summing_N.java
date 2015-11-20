import java.math.BigInteger;
import java.util.Scanner;


public class Summing_N {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		BigInteger mod=BigInteger.TEN.pow(9).add(new BigInteger("7"));
		BigInteger num;
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			num=in.nextBigInteger();
			System.out.println(num.multiply(num).mod(mod));
			
		}
		in.close();
	}

}
