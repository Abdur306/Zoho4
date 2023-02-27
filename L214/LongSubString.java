import java.util.*;
class LongSubString{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
char y[]=str.toCharArray();
int max=0;
for(int i=0;i<y.length;i++){
	int count=1;
	for(int j=i+1;j<y.length;j++){
		if(y[i]!=y[j]){
			count++;
		}
		else if(y[i]==y[j]){
			
			break;
		}
	}
	if(max<count){
		max=count;
	}

}
System.out.println(max);
}
}