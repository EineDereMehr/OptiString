package menu;
import functionString.*;
import javax.swing.*;


public class Menu {

	public void MenuOpti() {
                //instanciate the Reverse String Object
		ReverseString reverse = new ReverseString();
                //Instanciate the vowel object
		Vowel vowel = new Vowel();
                //variable i for the menu loop
		boolean i = true;
		String inputUser;
                
                //Menu While starts here
		while (i) {
			inputUser = JOptionPane.showInputDialog(null, "1.Reverse \n\n 2.WithoutVowels \n\n 3.JustVowels \n\n x.Exit");
			switch(inputUser) {
			case "1":
				ShowUp(reverse.Reverse(UserString()));
				break;
			case "2":
				ShowUp(vowel.withoutVowels(UserString()));
				break;
			case "3":
				ShowUp(vowel.JustVowels(UserString()));
				break;
			case "x":
				i = false;
				break;
			default:
				i = false;
				break;
			}
		}
	}
	
        //Method for user input
	public String UserString() {
		String userStr = JOptionPane.showInputDialog(null, "Digit your message:");
		return userStr;
	}
	
        //Method for program output
	public void ShowUp(String userStr) {
		JOptionPane.showMessageDialog(null, userStr);
	}
}
