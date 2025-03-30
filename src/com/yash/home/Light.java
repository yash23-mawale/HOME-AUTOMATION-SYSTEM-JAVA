package com.yash.home;

public class Light extends Device {

	String color; 
	
	public Light() {
		// TODO Auto-generated constructor stub
	}

	public Light(int id, String name, String onoffstatus, String color, String OnOffTime) {
		super(id, name, onoffstatus, OnOffTime);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString()+" color=" + color + "]";
	}
	
	
	public void ChangeColor(Light light) {
		
		System.out.println("Select Color : 1) Red 2) Blue 3) Green 4) Yellow 5) White\n-> ");
		int Color = sc.nextInt();
		
		if(Color==1) {
			light.setColor("Red");
			System.out.println("Color change to Red !");
		}
		else if(Color==2) {
			light.setColor("Blue");
			System.out.println("Color change to Blue !");
			}
		else if(Color==3) {
			light.setColor("Green");
			System.out.println("Color change to Green !");
		}
		else if(Color==4) {
			light.setColor("Yellow");
			System.out.println("Color change to Yellow !");
		}
		else if(Color==5) {
			light.setColor("White");
			System.out.println("Color change to White !");
		}
		else
			System.out.println("Invalid Option");	
	}
	
}
