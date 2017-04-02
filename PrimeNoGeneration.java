
public class PrimeNoGeneration {
public int a,b,i,j;
public void diplay(){
	b=0;
	System.out.println("2");		
	for(i=3;b<10;i++){
		for(j=2;j<i/2;j++){
			if(i%j==0){
				a=1;
				break;
			}
			else{
				a=0;
			}
		}
		if(a==0){
			b=b+1;
			System.out.println(i);
		}
	}
}
public static void main(String[] args) {
	PrimeNoGeneration p=new PrimeNoGeneration();
	p.diplay();
	}
}