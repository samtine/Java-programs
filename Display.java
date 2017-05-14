package polymorphism;

public class Display {
	public static void display(Vehicle_Prop d1) {
		System.out.println("Vehicle: "+d1.getType());
		System.out.println("Name: "+d1.getname());
		System.out.println("Rate: "+d1.getRate());
		System.out.println("Speed: "+d1.getSpeed());
		System.out.println("_____________________________________________________");
		
	}
	public static void main(String[] args) {
	
		Display.display(new Two_Wheeler());
		Display.display(new Three_Wheeler());
		Display.display(new Four_Wheeler());
	}
	

}
