package java_Logics;

public class SwapNumbers {

	public static void main(String[] args) 
	{

		//Swapping Number With The Help Of Third Variable
		
		int a=10,b=20;
		System.out.println("BeforeSwapping : "+a+" "+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("AfterSwapping : "+a+" "+b);
		
		//Without Helping Third Variable We Can 
		
		int k=100,l=500;
		k=k+l;
		l=k-l;
		k=k-l;
		System.out.println("AfterSwapping : "+k+"  "+l );
		
		//3rd Method 
		int n=700,m=900;
		n=n*m;
		m=n/m;
		n=n/m;
		System.out.println(n+" "+m);
		
		//4th Method 
		
		
		int s=121,sss=321;
		
		s=s^sss;
		sss=s^sss;
		s=s^sss;
		
		System.out.println(s+" "+sss);
		
		
		
		
		
		
		
		
		
	}

}
