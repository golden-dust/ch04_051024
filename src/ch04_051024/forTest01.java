package ch04_051024;

public class forTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		for(int j=1;j<=100;j=j+2) {
			System.out.println(j);
		}
		
		for(int k=100;k>=0;k--) {
			System.out.println(k);
		}
		
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println("sum의 값: " + sum);
		
		
		sum = 0;
		for(int i=1;i<=100;i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수 sum의 값: " + sum);
		
		sum = 0;
		for(int i=3;i<=100;i+=3) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수 sum의 값: " + sum);
	}

}
