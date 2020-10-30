package isp;

public class Pertsona implements Yearable{
	String name, adina;
	
	public Pertsona(String name, String adina) {
		super();
		this.name = name;
		this.adina = adina;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdina() {
		return adina;
	}

	public void setAdina(String adina) {
		this.adina = adina;
	}

	public int getYears() {
		return Integer.parseInt(adina);
	}
} 