import java.util.*;
class PatternTrai{
public static void main(String [] abu){
 Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
	
	System.out.print(j+"* ");
}
System.out.println();
}
for(int i=1;i<=n;i++){
for(int j=n-1;j>=i;j--){
	System.out.print(j+"* ");
}
System.out.println();
}	
}
}