package com.yash.home;

public class Fan extends Device {

	int fan_speed;
	
	public Fan() {
		// TODO Auto-generated constructor stub
	}

	public Fan(int id, String name, String onoffstatus, int fan_speed, String OnOffTime) {
		super(id, name, onoffstatus, OnOffTime);
		this.fan_speed = fan_speed;
	}

	public int getFan_speed() {
		return fan_speed;
	}

	public void setFan_speed(int fan_speed) {
		this.fan_speed = fan_speed;
	}

	@Override
	public String toString() {
		return super.toString()+" fan_speed=" + fan_speed + "]";
	}
	
	public void Control_speed(Fan fan) {
		
		while(true) {
			
			System.out.println("Select to speed control -> 1) Incresed Speed 2) Decreased Speed 3) Done\n-> ");
			int choice= sc.nextInt();
			
		if(choice==1) {
			if(fan.getFan_speed()!=5) {
				fan.setFan_speed(fan.getFan_speed()+1);
				System.out.println("Fan speed incresed : "+fan.getFan_speed());
			}
			else
				System.out.println("Max Speed !");
		}
		else if(choice==2) {
			if(fan.getFan_speed()!=0) {
				fan.setFan_speed(fan.getFan_speed()-1);
				System.out.println("Fan speed decresed : "+fan.getFan_speed());
			}
			else
				System.out.println("Min Speed !");
		}
		else if(choice==3)
			break;
		else 
			System.out.println("Invalid Choice !");
		}
	}
}
