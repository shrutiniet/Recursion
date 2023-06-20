package Recurssion;
import java.util.*;
public class Print_n_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Print(n);
	}
public static void Print(int n)
{
	if(n==0)
		return;
	System.out.println(n);
	Print(n-1);
}
}
