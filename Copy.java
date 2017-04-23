package copy_constructor;

public class Copy {
	public int i;
	Copy(int i){
		this.i=i;
	}
	public static void main(String[] args) {
		Copy c1=new Copy(10);
		System.out.println(c1.i);
		Copy c2=c1;
		System.out.println(c2.i);
		c2.i=20;
		System.out.println(c1.i);
	}

}
