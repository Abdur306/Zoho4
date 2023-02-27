 import java.util.*;
 class MaxProfit{ 
  public static void main(String[] args)
    {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int price[]=new int[n];
		for(int i=0;i<n;i++)
		{
			
			 price[i]=s.nextInt();
			 
		}
       System.out.println(maxProfit(price, n));
    }
	 static int maxProfit(int prices[], int size)
    {
		 int maxProfit = 0;
            if(maxProfit!=0){
			return maxProfit;
			}
		
        for (int i = 1; i < size; i++)
	    if (prices[i] > prices[i - 1])
      maxProfit += prices[i] - prices[i - 1];
        return maxProfit;
    }
}
 