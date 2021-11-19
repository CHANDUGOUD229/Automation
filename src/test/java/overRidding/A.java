package overRidding;

public class A {

	public void sum(int a, int b) {
		System.out.println("parent class sum");
		System.out.println(a * b);
	}

	public int sub(int a, int b) 
	{
		System.out.println("parent cls sub");
		return (a - b)*15;
	}
	
	/* if child class not satisfy with parent class implementation then override that method we can implement 
	 * in as per our reqmts
	 * 
	 * return type it may be change
	 * 
	 * method name and parameter should be same
	 * 
	 * static and final methods we can't override
	 * 
	 * with out final keyword also we can't override contractor
	 * 
	 */

}
