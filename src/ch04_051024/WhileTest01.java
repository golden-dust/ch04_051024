package ch04_051024;

public class WhileTest01 {

	public static void main(String[] args) {
		
		int j = 1;
		while(true) {
			j++;
			System.out.println(j);
			if (j == 10000) {
				break;
			}
		}
		
		int m = 0;
		do { // 1번은 문조건 실행되고 그 다음은 조건에 따라 반복여부를 결정
			System.out.println(m+1 + " Hi");
			m++;
		} while (m < 10);
		
		
		for(int k=1;k<=10;k++) {
			if(k % 3 == 0) {
				continue;
			}
			System.out.println(k);
		}
		
	}

}
