import java.util.*;
class ListArr{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int c[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for(int i=0;i<n;i++){
	if(a[i]%2==0){
		b[i]=a[i];
	}
	else{
		continue;
	}
}
System.out.println(Arrays.toString(b));
/*
for(int i=n-1;i>0;i--){
	if(b[i]>0){
	if(b[i]%2==0){	
		c[i]=b[i];
	}
	else{
		continue;
	}
	}
	else{
		continue;
	}
}
System.out.println(Arrays.toString(c));*/


}
}