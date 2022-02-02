package com.ymsli.java8.assignment1;

import static java.util.stream.Collectors.toList;

import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.ymsli.java8.assignment1.Dish.Type;


public class DishTesterExaple2 {
	
	public  DishSelectedField getDishSelectedField(Dish d){
		return new DishSelectedField(d.getName(), d.getCalories());
	}
	public static void main(String[] args) {

		List<Dish> allDishes = getAllDishes();
		
		// Example: return the names of dishes that are low in calories (<400) sorted by number of calories
		
		System.out.println("--------names of dishes that are low in calories (<400) sorted by number of calories-------");
		List<String> dishName=allDishes.stream()
		.filter(d->d.getCalories()<400)
		.map(Dish::getName)
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(dishName);
		
		// Getting all veg dishes
		
		System.out.println("----All veg dishes-----");
		List<String> vegDishes=
				allDishes.stream()
				.filter(d->d.isVegetarian())
				.map(v->v.getName())
				.collect(Collectors.toList());
		System.out.println(vegDishes);
		
		// Get list of All Dishes only containing name and calValue
		
		System.out.println("--------All dishes only containing name and calories value--------");
		
		List<DishSelectedField> dishNameCalories = allDishes.stream()
		.map(d-> new DishSelectedField(d.getName(),d.getCalories()))
		.collect(Collectors.toList());
		
		System.out.println(dishNameCalories);
		// create a List by selecting the first three dishes that have more than 300 calories
		
		System.out.println("----first three dishes that have more than 300 calories------");
		List<String> dishNameHaving300Calories=allDishes.stream()
				.filter(d->d.getCalories()>=300)
				.map(Dish::getName)
				.distinct()
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println(dishNameHaving300Calories);
		
		
		
		/*
		 * allMatch, anyMatch,noneMatch, findFirst, findAny
		 */
		
		

		// find out whether the menu has a vegetarian option: anyMatch
		
		System.out.println("------whether the menu has a vegetarian option-------");
		
		Boolean menuVegOption=allDishes.stream()
		.anyMatch(veg->veg.isVegetarian());
		
		System.out.println(menuVegOption);
		
		// find out whether the menu ishealthy :allMatch
		// (ie. all dishes are below 1000 calories):
		
		System.out.println("-------Whether the menu is healthy------");
		Boolean isHealthy = allDishes.stream()
				.allMatch(d->d.getCalories()<1000);
		System.out.println(isHealthy);
		
		
		// noneMatch: opposite of allMatch

		// find if any food item is veg? findAny
		
		System.out.println("-----Any food item is veg------");
		 allDishes.stream()
				.filter(d->d.isVegetarian())
				.findAny()
				.map(Dish::getName).ifPresent(System.out::println);
		
		 
		
		// Primitive stream specializations
		 

		// IntStream,DoubleStream, and LongStream==> avoid boxing cost

		// get all the cal values of all food items
		 
		 System.out.println("----Sum of calories of all food items---------");
		 int calories = allDishes.stream()
				 .map(Dish::getCalories).reduce(0, (x,y)->x+y);
				System.out.println(calories);
				
		// using primitive stream
		// find max cal values for all dishes, Optional
				
				System.out.println("--------Maximum calories among all dishes-----------");
				allDishes.stream()
						.max(Comparator.comparing(Dish::getCalories))
						.map(d->d.getCalories()).ifPresent(System.out::println);;
				
				
		/*
		 * What type of quaries Collect helps:Collectors.groupingBy(..)
		 * ------------------------------------- 
		 * 1. Dishes grouped by type 
		 * 2. Dishes grouped by caloric level 
		 * 3. Dishes grouped by type and then caloric level 
		 * 4. Count dishes in each groups 
		 * 5. Most caloric dishes by type 
		 * 6. Sum calories by type
		 */

		//1. Dishes grouped by type
						
			System.out.println("---Dishes grouped by type");
			allDishes.stream()
			.collect(Collectors.groupingBy(Dish::getType))
			.entrySet()
			.forEach(System.out::println);;
			
		// Dishes grouped by calorific level
			
			System.out.println("----------- 2. Dishes grouped by caloric level----------");
			allDishes.stream()
			.collect(Collectors.groupingBy(Dish::getCalories))
			.entrySet().forEach(System.out::println);
			
		//3. Dishes grouped by type and then caloric level
			
			System.out.println("---------Dishes grouped by type and then caloric level---------");
			
			allDishes.stream().collect(Collectors.groupingBy(Dish::getType
					,Collectors.groupingBy(Dish::getCalories))).entrySet()
			.forEach(System.out::println);
			
			
		// 4.Count dishes in each groups
			
			System.out.println("--------Count dishes in each groups--------");
			allDishes.stream().collect(Collectors.groupingBy(d->d.getType()
					,Collectors.counting())).entrySet().forEach(System.out::println);;
			
					
		// 5. Most caloric dishes by type 
					
			System.out.println("-----Most caloric dishes by type ----------");
			allDishes.stream()
					.collect(Collectors.groupingBy(Dish::getType,Collectors
							.maxBy(Comparator.comparing(Dish::getCalories))))
					.entrySet().forEach(System.out::println);;
		
			
		//6. Sum calories by type
					
			System.out.println("--------Sum calories by type----------");
			allDishes.stream().collect(Collectors.groupingBy(Dish::getType
					,Collectors.summingInt(Dish::getCalories)))
			.entrySet().forEach(System.out::println);;
			
		
		/*
		 * if (dish.getCalories() <= 400)
				return CaloricLevel.DIET;
			else if (dish.getCalories() <= 700)
				return CaloricLevel.NORMAL;
			else
				return CaloricLevel.FAT;
		 * 
		 */

		// Dishes grouped by type and then caloric level
		allDishes.stream().collect(Collectors.groupingBy((Dish dish)-> {
				if (dish.getCalories() <= 400)
					return CaloricLevel.DIET;
				else if (dish.getCalories() <= 700)
					return CaloricLevel.NORMAL;
				else
					return CaloricLevel.FAT;
			
		}));
		
	}

	

	private static List<Dish> getAllDishes() {
		List<Dish> disheds = Arrays.asList(new Dish("pork", false, 800,
				Dish.Type.MEAT), new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT), new Dish(
						"french fries", true, 530, Dish.Type.OTHER), new Dish(
						"rice", true, 350, Dish.Type.OTHER), new Dish(
						"season fruit", true, 120, Dish.Type.OTHER), new Dish(
						"pizza", true, 550, Dish.Type.OTHER), new Dish(
						"prawns", false, 300, Dish.Type.FISH), new Dish(
						"salmon", false, 450, Dish.Type.FISH));
		return disheds;
	}

}