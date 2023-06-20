package Recurssion;
import java.util.*;
public class Sum_of_first_n_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Sum(1,n,0);     //--> Method 1
		int ans=Sum(n);     // Method 2
		System.out.println(ans);
		
	}
public static void Sum(int a,int n, int sum)
{
	if(a>n)
	{		
		System.out.println(sum);
		return;
	}
	sum=sum+a;
	Sum(a+1,n, sum);
}
public static int Sum(int n)
{
	if(n==0)
		return 0;
	return n+Sum(n-1);
}
}
