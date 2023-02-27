import java.util.*;
class RecPer{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
char c[]=str.toCharArray();
Per(c,0,c.length-1);
	}
	static void Per(char c[],int l,int r){
		if(l==r)
			System.out.println(Arrays.toString(c));
		for(int i=l;i<=r;i++){
			Swapp(c,i,l);
			Per(c,l+1,r);
			Swapp(c,i,l);
			
		}
	}
	static void Swapp(char c[],int i,int j){
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		
	}
}
