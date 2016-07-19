import java.util.Scanner;


public class Sum {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num:");
		int s=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			 s+=i;
			 }
		System.out.println("Sum:"+s);	
		

	}

}
