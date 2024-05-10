package ch04_051024;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				count++;
				System.out.println(count + " : 안녕!");
			}
		}
		
		// 이중 for 문으로 구구단 출력하기
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println("----------------------------");
		}
		
		
		// 이중 for 문으로 별찍기
		for(int i=1;i<=5;i++) {
			String star = "*";
			String stars = "";
			
			for (int j=0;j<i;j++) {
				stars += star;
			}
			
			System.out.println(stars);
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
