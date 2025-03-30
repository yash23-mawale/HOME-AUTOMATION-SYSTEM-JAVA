package com.yash.home;

public class Television extends Device {

	int channal_num;
	int volumn;
	
	public Television() {
		// TODO Auto-generated constructor stub
	}

	public Television(int id, String name, String onoffstatus, int channal_num, int volumn, String OnOffTime) {
		super(id, name, onoffstatus, OnOffTime);
		this.channal_num = channal_num;
		this.volumn = volumn;
	}

	public int getChannal_num() {
		return channal_num;
	}

	public void setChannal_num(int channal_num) {
		this.channal_num = channal_num;
	}

	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	@Override
	public String toString() {
		return super.toString()+" channal_num=" + channal_num + ", volumn=" + volumn + "]";
	}
	
	public void Change_Channel(Television tv) {
			
			while(true) {
				
				System.out.println("Select to Change Channel -> 1) Forword Channel 2) Backword Channel 3) Done\n-> ");
				int choice= sc.nextInt();
				
			if(choice==1) {
				if(tv.getChannal_num()!=20) {
					tv.setChannal_num(getChannal_num()+1);
					System.out.println("Channel Change ( Forward ) : "+tv.getChannal_num());
				}
				else
					System.out.println("Max Channel !");
			}
			else if(choice==2) {
				if(tv.getChannal_num()!=0) {
					tv.setChannal_num(getChannal_num()-1);
					System.out.println("Channel Change ( Backword ) : "+tv.getChannal_num());
				}
				else
					System.out.println("Min Channel !");
			}
			else if(choice==3)
				break;
			else 
				System.out.println("Invalid Choice !");
			}
	}
	
	public void Control_volume(Television tv) {
			
			while(true) {
				
				System.out.println("Select to control -> 1) Incresed Speed 2) Decreased Speed 3) Done\n-> ");
				int choice= sc.nextInt();
				
			if(choice==1) {
				if(tv.getVolumn()!=15) {
					tv.setVolumn(tv.getVolumn()+1);
					System.out.println("Television volume incresed : "+tv.getVolumn());
				}
				else
					System.out.println("Max Volume !");
			}
			else if(choice==2) {
				if(tv.getVolumn()!=0) {
					tv.setVolumn(tv.getVolumn()-1);
					System.out.println("Television volume decresed : "+tv.getVolumn());
				}
				else
					System.out.println("Min Volume !");
			}
			else if(choice==3)
				break;
			else 
				System.out.println("Invalid Choice !");
			}
		
	}
}
