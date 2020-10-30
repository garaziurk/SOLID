package dip;

public class Aplikazioa {

	public static void main(String[] args) {
		Covid19Pacient p = new Covid19Pacient("Garazi",66);
		CardioVascularSymptom s1 = new CardioVascularSymptom(51,6);
		NeuroMuscularSymptom s2 = new NeuroMuscularSymptom(2,10);
		RespiratorySymptom s3 = new RespiratorySymptom(8,4);
		p.addSymptom(s1, 3);
		p.addSymptom(s2, 5);
		p.addSymptom(s3, 2);
		
		CalcAfection a = new CalcAfection();
		CalcIncrement i = new CalcIncrement();
		System.out.println(p.calcCovid19Impact(a, i));
	}

}
