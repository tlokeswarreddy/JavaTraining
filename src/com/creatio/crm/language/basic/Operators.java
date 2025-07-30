package com.creatio.crm.language.basic;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Arthematic Operators(+,-,*,/,%,++,--)
		
		System.out.println("********** Arthematic Operators ********");
		int a=10;
		int b=40;
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(b*a);
		System.out.println(b/a);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(++a);
		System.out.println(--a);
		
		
		System.out.println("********** Assignment Operators ********");
		
		//2. Assignment Operators(=,+=,-=,*=,/=,%=)
		int c=10;
		int d=20;
		System.out.println(c=d);//10
		System.out.println(c+=d);//20
		System.out.println(c-=d);//10
		System.out.println(c*=d);//100
		System.out.println(c/=d);//10
		System.out.println(c%=d);//0
		
		System.out.println("********** Conditional Operators ********");
		//3. Conditional Operators(<,>,<=,>=,==,!=)
		System.out.println(c<d);//true
		System.out.println(c<=d);//true
		System.out.println(c>d);//false
		System.out.println(c>=d);//false
		System.out.println(c==d);//false
		System.out.println(c!=d);//true
		
		System.out.println("********** Logical Operators ********");
		
		//4. Logical Operators)(&&, ||, !)
		
		System.out.println(c<d && c<=d);//true
		System.out.println(c<d || c<=d);//true
		System.out.println(!(c<d || c<=d));//false
		
		System.out.println("********** Ternary Operators ********");
		
		//5. Ternary Operators(?)
		
		System.out.println(!((c<d))? 50 : 100);

	}

}
