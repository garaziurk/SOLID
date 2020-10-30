package ocp;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{
		
	public Covid19Pacient(String name, int years) {
		super(name, years);
	}

	Map<AbstractSymptom,Integer> symptoms=new HashMap<AbstractSymptom,Integer>();

	public void addSymptom(AbstractSymptom c, int i){
		symptoms.put(c,i);
	}
	
	double calcCovid19Impact() {
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		for (AbstractSymptom c:symptoms.keySet())
			afection=afection+c.getSeverityIndex()*symptoms.get(c);
		afection=afection/(symptoms.size());
		//calculate increment
		if (getYears()>65) increment=afection*0.5;
		//calculate impact
		impact=afection+increment;
		return impact;
	}
	
	public int sanatedDays() {
		int egunKop = 0;
		for (AbstractSymptom s:symptoms.keySet()) {
			if (s.getAffectedDays()>egunKop) {
				egunKop = s.getAffectedDays();
			}
		}
		return egunKop;	
	}
}