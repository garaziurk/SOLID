package ocp;

public class Aplikazioa {

	public static void main(String[] args) {
		Covid19Pacient p = new Covid19Pacient("Garazi",21);
		CardioVascularSymptom cardio = new CardioVascularSymptom(3,4,5);
		NeuroMuscularSymptom neuro = new NeuroMuscularSymptom(2,1,6);
		RespiratorySymptom resp = new RespiratorySymptom(4,5,7);
		p.addSymptom(cardio, 2);
		p.addSymptom(neuro, 1);
		p.addSymptom(resp, 3);
		
		System.out.println(p.calcCovid19Impact());
		System.out.println(p.sanatedDays());
	}

}
