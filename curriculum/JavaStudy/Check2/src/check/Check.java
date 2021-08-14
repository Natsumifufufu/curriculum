package check;

import constants.Constants;
public class Check {
	private static String firstName = "なつみ";
	private static String lastName = "福井";

	public static void main(String[] args) {
		printName(firstName, lastName);

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
	}

	private static void printName(String FirstName, String LastName) {
		System.out.println("printNameメソッド → " + FirstName + LastName);

	}
}