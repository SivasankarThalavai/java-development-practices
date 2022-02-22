package com.sivasankar.designpatterns.creational.singleton;

/*  
 * well-proved solution for solving the specific problem/task.
 * 
 * By using the design patterns you can make your code more flexible,reusable and maintainable.
 * It is the most important part because java internally follows design patterns.
 * 
 * 
*/

/*
 * define a class that has only one instance and provides a global point of access to it
 * 
 * In other words, a class must ensure that only single instance should be created and 
 * single object can be used by all other classes.
 * 
 * There are two forms of singleton design pattern

	Early Instantiation: creation of instance at load time.
	Lazy Instantiation: creation of instance when required.
	
	Saves memory because object is not created at each request. Only single instance is reused again and again.
	
	Singleton pattern is mostly used in multi-threaded and database applications. 
	
	It is used in logging, caching, thread pools, configuration settings etc.
	
	Static member: It gets memory only once because of static, itcontains the instance of the Singleton class.
	Private constructor: It will prevent to instantiate the Singleton class from outside the class.
	Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller.

*/

public class EarlySingletonDemo {

	private static EarlySingletonDemo obj = new EarlySingletonDemo(); // Early, instance will be created at load time

	private EarlySingletonDemo() {

	}

	public static String getInstance() {
		return "Hashcode of firstInstance is " + obj.hashCode();
	}

	public static void main(String[] args) {
		System.out.println(obj.hashCode());
	}

}
