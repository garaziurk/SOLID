package srp;

public class Increment2 implements Incrementable{
	
	public double getIncrement(Covid19Pacient p, double afection) {
		double increment = 0;
		if (p.getYears()>65) 
			increment=afection*0.5;
		else if (p.getYears()>45 && p.getYears()<=65) {
			increment = afection*0.3;
		}
		return increment;
	}
}
