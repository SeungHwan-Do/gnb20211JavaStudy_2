import java.util.Scanner;
class Radius{
	public final static double PI = 3.14;
	protected double r;
	public void getR() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ����: ");
		r = sc.nextDouble();
	}
}
class Circle extends Radius{
	public Circle() {
		super.getR();
		double area = PI*r*r;
		double periphery = 2*PI*r;
		System.out.println("���� ���̴� "+area+", �ѷ��� "+periphery+"�Դϴ�.");
	}
}
class Cylinder extends Radius{
	public Cylinder() {
		super.getR();
		System.out.print("����: ");
		Scanner sc = new Scanner (System.in);
		double height = sc.nextDouble();
		double surface = 2*PI*r*height+2*PI*r*r;
		double volume = PI*r*r*height;
		System.out.println("������� �ѳ��̴� "+surface+", ���Ǵ� "+volume+"�Դϴ�.");
	}
}
class Sphere extends Radius{
	public Sphere() {
		super.getR();
		double surface = 4*PI*r*r;
		double volume = (4/3)*PI*r*r*r;
		System.out.println("���� �ѳ��̴� "+surface+", ���Ǵ� "+volume+"�Դϴ�.");
	}
}
public class SurfaceandVolume {

	public static void main(String[] args) {
		System.out.print("������ �����Ͻÿ�. (��, �����, ��)  ");
		Scanner sc = new Scanner(System.in);
		String what = sc.nextLine();
		switch(what) {
		case ("��"):
			Circle c = new Circle();
			break;
		
		case ("�����"):
			Cylinder y = new Cylinder();
			break;
		
		case ("��"):
			Sphere s = new Sphere();
			break;
		}

	}

}
