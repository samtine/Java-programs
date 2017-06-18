package array;
import java.util.Scanner;
public class LinearSearch {
public int i,j;
private static Scanner s;
public void search(int[] a,int b){
	for(i=0;i<a.length;i++){
		if(a[i]==b){
			System.out.print("element is prensent in position ");
			System.out.print(i+1);
		}
	}
}
public static void main(String[] args) {
	int n;
	System.out.println("enter no. of elements ");
	s = new Scanner(System.in);
	n=s.nextInt();
	int[] a=new int[n];
	System.out.println("Enter elements");
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	LinearSearch l=new LinearSearch();
	System.out.println("Enter element to be searched");
	l.search(a, s.nextInt());
	 
}

}
