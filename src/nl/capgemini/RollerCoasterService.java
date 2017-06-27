package nl.capgemini;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Scanner;

public class RollerCoasterService {
	
	private ArrayList <Rollercoaster> rollerList = new ArrayList<Rollercoaster>();
	
	
	public void addRollerCoasterByName(Rollercoaster o){
		rollerList.add(o);
		System.out.println("You have added:"+ o.name);
	}
	 
	
	public void updateRollerCoasterByName(Rollercoaster o){
		if (rollerList.contains(o)){
			System.out.println("Rollercoaster found named: "+ o.name);
			o.displayCoaster();
			System.out.println("");
			removeRollerCoasterByName(o);
			System.out.println("");
			addRollerCoasterByName(o);
			System.out.println("This is now updated");
		}else
			System.out.println("Coaster not found.");
			return;
	}
	
	public void removeRollerCoasterByName(Rollercoaster o){
		rollerList.remove(o);
		System.out.println("You have deleted: "+ o.name);
	}
	
	public void showAllRollerCoasters(){
		for(Rollercoaster o : rollerList){
			System.out.println(o.name);
		}
	}
		
}
