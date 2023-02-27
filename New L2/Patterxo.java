import java.util.*;
class Patterxo{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("row");
int r=s.nextInt();
System.out.println("col");
int c=s.nextInt();
char a[][]=new char[r][c];
int rst=0;//,cst=0;
int red=r-1;//,ced=c-1;
int count=0;
 char ch;
while(c>0){
	if(count%2==0){
		ch='0';
	}
	else{
		ch='X';
	}
	for(int i=rst;i<=red;i++){
	for(int j=rst;j<=red;j++){
	if(i==rst||j==rst||i==red||j==red){
		a[i][j]=ch;
  }
    }
	  }
	    
	
	/*	for(int i=rst;i<=red;i++){
	for(int j=cst;j<=ced;j++){
	if(i==rst||j==red||i==cst||j==ced){
		a[i][j]=ch;
	}
	 }
	  }*/
	   rst++;red--;
	count++;
     c--;
}
for(int i=0;i<r;i++){
	for(int j=0;j<c;j++){
System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
}
}