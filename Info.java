package interface_ex1;

public class Info {
	public static void main(String[] args) {
	TwoWheeler t1=new TwoWheeler();

	System.out.println("name of two-wheeler is  "+t1.getname());
	System.out.println("rate of two-wheeler is  "+t1.getRate());
	System.out.println("max. speed of two-wheeler is  "+t1.getSpeed());
	ThreeWheeler t2=new ThreeWheeler();
	System.out.println("name of three-wheeler is  "+t2.getname());
	System.out.println("rate of three-wheeler is  "+t2.getRate());
	System.out.println("max. speed of three-wheeler is  "+t2.getSpeed());
	FourWheeler t3=new FourWheeler();
	System.out.println("name of four-wheeler is  "+t3.getname());
	System.out.println("rate of Four-wheeler is  "+t3.getRate());
	System.out.println("max. speed of Four-wheeler is  "+t3.getSpeed());
	}
}
