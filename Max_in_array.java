package Recurssion;
import java.util.*;
public class Max_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();		
		Max(arr[0],1,arr);
}
public static void Max(int val,int idx, int[]arr)
{
	if(idx>=arr.length)
	{
		System.out.println("Maximum value= "+val);
		return;
	}
	val=Math.max(val,arr[idx]);
	Max(val,idx+1,arr);
}
}
