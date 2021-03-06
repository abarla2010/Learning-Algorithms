package util;

import java.util.Random;
import java.util.Scanner;

import static sorting.InsertionSort.doInsertionSort;

/**
 * Created by abhishekbarla on 10/14/16.
 * A common utility class for the project
 */
public class CommonUtility {

	/**
	 * Generates a Random Number
	 * @return
	 */
	public static int generateRandomNumber(){

		int randomNumber;
		Random random = new Random();

		randomNumber = random.nextInt(Constants.highestRandomNumber);

		return randomNumber;
	}


	/**
	 * Swaps two elements in an array
	 * @param number1
	 * @param number2
	 * @param array
	 * @return
	 */
	public static int[] swap(int number1, int number2, int[] array){

		int temp = array[number1];
		array[number1] = array[number2];
		array[number2] = temp;

		return array;
	}

	/**
	 * Generates a random sorted array
	 * @return
	 */
	public static int[] randomSortedArrayGenerator(){

		int[] unsortedArray = randomArrayGenerator();

		//TODO: Change this to a merge sort or any other efficient sort

		//Insertion Sort
		int[] sortedArray = doInsertionSort(unsortedArray);

		return sortedArray;
	}

	/**
	 * Generates a random unsorted array
	 * @return
	 */
	public static int[] randomArrayGenerator(){
		int[] array = new int[Constants.maxRandomArraySize];
		Random randomNumberGenerator = new Random();

		for(int i=0; i<Constants.maxRandomArraySize; i++)
		{
			array[i] = generateRandomNumber();
		}

		return array;
	}

	/**
	 * Gets user input as String from command line
	 * @param inputMessage
	 * @return
	 */
	public static String getStringFromCommandLine(String inputMessage){

		String userInputString = "";

		Scanner sc = new Scanner(System.in);
		System.out.println(inputMessage);
		userInputString = sc.nextLine();

		return userInputString;

	}

}


