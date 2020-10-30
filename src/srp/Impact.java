package srp;

public class Impact implements Impactable {

	public double getImpact(Covid19Pacient p, double afection, double increment) {
		if (p.getYears()<10) {
			return 0;
		}
		return afection+increment;
	}

}
