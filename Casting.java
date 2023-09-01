package TutorialTrentaNove;


/* JAVA 39 - IL CASTING
 * 
 * Il casting è un processo che modifica il tipo di dato
 * 
 * Implicito :  automatico quando passiamo ad un tipo più ampio( int-> double  , float-> double)
 * Esplicito :  manuale quando passiamo a un tipo piu ristretto
 * 
 * 
 * 
 */




public class Casting {

	public static void main(String[] args) {
		
		double x = 9;
		System.out.println(x);
		
		//CASTING IMPLICITO ------> trasforma 9 in 9.0 ---------> NON PERDIAMO I DATI
		
		double y = 9.5f;
		System.out.println(y);
		
		//CASTING IMPLICITO ------> trasforma 9.5f in 9.5 ---------> NON PERDIAMO I DATI
		
		int z =(int) 9.5;
		System.out.println(z);
		
		//CASTING ESPLICITO ------> trasforma 9.5 in 9,  e si va a perdere lo 0.5 ------> PERDIAMO I DATI 
																				  //------>PERCHE' PASSIAMO DA UN DATO PIù GRANDE A UNO PIU PICCOLO 
		
		

		
		
		
	}

}
