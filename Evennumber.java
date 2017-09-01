package Array;
//Package is a grouping of related types providing access protection and name 
//space management

import java.util.Scanner;
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions

public class Evennumber {
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
//Type casting is a class name
		
	public static void main(String[] args) {
//Java Program processing starts from the main() method which is a mandatory part of every program 		
//static used to prepare a field,method or inner classes as a class field.
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
//String is predefined class name 
//args is name of the array
		// TODO Auto-generated method stub
			
		// TODO Auto-generated method stub
		int a[]=new int[10];
//declaring an array of int type and set its size
		System.out.println("Even numbers:");
		//System is a final class in java.lang package
		//out is a static member field of system class and it's type PrintStream
		//println is a method of PrintStream class and it means print in next line
		//Inside the brackets is value which to be printed		

		for(int i=1;i<a.length;i++)
//the values start from i=1 and it will go until i is grater than the length of an array and the i value will be incremented 
		{
			if(i%2==0)
//When we divide the value with 2 and the answer will be equal to 0 then the logical will be for even number
			{
				System.out.println(i);
				//here it will print i values
			}
		}
	}

}
