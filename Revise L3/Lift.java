import java.util.*;
class Lift{
public static void main(String [] abu){

Lift lift=new Lift();
lift.Initial();
}
}
class Lift{
	Details lift[]=new Details[5];
	int k=0;
	static Scanner s=new Scanner(System.in);
	public void Initial(){
	for(int i=0;i<5;i++){
	int lift_no="L"+(i+1);
    int floor=0; 	
	new Details(lift_no,floor);
	}
display();	
	}
	public void display(){
		for(int i=0;i<5;i++)
		System.out.print(Details[i]+" ");
	}
	
	
	
}
class Details{
int lift_no;
int floor;

public Details(int lift_no,int floor){	
	this.lift_no=lift_no;
	this.floor=floor;
	}
	
	public String toString(){
		return lift_no+" "+floor;
	}
	
	
}