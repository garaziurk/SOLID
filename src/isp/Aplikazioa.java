package isp;

public class Aplikazioa {

	public static void main(String[] args) {
		Pertsona p = new Pertsona("Garazi","66");
		CalcIncrement ca = new CalcIncrement();
		System.out.println(ca.calculateIncrementPerYear(p, 40));	
	}
	
}
