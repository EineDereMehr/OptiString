package functionString;

public class Vowel {
	String vowels = "aAeEiIoOuU";
	String consonants = "bBcCdDfFgGhHjJkKlLmMnNpPqQrRsStUwWxXyYzZ";
	
	public String JustVowels(String enterString) {
		String outString = "";
		
		for(int i = 0; i < enterString.length(); i++) {
			for(int x = 0; x < vowels.length(); x++) {
				if(enterString.charAt(i) == vowels.charAt(x)) {
					outString += vowels.charAt(x);
				}
			}
		}
		return outString;
	}
	
	public String withoutVowels(String enterString) {
		String outString = "";
		
		for(int i = 0; i < enterString.length(); i++) {
			for(int x = 0; x < consonants.length(); x++) {
				if(enterString.charAt(i) == consonants.charAt(x)) {
					outString += enterString.charAt(i);
				}
			}
		}
		
		return outString;
	}
}
