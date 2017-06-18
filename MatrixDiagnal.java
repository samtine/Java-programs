package array;

import java.util.Scanner;

public class MatrixDiagnal {
public int i,j,k;
private Scanner s;
public void diagnolAdd(){
	int[][] a=new int[3][3];
	s = new Scanner(System.in);
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			System.out.println("enter a["+i+"]["+j+"]");
			a[i][j]=s.nextInt();
		}
	}
	k=0;
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
		if(i==j){
			k=k+a[i][j];
		}
		}
	}
	System.out.println("sum of leading diagnal elements : "+k);
	
	
}
public static void main(String[] args) {
	MatrixDiagnal m =new MatrixDiagnal();
	m.diagnolAdd();
}
}
