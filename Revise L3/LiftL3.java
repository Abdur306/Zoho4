import java.util.*;
class LiftL3{
public static void main(String [] args){
Lift abu=new Lift();
abu.FirstModule();

}
}
class Lift{
	static Scanner s=new Scanner(System.in);
	static int lift[]=new int[5];
	int k=0;
	
	public void FirstModule(){
		System.out.println("L0\tL1\tL2\tL3\tL4\t");
		for(int i=0;i<5;i++){
			System.out.print(lift[i]+1+"\t");
		}EightModule();
	}
	public void EightModule(){
		  for(int i=0;i<5;i++){
			if(lift[i]!=0){
			System.out.println("\n Enter the Lift No ");
		    int lif=s.nextInt();
			lift[lif]=-1;	
			break;
			}
		}
		for(int i=0;i<5;i++)
			System.out.print(lift[i]);
	}
	
	
	
}










































/*
class Lift{
	ArrayList<Details>lift=new ArrayList<>();
	int k=0;
	static Scanner s=new Scanner(System.in);
	
	public void FirstModule(){
	for(int i=0;i<5;i++){
	int lift_no=i+1;
    int floor=0; 	
	lift.add(new Details(lift_no,floor));
	}
display();	
	}
	public void display(){
		for(int i=0;i<lift.size();i++){
	System.out.println(lift.get(i));
		}
	}
	public void SecondModule(){
		System.out.println("enter the floor to go");
		int curflr=s.nextInt();
		int rflr=s.nextInt();
		for(i=0;i<lift.size;i++){
		if(lift.get(i).floor==curflr)
			
			
			
		}
		
		
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
		return lift_no+" - "+floor;
	}
	
	
}*/