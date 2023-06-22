package Recurssion;
import java.util.Scanner;
public class Min_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();		
		MIN(arr[0],1,arr);
}
public static void MIN(int val,int idx, int[]arr)
{
	if(idx>=arr.length)
	{
		System.out.println("Minimum value= "+val);
		return;
	}
	val=Math.min(val,arr[idx]);
	MIN(val,idx+1,arr);
}

	}

