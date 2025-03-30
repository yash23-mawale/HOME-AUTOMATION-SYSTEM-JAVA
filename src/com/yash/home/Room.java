package com.yash.home;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {

	private int id;
	private String name;
	private ArrayList<Device> device;
	
	Scanner sc = new Scanner(System.in);
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public Room(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.device = new ArrayList<Device>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Device> getDevice() {
		return device;
	}

	public void setDevice(ArrayList<Device> device) {
		this.device = device;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", device=" + device + "]";
	}
	
	public int DeviceIdChecker(int index,Home home,int device_id) {
		for(int i=0;i<home.rooms.get(index).getDevice().size();i++) {
			if(home.rooms.get(index).getDevice().get(i).getId()==device_id) {
				return i;
			}
		}
		return -1;
	}
	
	public void AddDevice(Home home) {
		
		if(home.rooms.size()>=1) {
		
		System.out.print("\nEnter room id for adding device -> ");
		int id=sc.nextInt();
		int index=home.IdChecker(id);
		
		if(index>=0) {
			System.out.print("Select device to add in your room ->\n1) Light 2) Fan 3) Air Conditioner 4) Television 5) Shower\n-> ");
			int device_choice=sc.nextInt();
			
			if(device_choice>0 && device_choice<=5) {
				System.out.print("Enter device id -> ");
				int device_id=sc.nextInt();
				
				if(DeviceIdChecker(index,home,device_id)==-1) {
					
					if(device_choice==1) {
						home.rooms.get(index).getDevice().add(new Light(device_id,"Light","Off","White","None"));
						System.out.println("Light is added succesfully !");
					}
					else if(device_choice==2) {
						home.rooms.get(index).getDevice().add(new Fan(device_id,"Fan","Off",2,"None"));
						System.out.println("Fan is added succesfully !");
					}
					else if(device_choice==3) {
						home.rooms.get(index).getDevice().add(new Air_Conditioner(device_id,"Air_Conditioner","Off",16,"None"));
						System.out.println("Air Conditioner is added succesfully !");
					}
					else if(device_choice==4) {
						home.rooms.get(index).getDevice().add(new Television(device_id,"Television","Off",10,7,"None"));
						System.out.println("Television is added succesfully !");
					}
					else if(device_choice==5) {
						home.rooms.get(index).getDevice().add(new Shower(device_id,"Shower","Off","Normal","None"));
						System.out.println("Light is added succesfully !");
					}
		
				}
				else
					System.out.println("Id is taken by other device in same room !");
			}
			else
				System.out.println("Invalid Selection !");
				}
		else
			System.out.println("Room not found !");
		}
			
	}
	
	public void ShowAllDevices(Home home) {
		
		System.out.print("Enter room id in which these device stay\n-> ");
		int room_id = sc.nextInt();
		int index = home.IdChecker(room_id);
		

			if(index>=0) {
				if(home.rooms.get(index).getDevice().size()>=1) {
					for(int i = 0;i<home.rooms.get(index).getDevice().size();i++) {
						
						System.out.println(home.rooms.get(index).getDevice().get(i).toString());
					}
				}
				else
					System.out.println("Not Any Device Added !");
			}
			else
				System.out.println("Room not found !");
			
	}
	
}
