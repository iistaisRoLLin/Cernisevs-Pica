
package Git;

import java.util.Scanner;




public class CernisevsPica {
	static Scanner dati=new Scanner(System.in);
	static double cena = 0;
	static String[] iegutais2;
	static String kopizvel;
public static void piedevas() {
	int cik;
	String izvele;
	System.out.println("Cik daudz velaties pievienot picai?");
	cik = dati.nextInt();
	String[] iegutais = new String[cik];
	for(int i=0; i<iegutais.length; i++) {
		System.out.println("Ko v�lies pievienot?");
		iegutais[i] = dati.next();
		System.out.print(iegutais[i]+1+" ");
		iegutais2 = iegutais;
		
		
		
	}
       System.out.println();
       cena = cena + 1.20*cik;
	
	
}
public static void merce() {
	String izvele;
	System.out.println("Izvelies k�du m�rci v�l�tos lai ir picai (Tom�tu, majon�ze, b�rbekju)");
	izvele = dati.next();
	if(izvele=="Tom�tu") {
		System.out.println("Tu izv�l�jies"+izvele+" m�rci");
		
	}else if(izvele == "barbekj�") {
		System.out.println("Tu izv�l�jies"+izvele+" m�rci");
	}else {
		System.out.println("T�das m�rces nav");
	}
	cena = cena + 0.50;
	izvele = kopizvel;
}
	
	public static void main(String[] args) {
		
		
		int skaits, lielums, piegade;
		int toping;
		
		String izvele;
			
		System.out.println("Vai bus nepiecie�ams pieg�d�t(1-j�, 2-n�)");
		piegade = dati.nextInt();
		if(piegade==1) {
			cena = cena + 1.00;
		}else {
			cena = cena;
		}
		System.out.println("K�da izm�ra picu v�laties? 30, 40 vai 50 cm?");
		lielums = dati.nextInt();
		if(lielums==30) {
			cena = cena + 3.50+ 0.30;
			
		}else if(lielums == 40) {
			cena = cena + 5.00 + 0.40;
		}else if(lielums == 50) {
			cena = cena + 7.50+0.50;
		}else {
			System.out.println("Picas ar t�du lielumu nepast�v.");
	
		}
		int alergija;
		int veids;
		System.out.println("Vai tev ir k�das alergijas (1 - J� | 2 - N�");
		alergija = dati.nextInt();
		if(alergija == 1) {
			System.out.println("Pret ko jums ir alergija? (1. Pret pienu produktiem, laktoze | 2. Pret lipek�iem jeb rudziem, kvie�iem utt");
			veids = dati.nextInt();
			if(veids == 1) {
				System.out.println("Pica netiks izmantoti tie�i pienu produkti");
			}else if(veids == 2) {
				System.out.println("Pica netiks veidota no rudzu kvie�u u.c kuri satur lipekli,  miltiem");
			}else {
				System.out.println("Alergiju nav");
			}
		}
		
		
		do {
			System.out.println("Izvelies ko v�lies dar�t | 1 - Pievienot picai kaut ko kl�t | 2. Izv�l�ties k�da m�rce b�s picai |"
					+ " beigt = apstadinat programmu  ");
			izvele = dati.next();
			izvele = izvele.toLowerCase();
			switch(izvele) {
			case "1":
				piedevas();
			break;
			
			
			case "2":
				merce();
				break;
				
				
			}
		}while(izvele.equals("beigt"));
		
		System.out.println("Persona izvelejas "+lielums+"   lielu pica ar "+kopizvel+" m�rci, uz kuras ir "+iegutais2+". �is viss izmaks�s "+cena+" Eiro");
	
	}
}


