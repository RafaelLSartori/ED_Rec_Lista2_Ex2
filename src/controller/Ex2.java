package controller;

public class Ex2 {
	public Ex2() {
		super();
	}
	
	public int divisao(int dividendo, int divisor) {
		if (dividendo < divisor){
			return dividendo;
		} else {
			return divisao(dividendo - divisor, divisor);
		}	
	}
}
