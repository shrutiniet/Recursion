package Recurssion;
import java.util.*;
public class Decreasing_Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Dec_Inc(n);
	}
public static void Dec_Inc(int n)
{
	if(n==0)
		return;
	System.out.println(n);
	Dec_Inc(n-1);
	System.out.println(n);
}
}
