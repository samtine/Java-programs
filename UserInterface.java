package register;
import java.util.*;
public class UserInterface extends Validation {
	public int n,m,o,p;
	public String s1,s2,s3;
	private Scanner s;
	public void input(){
		//Validation E=new Validation();
		
		UserInterface obj=new UserInterface();
		s = new Scanner(System.in);
		do{
			System.out.println("Enter Name");
			s1=s.next();
			m=obj.validateName(s1);
			System.out.println("checking name validity");
		}
		while(m==1);
		try{
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			
		}
		System.out.println("Enter Date of birth");
		System.out.println("format DD/MM/YYYY");
		s2=s.next();
		do{
		System.out.println("Enter a password");
		s3=s.next();
		System.out.println("re-enter password");
		if(s3.equals(s.next())){
			System.out.println("Data entry successful");
			n=0;
		}
		else{
			System.out.println("Doesn't match");
			n=1;
		}
		
	}while(n==1);
 }
}