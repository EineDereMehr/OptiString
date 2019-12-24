/**
 * this class make the strings get reverse
 */
package functionString;

/**
 * @author mian
 *
 */
public class ReverseString {
	
	
	public String Reverse(String enterString) {
		String outString = "";
		
		for(int i = enterString.length() - 1; i >= 0; i--) {
			outString += enterString.charAt(i);
		}
		
		return outString;
	}

}
