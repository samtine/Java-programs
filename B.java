package inheritance_constructor;
public class B extends A{
	B(){
		super();
		System.out.println("b");
	}
	public static void main(String args[]){
		System.out.println("b main");
	}

}
