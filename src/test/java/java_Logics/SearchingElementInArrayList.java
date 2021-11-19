package java_Logics;

public class SearchingElementInArrayList {

	public static void main(String[] args)
	{
		int a[]={12,34,545,234,45,4356};
		
		int searchValue=141;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(searchValue==a[i])
			{
				System.out.println("MacheadValue Of Array Is ::"+a[i]);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Your Value Is Doen't Match With Array");
		}
	}

}
