package srp;

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
	
	double calcCovid19Impact(Afectionable af, Incrementable in, Impactable im) {
		//calculate afection
		double afection = af.getAfection(this);
		//calculate increment
		double increment = in.getIncrement(this, afection);
		//calculate impact
		double impact = im.getImpact(this, afection, increment);
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