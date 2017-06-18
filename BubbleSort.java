package array;

public class BubbleSort 
{
public static int[] a;
public int i,j,k;
public int[] sort(int[] a)
{
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				k=a[j];
				a[j]=a[j+1];
				a[j+1]=k;
			}
		}
		
	}
	return a;
}
public static void main(String[] args) {
	int a[]={21,4,76,45,45};
	BubbleSort b=new BubbleSort();
	b.sort(a);
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	
}
}