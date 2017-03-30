package by.htp.houseBild.domain;


public class House {
	private Aperture[] myHouse;
	private int size=10;
	private int index=0;
	
	public House() {
		
		super();
		myHouse=new Aperture[size];
	}
	
	
	public Aperture[] getMyHouse() {
		return myHouse;
	}
	
	public void showByIndex(int index){
		
		Aperture[] list=new Aperture[getSize()]	;
		list=getMyHouse();
		System.out.println(list[index]);
		
	}
	public Aperture getByIndex(int Index){
		if (index<=myHouse.length&&myHouse[index]==null){
			return myHouse[index];
		}
		else return null;
	}
	
	public void lockDoor(int index){
		if (myHouse[index] instanceof Door){
		Door door=new Door();
		door=(Door) myHouse[index];
		door.lockDoor();
		}
		
	}
	
	public void newAperture(Aperture aperture){
		myHouse[index] = aperture;
		
		index++;
		if (index >= size) {
			size++;
			Aperture[] myHouseCopy = new Aperture[size];
			for (int i = 0; i < myHouse.length; i++) {
				myHouseCopy[i] = myHouse[i];
			}
			myHouse = myHouseCopy;
		}
	}
	public int getSize(){
		return this.size;
	}
	
}
