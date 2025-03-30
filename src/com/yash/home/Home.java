package com.yash.home;
import java.util.Scanner;
import java.util.ArrayList;

public class Home {

	ArrayList<Room> rooms = new ArrayList<Room>(); 
	Scanner sc = new Scanner(System.in);
	
	public int IdChecker(int id) {
		
		for(int i=0;i<rooms.size();i++) {
			if(id==rooms.get(i).getId())
				return i;
		}
		return -1;
	}
	
	public void AddRoom(Home home) {
		
		System.out.print("\nSelect which room you want to add in your home ->\n1) Kichen 2) Living Area 3) Dinning Area 4) Bedroom "
				+ "5) Washroom 6) Corridors\n-> ");
		int choice = sc.nextInt();
		int id;
		
		if(choice==1) {
			while(true) {
				System.out.print("Enter id for your kichen -> ");
				id=sc.nextInt();
				if(IdChecker(id)==-1)
					break;
				System.out.println("ID is taken by other room !");
				}
			
			home.rooms.add(new Kichen(id,"Kichen"));
			System.out.println("Kichen was succesfully added to your house !");
		}
		else if(choice==2) {
			while(true) {
				System.out.print("Enter id for your Living Area -> ");
				id=sc.nextInt();
				if(IdChecker(id)==-1)
					break;
				System.out.println("ID is taken by other room !");
				}
			
			home.rooms.add(new Living_Area(id,"Living Area"));
			System.out.println("Living Area was succesfully added to your house !");
		}
		else if(choice==3) {
			while(true) {
				System.out.print("Enter id for your Dinning Area -> ");
				id=sc.nextInt();
				if(IdChecker(id)==-1)
					break;
				System.out.println("ID is taken by other room !");
				}
			
			home.rooms.add(new Dinning_Area(id,"Dinning Area"));
			System.out.println("Dinning Area was succesfully added to your house !");
		}
		else if(choice==4) {
			while(true) {
				System.out.print("Enter id for your Bedroom -> ");
				id=sc.nextInt();
				if(IdChecker(id)==-1)
					break;
				System.out.println("ID is taken by other room !");
				}
			
			home.rooms.add(new Bedroom(id,"Bedroom"));
			System.out.println("Bedroom was succesfully added to your house !");
		}
		else if(choice==5) {
			while(true) {
				System.out.print("Enter id for your Washroom -> ");
				id=sc.nextInt();
				if(IdChecker(id)==-1)
					break;
				System.out.println("ID is taken by other room !");
				}
			
			home.rooms.add(new Wash_Room(id,"Washroom"));
			System.out.println("Washroom was succesfully added to your house !");
		}
		else if(choice==6) {
			while(true) {
				System.out.print("Enter id for your Corridors -> ");
				id=sc.nextInt();
				if(IdChecker(id)==-1)
					break;
				System.out.println("ID is taken by other room !");
				}
			
			home.rooms.add(new Corridoors(id,"Corridors"));
			System.out.println("Corridors was succesfully added to your house !");
		}
		else
			System.out.println("Invalid Choice !");
	}
	
	public void ShowAllRooms(Home home) {
		
		if(home.rooms.size()>=1) {
			for(int i=0;i<home.rooms.size();i++) {
				System.out.println(home.rooms.get(i).toString() );
			}
		}
		else 
			System.out.println("Rooms Not Added !\nPlease Add Rooms In Home !");
	}
	
}
