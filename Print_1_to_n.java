package Recurssion;
import java.util.*;
public class Print_1_to_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Print(1,n);

	}
public static void Print(int a,int n)
{
	if(a>n)
		return;
	System.out.println(a);
	Print(a+1,n);
}
}
