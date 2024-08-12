package view;
import controller.Ex2;

public class Main {

	public static void main(String[] args) {
		Ex2 m = new Ex2();		
		int dividendo = 5;
		int divisor = 3;
		int resp2 = m.divisao(dividendo, divisor);
		System.out.println(resp2);
	}

}
