package nado_chap01;

public class _05_For {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i+=2)
			System.out.println("어서오세요. 반갑습니다. " + i);
		
		for(int i = 9; i > 0; i-=2) {
			System.out.println("안녕하세요. 반갑습니다. " + i);
		}
		
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			sum += i;
			System.out.println("현재까지 총합은 " + sum + "입니다. ");
		}
		System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다. ");
		
			
	}

}
