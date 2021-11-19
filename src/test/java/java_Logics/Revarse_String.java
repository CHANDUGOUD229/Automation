package java_Logics;

public class Revarse_String {

	public static void main(String[] args) 
	{
     //1St Logic Using String Buffer
		String a="ABCDEFGH";
		StringBuffer ss=new StringBuffer(a);
		ss.reverse();
		System.out.println(ss);
		
		
		//2nd Method To revarse String 
		System.out.println("  ");
		String name="CHANDRA SHEKHAR";
		String	rev="";
		int length=name.length()-1;
		for(int i=length;i>=0;i--)
		{
	        rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		//3nd Method To revarse String 
		System.out.println("  ");
		String str="ABCDEF";
		String revarse="";
		char ch[]=str.toCharArray();
		int len=ch.length-1;
		for(int i=len;i>=0;i--)
		{
			revarse=revarse+ch[i];
		}
		System.out.println(revarse);
		
		
	}

}
