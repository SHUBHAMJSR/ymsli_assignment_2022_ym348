package com.ymsli.day5.question4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BiggestDouble {
	public static void main(String args[])
	{
		ArrayList<Double> arrayValues=new ArrayList<Double>();
		try
		{
			BufferedReader br=
					new BufferedReader(
							new FileReader("C:\\Users\\ve00ym348\\Desktop\\ASSIGNMENTS_YM348\\Day5\\src\\com\\ymsli\\day5\\question4\\data.txt"));
			String line=null;
			while((line=br.readLine())!=null)
			{
				double val=Double.parseDouble(line);
				System.out.println(val);
				arrayValues.add(val);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("The maximum among the values given in data.txt file is: "+Collections.max(arrayValues));
	}
}
