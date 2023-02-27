import java.util.*;
class RecSub{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of a array");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		subSequences(a,0,0);
	}
	public static void subSequences(int a[],int start,int end)
	{
		if(start==a.length)
		return;
		if(end==start)
		{
			System.out.print(a[start]);
			subSequences(a,start,end+1);
		}
		else if(end<a.length)
		{
			System.out.print("  ");
			for(int i=start;i<=end;i++)
			{
				System.out.print(a[i]);
			}
			subSequences(a,start,end+1);	
		}
		else
		{
			//System.out.println();
			subSequences(a,start+1,0);
		}
	}
}