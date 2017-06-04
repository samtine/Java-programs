package register;

public class Validation extends Thread{
	public int validateName(String S){
		String regex = "[a-zA-Z]+\\.?";
		if(S.matches(regex)){
			return 0;
		}
		else{
			return 1;
		}
		
		
	}

}
