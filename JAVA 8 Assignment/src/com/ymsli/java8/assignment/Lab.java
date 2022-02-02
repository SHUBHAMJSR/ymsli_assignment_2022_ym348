package com.ymsli.java8.assignment;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class Lab {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		
		System.out.println("---------books with more then 400 pages--------");
		// 1. Find books with more then 400 pages
		//Predicate<Book> bookWith400Pages= b -> b.getPages()>400;
		allBooks.stream().filter(b -> b.getPages()>400).forEach(System.out::println);
		
		

		
		// 2. Find all books that are java books and more then 400 pages
		System.out.println("-------- books that are java books and more then 400 pages-------");
		Predicate<Book> bookWith400Pages = b -> b.getPages()>400;
		Predicate<Book> bookWithNameJava = b-> b.getSubject()==Subject.JAVA;
		List<Book> bookWith400PagesandTitleJava=
				allBooks.stream()
				.filter(bookWith400Pages.and(bookWithNameJava))
				.collect(Collectors.toList());
		bookWith400PagesandTitleJava.forEach(System.out::println);
		
		// 3. We need the top three longest books
		
		System.out.println("------top three longest books-------");
		List<Book> bookWithMostPages3=allBooks.stream()
		.sorted(Comparator.comparing(Book::getPages).reversed())
		.limit(3)
		.collect(Collectors.toList());
		
		bookWithMostPages3.forEach(System.out::println);
		
		

		// 4. We need from the fourth to the last longest books
		System.out.println("----fourth to the last longest books-----");
		List<Book> bookWithMostPages4ToLast=allBooks.stream()
				.sorted(Comparator.comparing(Book::getPages).reversed())
				.skip(3)
				.collect(Collectors.toList());
		bookWithMostPages4ToLast.forEach(System.out::println);

		// 5. We need to get all the publishing years
		
		System.out.println("----get all the publishing years-----");
		List<Integer> pubYear=allBooks.stream()
				.map(Book::getYear)
				.distinct()
				.collect(Collectors.toList());
		pubYear.forEach(System.out::println);

		// 6. We need all the authors names who have written a book	
		
		System.out.println("------all the authors names who have written a book-----");
		List<String> authorNames = allBooks
				.stream()
				.flatMap(a->a.getAuthors()
				.stream())
				.map(b->b.getName()).distinct().collect(Collectors.toList());
			
		authorNames.forEach(System.out::println);
		
		// We want to know if all the books are written by more than one author? boolean
			System.out.println("------books are written by more than one author-----");
		Boolean allBooksWrittenByMoreThan1Author=
				allBooks.stream()
				.allMatch(b->b.getAuthors().size()>1);
				
		System.out.println("Does all books have more than one author? "+allBooksWrittenByMoreThan1Author);
		
				
			
		//is all the elements of array are odd?
		System.out.println("[1,2,3,4,5]");
		Boolean b1=Arrays.asList(1,2,3,4,5).stream().allMatch(a->a%2==0);
		System.out.println("All elements are odd or not: "+b1);
			
		System.out.println("[2,4,6,8,10]");
		Boolean b2=Arrays.asList(2,4,6,8,10).stream().allMatch(a->a%2==0);
		System.out.println("All elements are odd or not: "+b2);
		
		// We want one of the books written by more than one author.? (findAny)
		
		System.out.println("--------Any one of the books written by author--------");
		Optional<Book> anyBookWrittenByMoreThanOneAuthor=allBooks.stream()
		.filter(a->a.getAuthors().size()>1)
		.findAny();
		
			if(anyBookWrittenByMoreThanOneAuthor.isPresent())
			{
				System.out.println(anyBookWrittenByMoreThanOneAuthor);
			}
			else
			{
				System.out.println("Not found");
			}
			
		// We want to know how many pages the longest book has.
			
			System.out.println("-----Longest Book pages--------");
					Optional<Integer> longestBookPages=allBooks.stream()
							.map(Book::getPages)
							.reduce((x,y)->x+y);
					
			System.out.println("Longest Book:- "+longestBookPages);
			
		
		// We want the average number of pages of the books
			
			System.out.println("---Average number of Pages----");
			Double averageOfAllPages=allBooks.stream()
					.collect(Collectors.averagingDouble(Book::getPages));
			
			System.out.println(averageOfAllPages);
		
		// We want all the titles of the books
			//all tiles print : java , adv c#, 
			
			System.out.println("--------All titles of books-------");
			
			List<String> titlesOfBooks=allBooks.stream()
					.map(Book::getTitle)
					.distinct()
					.collect(Collectors.toList());
			
			System.out.println(titlesOfBooks);
		
		
	
		// We want the book with the higher number of authors?
			
			System.out.println("----Book with Highest number of authors-----");
			Optional<Book> bookWithHighestAuthors=allBooks.stream()
			.collect(Collectors.maxBy(Comparator.comparing(b->b.getAuthors().size())));
			
			System.out.println(bookWithHighestAuthors);
	
		// We want a Map of book per year.
			
			System.out.println("------Map of book per year----");
			Map<Integer, List<Book>> mapYearWiseBooks = allBooks.stream()
					.collect(Collectors.groupingBy(b->b.getYear()));
			
			Set<Entry<Integer, List<Book>>> entrySet= mapYearWiseBooks.entrySet();
			entrySet.forEach(System.out::println);

		// We want a Map of book per year and then by subject
			
			System.out.println("----------book per year and then by subject------");
			allBooks.stream().collect(Collectors.groupingBy(Book::getYear,
					Collectors.groupingBy(Book::getSubject))).entrySet()
			.forEach(System.out::println);
			
			
			
		
		// We want to count how many books are published per year.
			System.out.println("------Count books published per year-------");
			Map<Integer, Long> countYearWiseBooks = allBooks.stream()
					.collect(Collectors.groupingBy(Book::getYear,Collectors.counting()));
			Set<Entry<Integer,Long>> entrySet1=countYearWiseBooks.entrySet();
			entrySet1.forEach(System.out::println);
			
	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(
				new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in")
				);

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));
		List<Author> authors4 =Arrays.asList(new Author("SG Ganesha","Ganesha","in"));
		

		books.add(new Book("java", authors1, 800, Subject.JAVA, 2021, "1213"));
		books.add(new Book("adv java", authors1, 400, Subject.JAVA, 2021, "1213"));
		
		books.add(new Book("adv C#", authors2, 700, Subject.DOT_NET, 2022, "1218"));
		books.add(new Book("C# basics", authors3, 600, Subject.DOT_NET, 2019, "1293"));
		
		books.add(new Book("OCPJP",authors4, 900, Subject.JAVA, 2002, "3115"));

		return books;
	}

}
