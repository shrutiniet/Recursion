package Recurssion;
import java.util.*;
public class reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Before Reverse");
		for(int i:arr)
			System.out.print(i+" ");
		Reverse(0,n-1,arr);
		System.out.println();
		System.out.println("After Reverse");
		for(int i:arr)
			System.out.print(i+" ");
	}
	public static void Reverse(int a, int b, int[] arr)
	{
		if(a>=b)
			return;
		int tmp=arr[a];
		arr[a]=arr[b];
		arr[b]=tmp;
		Reverse(a+1, b-1,arr);
	}

}
