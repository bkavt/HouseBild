package by.htp.houseBild.launch;

import by.htp.houseBild.domain.Aperture;
import by.htp.houseBild.domain.Door;
import by.htp.houseBild.domain.House;
import by.htp.houseBild.domain.Window;
import by.htp.houseBild.logic.HouseParametr;

public class Main {

	public static void main(String[] args) {
		House myHouse=new House();
		Aperture[] numOfWindow;
		Aperture[]numOfDoor;

	Aperture app1=new Window(100,100,3,2,10);	
	Aperture app2=new Door(200,80,"metal");
	Aperture app3=new Window(130,150,2,4,20);	
	Aperture app4=new Window(100,150,3,3,20);	
	Aperture app5=new Door(210,90,"plactic");	
	
	myHouse.newAperture(app1);
	myHouse.newAperture(app2);
	myHouse.newAperture(app3);
	myHouse.newAperture(app4);
	myHouse.newAperture(app5);
	
	HouseParametr.showList(myHouse.getMyHouse());
	System.out.println("");
	
	myHouse.lockDoor(1);
	myHouse.showByIndex(1);
	System.out.println("");
	
	myHouse.lockDoor(1);
	myHouse.showByIndex(1);
	System.out.println("");
	
	numOfWindow=new Aperture[myHouse.getSize()];
	numOfWindow=HouseParametr.caclWindow(myHouse.getMyHouse());
	HouseParametr.showList(numOfWindow);
	System.out.println("");
	
	numOfDoor=new Aperture[myHouse.getSize()];
	numOfDoor=HouseParametr.caclDoor(myHouse.getMyHouse());
	HouseParametr.showList(numOfDoor);
	System.out.println("");
	
	
	}

}