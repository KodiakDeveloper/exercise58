package bookExercises;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex58 {

	public static void main(String[] args) {

		String userAnswer;

		char[] vowel = new char[5];

		char caractere;

		Scanner scan = new Scanner(System.in);

		do {

			for (int i = 0; i < vowel.length; i++) {

				System.out.println("Enter a letter of the alphabet to check if it is a vowel.");

				caractere = scan.next().charAt(0);

				caractere = Character.toLowerCase(caractere);

				if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {

					System.out.println("Entered value: " + caractere);

					System.out.println("The value entered is a vowel");

					vowel[i] = caractere;

				}

				else {

					System.out.println("Entered value: " + caractere);

					System.out.println("The value entered is not a vowel");
				}

			}

			for (int i = 0; i < vowel.length; i++) {

				System.out.print(vowel[i] + "  ");
			}

			scan.close();

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

	}

}
