package nl.capgemini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
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
			System.out.println("");
			try{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Set the name");
			o.name = scanner.nextLine();
			System.out.println("Set the manufacturer");
			o.manufacturer = scanner.nextLine();
			System.out.println("Set the themepark");
			o.park = scanner.nextLine();
			System.out.println("What material is the coaster made of? Steel = true, Wood = false.");
			o.material = scanner.hasNext();
			System.out.println("Set the height. example: 30.0");
			o.height = scanner.nextDouble();
			System.out.println("Set the lenght. example: 900");
			o.lenght = scanner.nextInt();
			System.out.println("Is the Rollercoaster inverted? true or false.");
			o.inverted = scanner.hasNext();
			System.out.println("How many trains? single number like 1");
			o.trains = scanner.nextInt();
			System.out.println("What speed does it have? Example 80.");
			o.speed = scanner.nextInt();
			System.out.println("Does the Rollercoaster have inversions? True or False");
			o.inversions = scanner.hasNext();
			System.out.println("If true, how many? If false just say 0.");
			o.inversionAmount = scanner.nextInt();
			System.out.println("Does this rollercoaster have a Launch? True or False");
			o.launch = scanner.hasNext();
			}catch(Exception e){
				o.height = 0.0;
				
			}
			o.RollerConstruct(o);
			o.displayCoaster();
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
