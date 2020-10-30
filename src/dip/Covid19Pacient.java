package dip;

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