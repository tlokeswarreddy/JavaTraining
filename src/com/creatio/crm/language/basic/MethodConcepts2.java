package com.creatio.crm.language.basic;

public class MethodConcepts2 {

	public static void main(String[] args) {
		MethodConcepts1 obj = new MethodConcepts1(1234);

		// MethodswithArguments

		obj.LaunchBrowserAndEnterURL("Chrome", "www.google.com");

		// MethodswithoutArguments
		obj.LoginUrl();

		// MethodswithoutReturntype

		obj.LogoutAndCloseBrowser();

		// MethodswithReturntype

		System.out.println(obj.employeId());
		
		//Constructorwithparamaterized
		
		obj.EmpDetails1("Loki");
		obj.EmpDetails2("roja");
		obj.EmpDetails3("papa");
		obj.EmpDetails4();
		
		

	}

}
