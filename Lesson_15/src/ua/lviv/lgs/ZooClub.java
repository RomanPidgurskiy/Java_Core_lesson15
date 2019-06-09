package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {
	
	
	Map<Person,ArrayList<Animal>> map = new HashMap<>();


 


	public void addPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mane");
		String name = sc.nextLine();
		System.out.println("Enter age1");
		int age = sc.nextInt();
		map.put(new Person(name, age),new ArrayList<Animal>());
		Input();
		
	}
	
	public void addAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter name person");
		String name = sc.nextLine();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				System.out.println("Person name "+name+".");
				System.out.println("Enter animal name");
				String animalName = sc.nextLine();
				System.out.println("Enter animal type__(dog) or (cat)");
				String animalType ;	
				while(true) {
					animalType = sc.nextLine();
					if (animalType.equals("dog") || animalType.equals("cat")) {break;}
					else {System.out.println("Incorrect value entered. Enter a (dog) or (cat)");}
				}
				ArrayList<Animal> value = next.getValue();
				value.add(new Animal(animalName, animalType));
				next.setValue(value);
			}
		}
		Input();
	}
	public void deleteAnimal() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter name person");
		String name = sc.nextLine();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				System.out.println("Enter animal name");
				String animalName = sc.nextLine();
				ArrayList<Animal> value = next.getValue();
				Iterator<Animal> iterator2 = value.iterator();
				while (iterator2.hasNext()) {
					if (iterator2.next().getName().equals(animalName)) {
						iterator2.remove();
						System.out.println("Delete Animal");
					} 
				}
				next.setValue(value);
				Input();
			}
		}
		
	}
	
	public void deletePerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name person delete");
		String name = sc.nextLine();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getKey().getName().equals(name)) {
				iterator.remove();
				System.out.println("Person Delete");
			}
		}
		Input();
	}
	
	public void deleteAnimalType() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter animal type__(dog) or (cat)");
		String animalType ;	
		while(true) {
			animalType = sc.nextLine();
			if (animalType.equals("dog") || animalType.equals("cat")) {break;}
			else {System.out.println("Incorrect value entered. Enter a (dog) or (cat)");}
		}
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			ArrayList<Animal> value = next.getValue();
			Iterator<Animal> iterator2 = value.iterator();
			while (iterator2.hasNext()) {
				if (iterator2.next().getType_of_animal().equals(animalType)) {
					iterator2.remove();
					System.out.println("Animal type with name -->  "+next.getKey().getName() + " Delete");
				}
			}
			next.setValue(value);
		}Input();
		
	}
	

	public void Input() {
		  
		  for (Entry<Person,ArrayList<Animal>> entry :map.entrySet()) {
				System.out.println(entry.getKey() + "-->"+entry.getValue());
			} 
	  }
	
}
