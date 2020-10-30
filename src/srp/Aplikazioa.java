package srp;

public class Aplikazioa {

	public static void main(String[] args) {
		Covid19Pacient p = new Covid19Pacient("Garazi",46);
		CardioVascularSymptom cardio = new CardioVascularSymptom(51,4,5);
		NeuroMuscularSymptom neuro = new NeuroMuscularSymptom(2,1,6);
		RespiratorySymptom resp = new RespiratorySymptom(4,5,7);
		p.addSymptom(cardio, 2);
		p.addSymptom(neuro, 1);
		p.addSymptom(resp, 3);
		
		Afectionable af = new Afection();
		Incrementable in = new Increment();
		Impactable im = new Impact();
		System.out.println(p.calcCovid19Impact(af, in, im));
		System.out.println(p.sanatedDays());
		
		Afectionable af2 = new Afection2();
		Incrementable in2 = new Increment2();
		System.out.println(p.calcCovid19Impact(af2, in2, im));
		
	}

}
