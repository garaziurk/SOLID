package lsk;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {
	String name;
	Map<AbstractSymptom,Integer> symptoms=new HashMap<AbstractSymptom,Integer>();
	
	public Covid19Pacient(String name, int years) {
		super(name, years);
	}
	
	public void addSymptom(AbstractSymptom p, Integer w){
		symptoms.put(p,w);
	}
	public void showSymptoms(){
		for (AbstractSymptom s: symptoms.keySet())
			s.show();
	}
	public void cure(){
		for (AbstractSymptom s: symptoms.keySet())
			if(s instanceof ICure) {
				((ICure) s).cure();
			}
	}
}
