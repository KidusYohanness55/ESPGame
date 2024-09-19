package mypack;

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class ESPGame {
	public static void main(String [] args) throws IOException 
	{
		String fileName, color = "", inputColor, name,
				description, dueDate;
		int choice, correctGuesses = 0;
		boolean inputColorValidation;
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		// Intro
		System.out.println("CMSC203 Project 1: Test your ESP skills!");
		System.out.print("Enter the filename: ");
		fileName = keyboard.nextLine();
		File myFile = new File(fileName);
		Scanner inputFile = new Scanner(myFile);
		System.out.println("There are sixteen colors from a file: ");
		while (inputFile.hasNext()) {
			String line = inputFile.nextLine();
			System.out.println(line);
		}
		// game
		for (int count = 0; count<3; count++) {
			do {
			choice = generator.nextInt(16) + 1;
			switch (choice) {
			case 1:
				color = "Black";
				break;
			case 2:
				color = "White";
				break;
			case 3:
				color = "Gray";
				break;
			case 4:
				color = "Silver";
				break;
			case 5:
				color = "Maroon";
				break;
			case 6:
				color = "Red";
				break;
			case 7:
				color = "Purple";
				break;
			case 8:
				color = "Fuchsia";
				break;
			case 9:
				color = "Green";
				break;
			case 10:
				color = "Lime";
				break;
			case 11:
				color = "Olive";
				break;
			case 12:
				color = "Yellow";
				break;
			case 13:
				color = "Navy";
				break;
			case 14:
				color = "Blue";
				break;
			case 15:
				color = "Teal";
				break;
			case 16:
				color = "Aqua";
				break;
			default:
				break;
			}
			System.out.printf("\nRound %d\n\nI am thinking of a color.\n"
					+ "Is it one of the listed colors above?\nEnter your guess:\n", count + 1);
			inputColor = keyboard.nextLine().trim();
			if (inputColor.equalsIgnoreCase("Black") || inputColor.equalsIgnoreCase("White")
					|| inputColor.equalsIgnoreCase("Gray") || inputColor.equalsIgnoreCase("Silver")
					|| inputColor.equalsIgnoreCase("Maroon") || inputColor.equalsIgnoreCase("Red")
					|| inputColor.equalsIgnoreCase("Purple") || inputColor.equalsIgnoreCase("Fuchisa")
					|| inputColor.equalsIgnoreCase("Green") || inputColor.equalsIgnoreCase("Lime")
					|| inputColor.equalsIgnoreCase("Olive") || inputColor.equalsIgnoreCase("Yellow")
					|| inputColor.equalsIgnoreCase("Navy") || inputColor.equalsIgnoreCase("Blue")
					|| inputColor.equalsIgnoreCase("Teal") || inputColor.equalsIgnoreCase("Aqua")) {
				inputColorValidation = true;
				System.out.printf("\nI was thinking of %s.\n", color);
				if (inputColor.equalsIgnoreCase(color)) {
					correctGuesses ++;
				}
			}
			else {
				inputColorValidation = false;
				System.out.printf("Your inputted color was not found on the list. Please try again.\n");
			}
			}
			while (!inputColorValidation);
		}
		System.out.printf("Game Over\n\n");
		System.out.printf("You guessed %d out of 3 colors correctly.\n", correctGuesses);
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Describe yourself: ");
		description = keyboard.nextLine();
		System.out.print("Due Date: ");
		dueDate = keyboard.nextLine();
		System.out.printf("User Name: %s\nUser Description: %s\nDate: %s", name, description, dueDate);
	}
}
