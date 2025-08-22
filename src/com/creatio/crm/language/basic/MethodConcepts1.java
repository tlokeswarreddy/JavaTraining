package com.creatio.crm.language.basic;

public class MethodConcepts1 {
	int empId;
	
	//these are constructor methods

	MethodConcepts1(int id) {

		empId = id;

	}
	
	MethodConcepts1() {

		

	}

	public static void main(String[] args) {
//		1. Launch the Chrome browser
//		2. Enter the Login page URL
//		3. Enter the Username with 1234
//		4. Enter the password with 1234
//		5. Click on login
//		6. Page is successfully logged in
//		7. Logout the page
//		8. Close the Browser

//		1. Launch the Firefox browser
//		2. Enter the Login page URL
//		3. Enter the Username with 1234
//		4. Enter the password with 1234
//		5. Click on login
//		6. Page is successfully logged in
//		7. Logout the page
//		8. Close the Browser

//		1. Launch the Edge browser
//		2. Enter the Login page URL
//		3. Enter the Username with 1234
//		4. Enter the password with 1234
//		5. Click on login
//		6. Page is successfully logged in
//		7. Logout the page
//		8. Close the Browser
		MethodConcepts1 obj = new MethodConcepts1(1234);

		obj.LaunchBrowserAndEnterURL("Chrome", "www.google.com");
		obj.LoginUrl();
		obj.LogoutAndCloseBrowser();
	}

	void LaunchBrowserAndEnterURL(String browser, String url) {
		System.out.println("1. Launch the" + browser + " browser");
		System.out.println("2. Enter the Login page URL - " + url);
	}

	void LoginUrl() {

		System.out.println("3. Enter the Username with 1234");
		System.out.println("4. Enter the password with 1234");
		System.out.println("5. Click on login");
		System.out.println("6. Page is successfully logged in");

	}

	void LogoutAndCloseBrowser() {

		System.out.println("7. Logout the page");
		System.out.println("8. Close the Browser");

	}

	int employeId() {

		return 3000;
	}

	// used for Constructor methods with paramterized

	void EmpDetails1(String empName) {
		System.out.println(empId);
		System.out.println(empName);

	}

	void EmpDetails2(String empName) {
		System.out.println(empId);
		System.out.println(empName);

	}

	void EmpDetails3(String empName) {
		System.out.println(empId);
		System.out.println(empName);

	}
	
	void EmpDetails4() {
		System.out.println(empId);
		

	}

}
