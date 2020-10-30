package srp;

public abstract class AbstractSymptom {
	int covidImpact;
	int severityIndex;
	int affectedDays;
	
	public AbstractSymptom(int covidImpact, int severityIndex, int affectedDays) {
		super();
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
		this.affectedDays = affectedDays;
	}
	public int getAffectedDays() {
		return affectedDays;
	}
	public void setAffectedDays(int affectedDays) {
		this.affectedDays = affectedDays;
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
