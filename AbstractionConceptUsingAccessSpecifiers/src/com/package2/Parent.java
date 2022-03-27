package com.package2;

import java.util.Scanner;

public class Parent
{
	    private int sal;//scope is only present within the class
		public String name;//scope of the public is anywhere we can 
		                     //use within and one from another also
		protected int accno;//scope is within package and 
		                    //package to package only the extended class can access
							//other than dependent class the independent class cont access
		int age;//default from one another package it not visible
		
		public void input() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter age");
			age=sc.nextInt();
			System.out.println("Enter salary");
			sal=sc.nextInt();
			System.out.println("Enter Accno");
			accno=sc.nextInt();
			System.out.println("Enter name");
			name=sc.next();
			sc.close();
	}
		public void printSal() {
			System.out.println("Salary="+sal);
		}	
		
		
	}


