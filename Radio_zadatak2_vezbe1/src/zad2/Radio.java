package zad2;

public class Radio {

	
	boolean ukljucen = false;
	int jacinaTona = 0;
	int program = 1;
	
	
	
	void ukljuci() {
		ukljucen = true;
	}
	
	
	
	void iskljuci() {
		ukljucen = false;
	}
	
	
	
	void pojacajTon() {
		jacinaTona++;
	}
	
	
	void smanjiTon() {
		jacinaTona--;
	}
	
	
	void iskljuciTon() {
		jacinaTona=0;
	}
	
	boolean daLiJeUkljucen() {
		return ukljucen;
	}
	
	
	int vratiJacinuTona() {
		return jacinaTona;
	}
	
	void promeniProgram(int p) {
		program = p;
		
	}
	
	void ispisi() {
		System.out.println("Radio je ukljucen: " + ukljucen +"\nJacina tona je: " + jacinaTona + "\n Program je broj: " + program);
	}
	
	
	
	
	
	
	
	
	
	
}
