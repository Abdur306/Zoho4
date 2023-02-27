import java.util.*;
class OddNum{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("Enter st number");
int st=s.nextInt();
System.out.println("Enter ed number");
int ed=s.nextInt();
for(int i=st;i<ed;i++){
	if(i%2!=0){
		System.out.println(i);
	}
	else{
		continue;
	}
}


}
}