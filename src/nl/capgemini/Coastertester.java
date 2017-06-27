package nl.capgemini;
import java.util.ArrayList;
import nl.capgemini.RollerCoasterService;


public class Coastertester {
	public static void main(String [] args){
		
		
		ArrayList <Rollercoaster> list = new ArrayList <Rollercoaster> ();
		Rollercoaster taron = new Rollercoaster("Taron" ,"Phantasialand", "Intamin",true, 29.0, 1320,false, 4, 117, false, 0, true);
		list.add(taron);
		Rollercoaster elToro = new Rollercoaster("El Toro","Six Flags Great Adventure", "Intamin",false, 55.0, 1300,false, 2, 115, false, 0, false);
		list.add(elToro);
		Rollercoaster banshee = new Rollercoaster("Banshee","Kings Island", "Bolliger & Mabillard",true, 51.0, 1257,true, 3, 109, true, 7, false);
		list.add(banshee);
		Rollercoaster wildFire = new Rollercoaster("Wildfire","Kölmarden", "Rocky Mountain Construction",false, 57.0, 1300,false, 2, 113, true, 3, false);
		list.add(wildFire);
		Rollercoaster kingDaKa = new Rollercoaster("Kingda Ka","Six Flags Great Adventure", "Intamin",true, 139.0, 950,false, 4, 206, false, 0, true);
		list.add(kingDaKa);
		Rollercoaster baron1898 = new Rollercoaster("Baron 1898","Efteling", "Bolliger & Mabillard",true, 37.5, 501,false, 3, 90, true, 2, false);
		list.add(baron1898);
		Rollercoaster rockNRollercoaster = new Rollercoaster("Rock N Rollercoaster", "Disney's Hollywood Studios & Walt Disney Studio's", "Vekoma", true, 26.3, 1037, false, 4, 90, true, 3, true);
		list.add(rockNRollercoaster);
		Rollercoaster elCondor = new Rollercoaster("El Condor", "Walibi Holland", "Vekoma", true, 31.0, 662, true, 3, 80, true, 5, false);
		list.add(elCondor);
		Rollercoaster smiler = new Rollercoaster("The Smiler", "Alton Towers", "Gerstlauer", true, 30.0, 1170, true, 5, 85, true, 14, false);
		list.add(smiler);
		Rollercoaster fullThrottle = new Rollercoaster("Full Throttle", "Six Flags Magic Mountain", "Premier Rides", true, 42.0, 670, false, 2, 112, true, 1, true);
		list.add(fullThrottle);
		/*for(Object l : list){
		((Rollercoaster) l).displayCoaster();
		System.out.println("");*/
		
		RollerCoasterService testie = new RollerCoasterService();
		testie.addRollerCoasterByName(taron);
		testie.addRollerCoasterByName(elToro);
		testie.addRollerCoasterByName(banshee);
		testie.addRollerCoasterByName(wildFire);
		testie.addRollerCoasterByName(kingDaKa);
		testie.addRollerCoasterByName(rockNRollercoaster);
		testie.addRollerCoasterByName(baron1898);
		testie.addRollerCoasterByName(elCondor);
		testie.addRollerCoasterByName(fullThrottle);
		testie.addRollerCoasterByName(smiler);
		
		System.out.println("");
		
		testie.removeRollerCoasterByName(taron);
		testie.removeRollerCoasterByName(baron1898);
		
		System.out.println("");
		
		testie.showAllRollerCoasters();
		
		System.out.println("");
		
		testie.updateRollerCoasterByName(banshee);
	
		
		}
	}

