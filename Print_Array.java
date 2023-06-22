package Recurssion;
import java.util.*;
public class Print_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Print(0,arr);

	}
public static void Print(int idx, int[]arr)
{
	if(idx==arr.length)
		return;
	System.out.print(arr[idx]+" ");
	Print(idx+1,arr);
}
}
