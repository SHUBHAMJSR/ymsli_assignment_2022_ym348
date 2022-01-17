package com.ymsli.day4.question7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

import com.ymsli.day4.question6.InputException;

public class ThrowException extends InputException{
	
	private InputStream inputStream;

	public ThrowException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public void ThrowException() throws IOException,InputException
	{
		Scanner in=new Scanner(System.in);
		File file=new File("test1.txt");
		FileInputStream fileinputsream=null;
		try
		{
			System.out.println("enter the number");
			int n=in.nextInt();
			if(n>100)
			{
				throw new InputException("input exception occured");
			}
			fileinputsream=new FileInputStream(file);
			
			fileinputsream.read();
		}
		catch(InputException e) {
			System.out.println(e.getMessage());
			}
		catch(IOException e)
		{
			System.out.println("IO Exception occurred");
		}
	}
}
