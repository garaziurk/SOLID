package srp;

public class Afection2 implements Afectionable{

	public double getAfection (Covid19Pacient p) {
		double afection = 0;
		int elems = 0;
		for (AbstractSymptom s:p.symptoms.keySet())
			if (s.getCovidImpact()>50) {
				afection = afection +s.getSeverityIndex()*p.symptoms.get(s);
				elems++;
			}
		afection = afection /elems;
		return afection;
	}
}
