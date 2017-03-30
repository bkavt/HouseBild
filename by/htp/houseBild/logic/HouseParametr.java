package by.htp.houseBild.logic;

import by.htp.houseBild.domain.Aperture;
import by.htp.houseBild.domain.Door;
import by.htp.houseBild.domain.Window;



public class HouseParametr {

	public static void showList(Aperture[] list) {
		for (int i=0; i<list.length-1; i++){
				if (list[i]!=null){
					System.out.println(list[i]);}
				}
			if (list.length==1){
			System.out.println("No aperture");
			}
			
	}
	public static Aperture[] caclWindow(Aperture[] list){
		int index=0;
		Aperture[] myList=new Aperture[list.length];
		
		for (int j=0; j<list.length-1; j++){
			if (list[j] instanceof Window) {
				myList[index]=list[j];
				index++;
			}
		}
		
		return myList;
				
	}
	public static Aperture[] caclDoor(Aperture[] list){
		int index=0;
		Aperture[] myList=new Aperture[list.length];
		
		for (int j=0; j<list.length-1; j++){
			if (list[j] instanceof Door) {
				myList[index]=list[j];
				index++;
			}
		}
		
		return myList;
				
	}
}
