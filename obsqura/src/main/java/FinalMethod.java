

public class FinalMethod {
 int a,b,c;
	public final void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		int sum=a+b;
		System.out.println(sum);
	}
	public final void add(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		int sum=a+b+c;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		FinalMethod obj=new FinalMethod();
		obj.add(10,20);
		obj.add(10,20,30);
		
		

	}

}
