package com.yash.home;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Device {

	private int id;
	private String name ;
	private String onoffstatus;
	private String OnOffTime;
	
	Scanner sc = new Scanner(System.in);
	
	public Device() {
		// TODO Auto-generated constructor stub
	}


	public Device(int id, String name, String onoffstatus, String OnOffTime) {
		super();
		this.id = id;
		this.name = name;
		this.onoffstatus = onoffstatus;
		this.OnOffTime = OnOffTime;
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

	public String getOnoffstatus() {
		return onoffstatus;
	}

	public void setOnoffstatus(String onoffstatus) {
		this.onoffstatus = onoffstatus;
	}

	public String getOnOffTime() {
		return OnOffTime;
	}

	public void setOnOffTime(String onOffTime) {
		OnOffTime = onOffTime;
	}
	
	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", onoffstatus=" + onoffstatus + ", OnOffTime=" + OnOffTime
				+ ",";
	}

	public void OnOff_Device(Device ref) {
		
		System.out.print("Select Operation -> 1) On Device 2) Off Device\n-> ");
		int choice = sc.nextInt();
		
		System.out.println("Selected device name -> " + ref.getName());
		if(choice==1) {
			ref.setOnoffstatus("On");
			System.out.println(ref.getName()+" On Done !");
			ref.OnOffTime=LocalDateTime.now().toString();
		}
		else if(choice==2) {
			ref.setOnoffstatus("Off");
			System.out.println(ref.getName()+" Off Done !");
			ref.OnOffTime=LocalDateTime.now().toString();
		}
		else 
			System.out.println(ref.getName()+" Blast !");
	}
	
	public void Device_OnOffTime(Home home, Room room) {
		
		if(home.rooms.size()>=1) {
		System.out.print("Enter Room Id In Which These Device Stays -> ");
		int room_id = sc.nextInt();
		int room_index=home.IdChecker(room_id);
		
		if(home.rooms.get(room_index).getDevice().size()>=1) {
			System.out.print("Enter Device Id -> ");
			int device_id = sc.nextInt();
			int device_index = room.DeviceIdChecker(room_index, home, device_id);
			
			System.out.println("The "+home.rooms.get(room_index).getDevice().get(device_index).getName()+" Is "
			+home.rooms.get(room_index).getDevice().get(device_index).getOnoffstatus()+" From "
					+home.rooms.get(room_index).getDevice().get(device_index).getOnOffTime());
			}
		else
			System.out.println("Not Any Device Added !");
		}
		
	}
	
}
