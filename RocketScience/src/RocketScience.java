

public class RocketScience {

	public static void main(String[] args) {
		// word for making rocket
		String word =  "IndiGo";
		
		//creating rocket with the words
	        System.out.println("   |");
	        System.out.println("  /_\\");
		rocket(word);
		System.out.println("  |_|");
		System.out.println("/_ _ _\\");
		System.out.println("  VvV");
		//finishing up the engines.				
	}
	
	private static void rocket(String word) {
		int wordLength = word.length();
	
		//creating loop for rocket middle portion
		for(int i=0; i<wordLength; i++ ) {
			System.out.println("  |"+word.charAt(i)+"|");
		}
	}
}