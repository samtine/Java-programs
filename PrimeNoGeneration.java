
public class PrimeNoGeneration {
public int a,b,i,j;
public void diplay(){
	b=0;
	System.out.println("2");
	System.out.println("3");
	for(i=3;b<8;i++){
		for(j=2;j<i/2;j++){
			if(i%j==0){
				a=0;
				break;
			}
			else{
				a=1;
			}
		}
		if(a==1){
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