package Exercicios_Logicos;

public class Percentual {
	//total de eleitores: 1000
	//votos validos: 800
	//votos brancos: 150
	//votos nulos: 50
	
	public static int pctVotsValidos() {
		int pct = 0;
		pct = ((800 * 100) / 1000);		
		return pct;
	}
	
	public static int pctVotosBrancos() {
		int pct = 0;
		pct = ((150 * 100) / 1000);		
		return pct;
	}
	
	public static int pctVotosNulos() {
		int pct = 0;
		pct = ((50 * 100) / 1000);		
		return pct;
	}
	
	public static void main(String[] args) {
		System.out.println("Percentual de votos validos: "+pctVotsValidos());	
		System.out.println("Percentual de votos brancos: "+pctVotosBrancos());	
		System.out.println("Percentual de votos nulos: "+pctVotosNulos());	
	}	
	
}
