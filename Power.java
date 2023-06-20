package Recurssion;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int ans=Pow(1,x,n);
		System.out.println(ans);

	}
public static int Pow(int a,int x, int n)
{
	if(a>n)
		return 1;
	return x*Pow(a+1,x,n);
}
}
