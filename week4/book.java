import java.util.Scanner;
class Movie{
	int x; int y;
	public Movie(int x, int y) {
		this.x=x; this.y=y;
	}
}

public class book {
	public static void main(String[] args) {
		Movie[] my = new Movie[10];
		for(int i=0;i<my.length;i++) {
			my[i] = new Movie(i,0);
			}
		System.out.println("--------------------");
		for(Movie obj : my) {
			System.out.print(obj.x +" ");
		}System.out.println();
		System.out.println("--------------------");
		for(Movie obj : my) {
			System.out.print(obj.y+" ");
		}System.out.println();
		System.out.println("--------------------");
		System.out.print("���° �¼��� �����Ͻðڽ��ϱ�?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println("����Ǿ����ϴ�.");
		for(int i =0;i<my.length;i++) {
			if(num==i) my[i].y=1;
		}
		System.out.println("--------------------");
		for(Movie obj : my) {
			System.out.print(obj.x +" ");
		}System.out.println();
		System.out.println("--------------------");
		for(Movie obj : my) {
			System.out.print(obj.y+" ");
		}System.out.println();
		System.out.println("--------------------");
	}
}
