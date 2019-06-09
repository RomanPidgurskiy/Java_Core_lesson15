package ua.lviv.lgs;

import java.util.Scanner;

public class main {
      
	static int mainMemu () {
		System.out.println();
		 System.out.println("    ------Memu-----    ");
		 System.out.println("1 - Add a member to the club");
		 System.out.println("2 - Add an animal to the club member");
		 System.out.println("3 - Delete the animal from the club member");
		 System.out.println("4 - Remove the member from the club");
		 System.out.println("5 - Remove a specific animal from all owners");
		 System.out.println("6 - Show the club club to the screen");
		 System.out.println("7 - Exit the program ");
		 System.out.println();
		 System.out.println("Enter a value from 1 to 6");
		
		 Scanner scan=new Scanner (System.in);		
		 return (scan.nextInt()) ;
	}
	
	public static void main(String[] args) {
		
		ZooClub zooClub=new ZooClub();
		
		while(true) {
			   int scan = mainMemu();
				switch(scan) {
				case 1:{
					System.out.println("1 - Add a member to the club");
					zooClub.addPerson();
					break;
				}
				case 2:{
					System.out.println("2 - Add the animal to the club member");
					zooClub.addAnimal();
					break;
				}
				case 3:{
					System.out.println("3 - Delete the animal from the club member");
					zooClub.deleteAnimal();
					break;
				}
				case 4:{
					System.out.println("4 - Remove the member from the club");
					zooClub.deletePerson();
					break;
				}
				case 5:{
					System.out.println("5 - Remove a specific animal from all owners");
					zooClub.deleteAnimalType();
					break;
				}
				case 6:{
					System.out.println("6 - Show the club club to the screen");
					zooClub.Input();
					break;
				}
				case 7:{
					System.out.println("7 - Exit the program");
					System.exit(0);
				}
				default:{
					
					System.out.println("Enter number 1 and 6 ");
					break;
				}
				
			}
	}
  }
}
