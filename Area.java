
public class Area {
	public int r,a,b,c,d;
	public float area;
	float circleArea(int r){
		area=(float) (3.14*r*r);
		return area;
	}
	int reactangleArea(int a,int b){
		area=a*b;
		return (int) area;
	}
	float triangleArea(int a,int b){
		area=(float)0.5*a*b;
		return area;
	}
	public static void main(String[] args) {
		Area a=new Area();
		System.out.println(a.circleArea(5));
		System.out.println(a.reactangleArea(5, 5));
		System.out.println(a.triangleArea(5, 4));
	}

}
