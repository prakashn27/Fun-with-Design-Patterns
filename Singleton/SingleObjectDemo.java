/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class SingleObject {
	public 	static SingleObject instance = new SingleObject();
	
	// making it private so that it can not be instanciated
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		System.out.println("instance is fetched");
		return instance;
	}
	
	public void print() {
		System.out.println("object is printed");
	}
}
class SingleObjectDemo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		SingleObject a = SingleObject.getInstance();
		SingleObject b = SingleObject.getInstance();
		a.print();
		b.print();
		
	}
}