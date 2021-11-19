package java_Logics;

public class Number_Reverse {

	public static void main(String[] args)
	{

		//1st Method To Revasre Number Using StringBuffer
		int a=2115;
		System.out.println(new StringBuffer(String.valueOf(a)).reverse());
		
		//2nd Method to Reverse Number Using While Loop
       long count=789;
       long rev=0;
       
       while(count!=0)
       {
    	   rev=rev*10+count%10;
    	   count=count/10;
       }
       System.out.println(rev);
		
		
		
	}

}
