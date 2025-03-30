package com.yash.home;

import java.util.Scanner;

public class HomeMain {

	public static void main(String[] args) {
		
		Home home = new Home();
		Room room = new Room();
		Device device = new Device();
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("\n\n-------------------------------------------------------------------------------------");
			System.out.print("Select choice ->\n1 : Add Room In Home\n2 : Add Device In Room\n3 : Manage Devices In Room\n4 : Show Devices In Room\n5 : Show Rooms In Home\n6 : Check Device OnOffTime\n7 : Exit\n-> ");
			int choice=sc.nextInt();
			
			if(choice==1) {
				System.out.println();
				home.ShowAllRooms(home);
				home.AddRoom(home);
				System.out.println();
			}
			else if(choice==2) {
				System.out.println();
				home.ShowAllRooms(home);
				room.AddDevice(home);
				System.out.println();
			}
			else if(choice==3) {
				System.out.println();
				home.ShowAllRooms(home);
				System.out.println();
				
				if(home.rooms.size()>=1) {
				System.out.print("Enter room id in which these device stay\n-> ");
				int room_id = sc.nextInt();
				int index = home.IdChecker(room_id);
				
				if(index>=0) {
					System.out.print("Enter device id to manage these device\n-> ");
					int device_id = sc.nextInt();
					int device_index=room.DeviceIdChecker(index, home, device_id);
					
					if(device_index>=0) {
						
						if(home.rooms.get(index).getDevice().get(device_index) instanceof Light) {
							
							System.out.println("Selected device name -> " +home.rooms.get(index).getDevice().get(device_index).getName());
							System.out.print("Select choice -> 1) Light OnOff 2) Change Color\n-> ");
							int light_choice = sc.nextInt();
							
							Light light_down = (Light) home.rooms.get(index).getDevice().get(device_index);
							if(light_choice==1)
								light_down.OnOff_Device(light_down); 
							else if(light_choice==2) 
								light_down.ChangeColor(light_down);
							else
								System.out.println("Invalid choice !");
							
							}
						
						
						else if(home.rooms.get(index).getDevice().get(device_index) instanceof Fan) {
							
							System.out.println("Selected device name -> " +home.rooms.get(index).getDevice().get(device_index).getName());
							System.out.print("Select choice -> 1) Fan OnOff 2) Speed Control\n-> ");
							int fan_choice=sc.nextInt();
							
							Fan fan_down = (Fan) home.rooms.get(index).getDevice().get(device_index);
							if(fan_choice==1)
								fan_down.OnOff_Device(fan_down);
							else if(fan_choice==2) 
								fan_down.Control_speed(fan_down);
							else
								System.out.println("Invalid choice !");
							}
						
						
						else if(home.rooms.get(index).getDevice().get(device_index) instanceof Air_Conditioner) {
							
							System.out.println("Selected device name -> " +home.rooms.get(index).getDevice().get(device_index).getName());
							System.out.print("Select choice -> 1) Air_Conditioner OnOff 2) Temp Control\n-> ");
							int Ac_choice = sc.nextInt();
							
							Air_Conditioner Ac_down = (Air_Conditioner) home.rooms.get(index).getDevice().get(device_index);
							if(Ac_choice==1)
								Ac_down.OnOff_Device(Ac_down);
							else if(Ac_choice==2) 
								Ac_down.Control_temp(Ac_down);
							else
								System.out.println("Invalid choice !");
							}
						
						
						else if(home.rooms.get(index).getDevice().get(device_index) instanceof Television) {
							
							System.out.println("Selected device name -> " +home.rooms.get(index).getDevice().get(device_index).getName());
							System.out.print("Select choice -> 1) Television OnOff 2) Change Channel 3) Control Volume\n-> ");
							int tv_choice = sc.nextInt();
							
							Television tv_down = (Television) home.rooms.get(index).getDevice().get(device_index);
								if(tv_choice==1)
									tv_down.OnOff_Device(tv_down);
								else if(choice==2) 
									tv_down.Change_Channel(tv_down);
								else if(choice==3)
									tv_down.Control_volume(tv_down);
								else
									System.out.println("Invalid choice !");
								}
						
						
						else if(home.rooms.get(index).getDevice().get(device_index) instanceof Shower) {
							
							System.out.println("Selected device name -> " +home.rooms.get(index).getDevice().get(device_index).getName());
							System.out.print("Select Choice -> 1) Shower OnOff 2) Change WaterType\n-> ");
							int shower_choice = sc.nextInt();
							
							Shower shower_down = (Shower) home.rooms.get(index).getDevice().get(device_index);
							if(shower_choice==1)
								shower_down.OnOff_Device(shower_down);
							else if(shower_choice==2)
								shower_down.Change_watertype(shower_down);
							else
								System.out.println("Invalid choice !");
						}
							
					}
					else
						System.out.println("Device not found !");
				}
				else 
					System.out.println("Room not found !");
				}
			}
			else if(choice==4) {
				if(home.rooms.size()>=1) {
					home.ShowAllRooms(home);
					room.ShowAllDevices(home);
				}
				else
					System.out.println("Rooms Not Added !\nPlease Add Rooms In Home !");
			}
			else if(choice==5)
				home.ShowAllRooms(home);
				
			else if(choice==6) {
				System.out.println();
				home.ShowAllRooms(home);
				device.Device_OnOffTime(home, room);
				System.out.println();
			}
			else if(choice==7) {
				break;
			}
			else 
				System.out.println("Invalid choice !");
				
		}
		System.out.println("\nExited from the system.");
		System.out.println("--------------------------------------------------------------------------------------");
		sc.close();
	}
}
