package dip;

public class CalcIncrement implements Incrementable{

	public double calculateIncrementPerYear(Covid19Pacient p, double afection) {
		double increment = 0;
		if (p.getYears()>65) 
			increment=afection*0.5;
		return increment;
	}
}
