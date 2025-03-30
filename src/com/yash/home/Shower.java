package com.yash.home;

public class Shower extends Device {

	String watertype;
	
	public Shower() {
		// TODO Auto-generated constructor stub
	}

	public Shower(int id, String name, String onoffstatus, String watertype, String OnOffTime) {
		super(id, name, onoffstatus, OnOffTime);
		this.watertype = watertype;
	}

	public String getWatertype() {
		return watertype;
	}

	public void setWatertype(String watertype) {
		this.watertype = watertype;
	}

	@Override
	public String toString() {
		return super.toString()+" watertype=" + watertype + "]";
	}
	
	public void Change_watertype(Shower sh) {
		System.out.println("Select Warertype -> 1) Hot Water 2) Cold Water 3) Normal Water\n-> ");
		int choice = sc.nextInt();
		
		if(choice==1)
			sh.setWatertype("Hot");
		else if(choice==2)
			sh.setWatertype("Cold");
		else if(choice==3)
			sh.setWatertype("Normal");
		else
			System.out.println("Invalid choice !");
	}
}
