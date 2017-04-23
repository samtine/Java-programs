package inheritance_constructor;
public class C extends B{
	public int i;
	C(){
		this(100);
		System.out.println("c");
	}
	C(int i)
	{
		this.i=i;
		System.out.println("int c");	
	}
	public static void main(String args[]){
		C c=new C();
		System.out.println("main");
		System.out.println(c.i);
	}
}
