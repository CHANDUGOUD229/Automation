package java_Logics;

public class Add_EvenNumberseInArray {

	public static void main(String[] args)
	{
	int num[]={1,2,3,4,5,6,7,8,9}; 
	System.out.println("EvenNumberse Printing");
	for(int i=0;i<num.length;i++)
	{
		
		if(num[i]%2==0)
		{
			System.out.print(num[i]+" ");
		}
		
	}
	
	System.out.println();
	System.out.println("Addnu8mberse Printing");
	for(int j=0;j<num.length;j++)
	{
		if(num[j]%2!=0)
		{
			System.out.print(num[j]+" ");
		}
	}
	
	
	
		
	}

}
