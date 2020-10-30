package isp;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{
	
	public Covid19Pacient(String name, int years) {
		super(name, years);
	}

	String name;
	Map<Symptom,Integer> symptoms=new HashMap<Symptom,Integer>();
	
	public void addSymptom(Symptom p, Integer w){
		symptoms.put(p,w);
	}

	double calcCovid19Impact(Afectionable ca, Incrementable incr) {
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		afection=ca.calculateSymptomsAfection(this);
		//calculate increment
		increment=incr.calculateIncrementPerYear (this, afection);
		//calculate impact
		impact=afection+increment;
		return impact;
	}
}