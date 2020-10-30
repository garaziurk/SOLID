package srp;

public class Afection implements Afectionable{
	
	public double getAfection (Covid19Pacient p){
		double afection=0;
		for (AbstractSymptom c:p.symptoms.keySet())
			afection=afection+c.getSeverityIndex()*p.symptoms.get(c);
		afection=afection/(p.symptoms.size());
		return afection;
	}
}
