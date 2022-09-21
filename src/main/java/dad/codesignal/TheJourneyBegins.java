package dad.codesignal;

public class TheJourneyBegins {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int centuryFromYear(int year) {
		int century;
		if (year % 100 == 0) {
			century = year/100;
		}
		else {
			century = (year/100)+1;
		}
		return century;
		
	}

}
