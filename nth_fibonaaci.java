package Recurssion;
import java.util.*;
public class nth_fibonaaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=fib(n);
		System.out.println(ans);

	}
public static int fib(int n)
{
	if(n<=1)
		return n;
	return fib(n-1)+fib(n-2);
}
}
