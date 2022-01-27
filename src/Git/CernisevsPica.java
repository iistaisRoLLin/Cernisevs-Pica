
package Git;

import java.util.Scanner;




public class CernisevsPica {
	static Scanner dati=new Scanner(System.in);
public static void piedevas() {
	int cik;
	String izvele;
	System.out.println("Cik daudz velaties pievienot picai?");
	cik = dati.nextInt();
	String[] iegutais = new String[cik];
	for(int i=0; i<iegutais.length; i++) {
		System.out.println("Ko vçlies pievienot?");
		iegutais[i] = dati.next();
		System.out.print(iegutais[i]+" ");
		
		
	}
       System.out.println();
	
	
	
	
}
	
	public static void main(String[] args) {
		
		
		int skaits, lielums, piegade;
		int toping;
		double cena = 0;
		String izvele;
			
		System.out.println("Vai bus nepiecieðams piegâdât(1-jâ, 2-nç)");
		piegade = dati.nextInt();
		if(piegade==1) {
			cena = cena + 1.00;
		}else {
			cena = cena;
		}
		System.out.println("Kâda izmçra picu vçlaties? 30, 40 vai 50 cm?");
		lielums = dati.nextInt();
		if(lielums==30) {
			cena = cena + 3.50;
			
		}else if(lielums == 30) {
			cena = cena + 5.00;
		}else if(lielums == 50) {
			cena = cena + 7.50;
		}else {
			System.out.println("Picas ar tâdu lielumu nepastâv.");
	
		}
		
		
		do {
			System.out.println("Izvelies ko vçlies darît | 1 - Pievienot picai kaut ko klât | 2. Izvçlçties kâda mçrce bûs picai |"
					+ " 3.  ");
			izvele = dati.next();
			izvele = izvele.toLowerCase();
			switch(izvele) {
			case "1":
				piedevas();
			break;
			
			
			case "2":
				break;
				
				
			}
		}while(izvele.equals("beigt"));
		
		
		
	
	}
}


