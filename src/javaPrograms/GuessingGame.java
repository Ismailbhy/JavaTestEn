package javaPrograms;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Keybordinput = new Scanner(System.in);
		String secretWord = "giraffe";
		String guess = "";
		int guessCount = 0;
		int guessLimit = 3;
		boolean outofGuesses=false;
		
		while(!guess.equals(secretWord)&& !outofGuesses) {
			if(guessCount < guessLimit) {
			
			System.out.println("Enter a guess: ");
			guess = Keybordinput.nextLine();
			guessCount++;
			
			}else {
				outofGuesses=true;
			}
				
			}
		if(outofGuesses) {
		System.out.println("You lose! No more guesses!");
		}else {
			System.out.println("You Win!");
		}
		
	}
  }  
