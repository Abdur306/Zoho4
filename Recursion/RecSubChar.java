import java.util.*;
class RecSubChar{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
		
		char c[]=s.next().toCharArray();
		subSeq(c,0,0);
	}
	public static void subSeq(char a[],int start,int end)
	{
		if(start==a.length)
		return;
		if(end==start)
		{
			System.out.print(a[start]);
			subSeq(a,start,end+1);
		}
		else if(end<a.length)
		{
			System.out.print("  ");
			for(int i=start;i<=end;i++)
			{
				System.out.print(a[i]);
			}
			subSeq(a,start,end+1);	
		}
		else
		{
			//System.out.println();
			subSeq(a,start+1,0);
		}
	}
}