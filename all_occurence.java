package Recurssion;
import java.util.*;
public class all_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter value to be search=");
		int val=sc.nextInt();
		All(0,val,arr);
	}
public static void All(int idx,int val, int[]arr)
{
	if(idx>=arr.length)
		return;
	if(val==arr[idx])
		System.out.println("Found at idx :"+ idx);
	All(idx+1,val,arr);
}
}
