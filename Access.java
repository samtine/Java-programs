package register;
import java.util.*;
public class Access extends UserInterface {
	public static int a;
	boolean b1,b2;
	public String r1,r2;
	private Scanner s;
    public void display(){
    	UserInterface U1=new UserInterface();
    	U1.input();
    	s=new Scanner(System.in);
    	System.out.println("login........");
    	do{
    		System.out.println("enter name: ");
    	r1=s.next();
    	if(r1==(U1.s1)){
    		b1=true;
    	}
    	System.out.println("enter password: ");
    	r2=s.next();
    	if(r2==(U1.s3)){
    		b2=true;
    	}
    	}while(b1||b2);
    	System.out.println("_____________Login successfull____________");
    	System.out.println("Name: "+U1.s1);
    	System.out.println("D.O.B :"+U1.s2);
    	System.out.println("enter 1 if info are correct 2 if wrong");
    	s=new Scanner(System.in);
    	a=s.nextInt();   	
    }
    public static void main(String[] args) {
		do{
			Access A=new Access();
			A.display();
		}
		while(a==2);
		
	}
	
}
