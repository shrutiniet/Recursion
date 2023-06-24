package Recurssion;
import java.util.*;
public class Sum_of_all_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Sum(0,arr,0);
	}
public static void Sum(int idx, int[]arr, int sum)
{
	if(idx==arr.length)
	{
		System.out.println("Sum= "+sum);
	return;
	}
	sum+=arr[idx];
	Sum(idx+1,arr,sum);
}
}
