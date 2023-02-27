import java.util.*;
class RecGrayCode{
public static void main(String[] abu){
Scanner s=new Scanner(System.in);
char ch[]=s.next().toCharArray();
CreatGrayCode(ch,0);
	}
public static void CreatGrayCode(char[] ch,int i){
	if(i==ch.length)
		return;
	else if(i==0){
		System.out.print(ch[i]);
		i++;
		CreatGrayCode(ch,i);
		return;
		}
	else if(ch[i]!=ch[i-1]){
			System.out.print("1");
			i++;
			CreatGrayCode(ch,i);
			return;
		}
		System.out.print("0");
		i++;
		CreatGrayCode(ch,i);
	}
}