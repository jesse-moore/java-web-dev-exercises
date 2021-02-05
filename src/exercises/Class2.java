package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Class2 {

	public static void main(String[] args) {
		ArrayList<Integer> numArr = new ArrayList<>();
		numArr.add(1);
		numArr.add(2);
		numArr.add(3);
		numArr.add(4);
		numArr.add(5);
		numArr.add(6);
		numArr.add(7);
		numArr.add(8);
		numArr.add(9);
		numArr.add(10);
		// arrayListPractice(numArr);
		String line = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
		String[] lineArray;
		String strRegex = "[\\s,.]";
		lineArray = line.split(strRegex);
		ArrayList<String> stringList = new ArrayList<>(Arrays.asList(lineArray));
		 printFive(stringList);
//		hashMapPractice();
	}

	public static void hashMapPractice() {
		HashMap<String, Integer> students = new HashMap<>();
		Scanner input = new Scanner(System.in);
		String newStudent;

		System.out.println("Enter your students (or ENTER to finish):");

		// Get student names and grades
		do {

			System.out.print("Student: ");
			newStudent = input.nextLine();

			if (!newStudent.equals("")) {
				System.out.print("ID Number: ");
				Integer newGrade = input.nextInt();
				students.put(newStudent, newGrade);
				input.nextLine();
			}

		} while (!newStudent.equals(""));
		input.close();

		// Print class roster
		System.out.println("\nClass roster:");

		for (Map.Entry<String, Integer> student : students.entrySet()) {
			System.out.println(student.getKey() + ": " + student.getValue());
		}
	}

	public static void printFive(ArrayList<String> stringArr) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of word to find:");
		Integer stringLength;
		stringLength = input.nextInt();
		input.close();
		for (String string : stringArr) {
			if (string.length() == stringLength) {
				System.out.println(string);
			}
		}
	}

	public static void arrayListPractice(ArrayList<Integer> numArr) {
		for (int i : numArr) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void arrayPractice() {
		int[] intArray = { 1, 1, 2, 3, 5, 8 };

		for (int i : intArray) {
			System.out.println(i);
		}

		for (int i : intArray) {
			if (i % 2 > 0) {
				System.out.println(i);
			}
		}

		String line = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
		String[] lineArray = line.split(" ");
		System.out.println(Arrays.toString(lineArray));

		String[] lineArray2 = line.split("\\.");
		System.out.println(Arrays.toString(lineArray2));
	}
}
