package java_Logics;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) 
	{

		String str[]={"nandu","chandu","df","bindu","Krishna","lucky"};
		HashSet<String> ad=new HashSet<String>();
		boolean flag=false;
		for(String i:str)
		{
			if(ad.add(i)==false)
			{
				System.out.println("Duplicate Value is:: "+i);
				flag=true;
			}
		}
		if(flag==false)
		{
		System.out.println("Here No Duplicates Elements");	
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		String s[]={"cc","ss","ee","ee","rr","cc","ww"};
		boolean flags=false;
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i+1; j < s.length; j++)
			{
				if(s[i]==s[j])
				{
					System.out.println("duplicate Values Are :: "+s[i]);
					flags=true;
				}
			}
			
		}
		if(flags==false)
		{
			System.out.println("In This Array Dont Have Duplicate Values");
		}
		
		
		
		
		
		
	}

}
