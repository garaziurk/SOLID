package srp;

public class Increment implements Incrementable{

	public double getIncrement(Covid19Pacient p, double afection) {
		double increment = 0;
		if (p.getYears()>65) 
			increment=afection*0.5;
		return increment;
	}
}
