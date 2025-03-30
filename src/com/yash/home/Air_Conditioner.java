package com.yash.home;

public class Air_Conditioner extends Device {

	private int ac_temp;
	
	public Air_Conditioner() {
		// TODO Auto-generated constructor stub
	}

	public Air_Conditioner(int id, String name, String onoffstatus, int ac_temp, String OnOffTime) {
		super(id, name, onoffstatus, OnOffTime);
		this.ac_temp = ac_temp;
	}

	public int getAc_temp() {
		return ac_temp;
	}

	public void setAc_temp(int ac_temp) {
		this.ac_temp = ac_temp;
	}

	@Override
	public String toString() {
		return super.toString()+" ac_temp=" + ac_temp + "]";
	}
	
	public void Control_temp(Air_Conditioner Ac) {
		
		while(true) {
			
			System.out.println("Select to speed control -> 1) Incresed Temp 2) Decreased Temp 3) Done\n-> ");
			int choice= sc.nextInt();
			
		if(choice==1) {
			if(Ac.getAc_temp()!=25) {
				Ac.setAc_temp(Ac.getAc_temp()+1);
				System.out.println("Air_Conditioner tempreture incresed : "+Ac.getAc_temp());
			}
			else
				System.out.println("Max Temp !");
		}
		else if(choice==2) {
			if(Ac.getAc_temp()!=16) {
				Ac.setAc_temp(Ac.getAc_temp()-1);
				System.out.println("Air_Conditioner tempreture decresed : "+Ac.getAc_temp());
			}
			else
				System.out.println("Min Temp !");
		}
		else if(choice==3)
			break;
		else 
			System.out.println("Invalid Choice !");
		}
	}
}
