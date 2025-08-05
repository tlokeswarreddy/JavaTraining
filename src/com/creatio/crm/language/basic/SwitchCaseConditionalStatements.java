package com.creatio.crm.language.basic;

public class SwitchCaseConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Sunday";

		switch (day) {

		case "Monday":

			System.out.println("weekday");
			break;
		case "Tuesday":

			System.out.println("weekday");
			break;
		case "wednesday":

			System.out.println("weekday");
			break;
		case "Thursday":

			System.out.println("weekday");
			break;
		case "friday":

			System.out.println("TGIF");
			break;
		case "Saturday":

			System.out.println("weekend");
			break;
		case "Sunday":

			System.out.println("weekend");
			break;

		default:
			System.out.println("Invalid");

		}

	}

}
