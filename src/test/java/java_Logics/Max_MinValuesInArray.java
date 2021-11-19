package java_Logics;

public class Max_MinValuesInArray {

	public static void main(String[] args)
	{
			int a[]={1,5,8,9,22,0,-4}; 
			
			int max=a[0];
			
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i]>max)
				{
				 max=a[i];
				 
				}
				
			}
			  System.out.println("MaxNUMBER  :::" +max);

			  int min=a[0];;
			  
			  for(int i=1;i<=a.length-1;i++)
			  {
				  if(a[i]<min)
				  {
					  min=a[i];
				  }
			  }
			System.out.println("MINnumber ::: " +min);
			
	}

}
