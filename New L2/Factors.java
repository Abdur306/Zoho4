import java.util.*;
class Factors{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(FindFact(a[i])<FindFact(a[j])){
		int temp=a[i];
         a[i]=a[j];
          a[j]=temp;		 
			
		}
	}
}
show(a);
}
public static int FindFact(int n){
	int count=0;
for(int i=1;i<n;i++){

//for(int j=1;j<=a[i];j++){
   if(n%i==0){
      count++;
   }	   
   else{
	   continue;
   }
 }
 return count;
}


public static void show(int a[]){
for(int i=0;i<a.length;i++){
	System.out.println(a[i]+" ");
}
}

}

