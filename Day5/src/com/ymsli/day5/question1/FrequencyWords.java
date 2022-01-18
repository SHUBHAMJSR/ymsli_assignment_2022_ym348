package com.ymsli.day5.question1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FrequencyWords {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Map<String, Integer> map=new HashMap<String, Integer>();		
		
		try
		{
			BufferedReader br=
		new BufferedReader(new FileReader("C:\\Users\\ve00ym348\\Desktop\\ASSIGNMENTS_YM348\\Day5\\src\\com\\ymsli\\day5\\question1\\story.txt"));
			
		String line=null;
		while((line=br.readLine())!=null) {
			String words[]=line.split(" ");
		

			for(String word: words)
			{
				Integer freq=map.get(word);
				if(freq==null) {
					map.put(word, 1);
				}
				else {
					map.put(word,++freq);
				}
			}
		}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("FREQUENCY OF WORDS-");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() +" appear "+ entry.getValue() + " times. ");
		}
	}
}
