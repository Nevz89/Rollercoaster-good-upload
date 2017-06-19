package nl.capgemini;
import java.util.ArrayList;


public class Coastertester {
	public static void main(String [] args){
		ArrayList <Rollercoaster> list = new ArrayList <Rollercoaster> ();
		Rollercoaster taron = new Rollercoaster("Taron" ,"Phantasialand", "Intamin",true, 29.0, 1320,false, 4, 117, false);
		list.add(taron);
		Rollercoaster elToro = new Rollercoaster("El Toro","Six Flags Great Adventure", "Intamin",false, 55.0, 1300,false, 2, 115, false);
		list.add(elToro);
		Rollercoaster banshee = new Rollercoaster("Banshee","Kings Island", "Bolliger & Mabillard",true, 51.0, 1257,true, 3, 109, true);
		list.add(banshee);
		Rollercoaster wildFire = new Rollercoaster("Wildfire","Kölmarden", "Rocky Mountain Construction",false, 57.0, 1300,false, 2, 113, true);
		list.add(wildFire);
		Rollercoaster kingDaKa = new Rollercoaster("Kingda Ka","Six Flags Great Adventure", "Intamin",true, 139.0, 950,false, 4, 206, false);
		list.add(kingDaKa);
		Rollercoaster baron1898 = new Rollercoaster("Baron 1898","Efteling", "Bolliger & Mabillard",true, 37.5, 501,false, 3, 90, true);
		list.add(baron1898);
		Rollercoaster RockNRollercoaster = new Rollercoaster("Rock N Rollercoaster", "Disney's Hollywood Studios & Walt Disney Studio's", "Vekoma", true, 26.3, 1037, false, 4, 90, true);
		list.add(RockNRollercoaster);
		Rollercoaster ElCondor = new Rollercoaster("El Condor", "Walibi Holland", "Vekoma", true, 31.0, 662, true, 3, 80, true);
		list.add(ElCondor);
		for(Object l : list){
		((Rollercoaster) l).displayCoaster();
		System.out.println("");
		}
	}
}
