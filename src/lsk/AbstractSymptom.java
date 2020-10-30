package lsk;


public abstract class AbstractSymptom {
	public String name;
	int covidImpact; int severityIndex;
	
	public AbstractSymptom(String name, int covidImpact, int severityIndex) {
		this.name = name;
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}
	public void show(){
		System.out.println("symptom value :"+name+" severityIndex :"
	+severityIndex+" covidImpact:"+covidImpact);
	}
}

