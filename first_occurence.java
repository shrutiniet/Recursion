package Recurssion;
import java.util.*;
public class first_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter value to be search=");
		int val=sc.nextInt();
		int ans=First(-1,0,val,arr);
		if(ans==-1)
			System.out.println("Not Found");
		else
			System.out.println("Found at idx: "+ ans);
	}
public static int First(int found,int idx, int val, int[]arr)
{
	if(idx>=arr.length)
	{
		if(val==-1)
			return -1;
		else			
			return found;
	}
	if(val==arr[idx])
	{
		found=idx;
		return found;
	}
	return First(found,idx+1,val,arr);
}
}
