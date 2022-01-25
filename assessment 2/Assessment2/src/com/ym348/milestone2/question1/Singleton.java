package com.ym348.milestone2.question1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*Implementing singleton using different initialization 
 * 
 * 1.	Eager initialization
2.	Static block initialization
3.	Lazy Initialization
4.	Thread Safe Singleton
5.	Serialization issue
6.	Cloning issue
7.	Using Reflection to destroy Singleton Pattern
8.	Enum Singleton


 * 
 * 
 * */


//Eager initialization
class Singleton1{
	private static Singleton1 instance=new Singleton1();
	private Singleton1()
	{
	}
	public static Singleton1 getSingleton()
	{
		return instance;
	}
}

//Lazy initialization
class Singleton2{
	private static Singleton2 instance=null;
	private Singleton2()
	{}
	
	public static Singleton2 getSingleton()
	{
		if(instance==null)
		{
			instance=new Singleton2();
		}
		return instance;
	}
}

//Synchronized block initialization(Not thread safe as if two
//threads t1 and t2 came then both will get lock and one will get a chance to execute and the other
//will be left out, so before creating the new instance we will again check whether instance is
//created or not)
class Singleton3{
	private static Singleton3 instance=null;
	private Singleton3()
	{}
	public static Singleton3 getSingleton()
	{
		if(instance==null)
		{
			synchronized(Singleton3.class)
			{
				instance=new Singleton3();
			}
		}
		return instance;
	}
}

//Synchronized method, thread safe as only one thread will execute at a time
class Singleton4{
	private static Singleton4 instance=null;
	private Singleton4()
	{}
	
	public static synchronized Singleton4 getSingleton()
	{
		if(instance==null)
		{
			instance=new Singleton4();
		}
		return instance;
	}
}

//Thread safe can also be resolved by adding a condition before creating
//an instance which is the problem in singleton3 class over here
class Singleton5{
	private static Singleton5 instance=null;
	private Singleton5()
	{}
	public static Singleton5 getSingleton()
	{//Double lock checking
		if(instance==null)
		{
			synchronized(Singleton5.class)
			{
				if(instance==null)
				{
					instance=new Singleton5();
				}
			}
		}
		return instance;
	}
}


enum Singleton6 {
	INSTANCE;
	// some business logic here..
}

//Serialization and de-serialization
class Singleton implements Serializable,Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile Singleton instance = null;
	
	
	
	private Singleton()
	{
		if (instance != null) {
			
			throw new IllegalStateException();
		}
	}
	public static Singleton getSingleton()
	{
		//double lock checking
		if(instance==null)
		{
			synchronized(Singleton.class)
			{
				if(instance==null)
				{
					instance=new Singleton();
				}
			}
		}
			return instance;	
	}
	//defining read resolve method so that deserialization can be performed so that same hashcode is returned
	private Object readResolve() {
		return instance;
	}
	
	//Clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}
	public static void main(String args[]) throws  IOException, ClassNotFoundException
	{
		Singleton6 singleton=Singleton6.INSTANCE;
		//Serialization
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file_object.txt"));
		
		oos.writeObject(singleton);
		
		//De-serialization
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file_object.txt"));
		Enum<Singleton6> singleton7=(Singleton6)ois.readObject();
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton7.hashCode());
		
		Singleton6 singletonEnum = Singleton6.INSTANCE;
		System.out.println(singletonEnum.hashCode());
		
		Singleton6 singletonEnum2 = Singleton6.INSTANCE;
		System.out.println(singletonEnum2.hashCode());
		
	}
}


