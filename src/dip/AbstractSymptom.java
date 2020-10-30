package dip;

public abstract class AbstractSymptom {
	int covidImpact; 
	int severityIndex;
	
	public AbstractSymptom(int covidImpact, int severityIndex) {
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}
	
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
}
