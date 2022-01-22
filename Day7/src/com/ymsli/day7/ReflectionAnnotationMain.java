package com.ymsli.day7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionAnnotationMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class detailsAuthorVersion=new AnnotatedClass().getClass();
		
		Annotation[] annotation = detailsAuthorVersion.getAnnotations();

		Method[] methods=detailsAuthorVersion.getDeclaredMethods();
		
		//Storing constructors of class
		Constructor[] constructor=detailsAuthorVersion.getDeclaredConstructors();
		System.out.println("-------Constructor Annotations--------");
		for(Constructor c:constructor)
		{	
			System.out.println("Constructor name:"+c.getName());
			//taking each constructor annotations and printing it
			Annotation[] c1=(Annotation[]) (c.getDeclaredAnnotations());
			for(Annotation c2:c1)
			{
				System.out.println(c2.toString());
			}
		}
		
		System.out.println("--------Class Annotations---------");
		for(Annotation a:annotation)
		{
			System.out.println(a.toString());
		}
		
		System.out.println("---------Methods Annotations-----------");
		for(Method m:methods)
		{
			System.out.println("Method name:"+m.getName());
			Annotation[] a1=(Annotation[]) (m.getDeclaredAnnotations());
			for(Annotation a2:a1)
			{
				System.out.println(a2.toString());
			}
		}
		
	}

}
