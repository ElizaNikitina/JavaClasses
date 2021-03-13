package com.class11;

public class TwoDArrayTask {

	public static void main(String[] args) {

		String[][] names = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Obama", "Jordan", "Jackson" } };

		System.out.println(names[0][0] + " " + names[1][0]);
		System.out.println(names[0][1] + " " + names[1][2]);
		System.out.println(names[0][2] + " " + names[1][3]);
		System.out.println(names[0][3] + " " + names[1][1]);

		String[][] nameAndGrades = new String[2][4];
		// 1st row name
		nameAndGrades[0][0] = "Ivan";
		nameAndGrades[0][1] = "Oleg";
		nameAndGrades[0][2] = "Ilya";
		nameAndGrades[0][3] = "Artem";

		// 2nd row grade
		nameAndGrades[1][0] = "A";
		nameAndGrades[1][1] = "B";
		nameAndGrades[1][2] = "C";
		nameAndGrades[1][3] = "A";

//		for(String [] name:nameAndGrades) {
//			for(String grade: name) {
//				if(grade.equals("A") || grade.equals("B")) {
//					System.out.print(grade + " " + name);
//				}
//			}
//		}

		for (int a = 0; a < nameAndGrades.length; a++) {
			for (int b = 0; b < nameAndGrades[a].length; b++) {

				System.out.print(nameAndGrades[a][b] + " ");

			}
			System.out.println();

		}

	}

}
