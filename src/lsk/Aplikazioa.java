package lsk;

public class Aplikazioa {
	
	public static void main(String[] args) {
		Covid19Pacient p = new Covid19Pacient("Garazi",21);
		Symptom s1 = new Symptom("CardioVascular",10,4);
		Symptom s2 = new Symptom("NeuroMuscular",7,2);
		IncurableSymptom s3 = new IncurableSymptom("Respiratory",3,5);
		p.addSymptom(s1, 8);
		p.addSymptom(s2, 5);
		p.addSymptom(s3, 2);
		
		p.showSymptoms();
		p.cure();
	}
}
