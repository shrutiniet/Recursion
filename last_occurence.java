package Recurssion;
import java.util.*;
public class last_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter value to be search=");
		int val=sc.nextInt();
		int ans=Last(-1,arr.length-1,val,arr);
		if(ans==-1)
			System.out.println("Not Found");
		else
			System.out.println("Found at idx: "+ ans);

	}
public static int Last(int found,int idx, int val, int[]arr)
{
	if(idx==0)
		return found;
	if(val==arr[idx])
		return idx;
	return Last(found,idx-1,val,arr);
}
}
