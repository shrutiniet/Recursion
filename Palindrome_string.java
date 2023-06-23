package Recurssion;
import java.util.*;
public class Palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		str=str.toLowerCase();
		System.out.println(str);
		int n=str.length()-1;
		boolean ans=isPalin(str,0,n);
		if(ans==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
public static boolean isPalin(String str, int i, int j)
{
	if(i>=j)
		return true;
	if(str.charAt(i)!=str.charAt(j))
		return false;
	return isPalin(str,i+1,j-1);
}
}
