package Recurssion;
import java.util.*;
public class Increasing_Decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Inc_Dec(1,n);

	}
public static void Inc_Dec(int a, int n)
{
	if(a>n)
		return;
	System.out.println(a);
	Inc_Dec(a+1,n);
	System.out.println(a);
}
}
