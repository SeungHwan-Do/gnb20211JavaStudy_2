import java.util.Scanner;
public class Ticketing {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		System.out.println("---------------------------");
		for(int i = 0;i<10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		for(int i = 0; i<10;i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		do {
		System.out.print("���° �¼��� �����Ͻðڽ��ϱ�?");
		int ans = sc.nextInt();
		if(seat[ans]==1)
			continue;
		System.out.println("����Ǿ����ϴ�.");
		seat[ans]=1;break;}while(true);
		
		System.out.println("---------------------------");
		for(int i = 0;i<10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		for(int i = 0; i<10;i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.println();
		System.out.println("---------------------------");

		sc.close();
	}

}
