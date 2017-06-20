package nl.capgemini;

public class Rollercoaster {
	public String name;
	public String park;
	public String manufacturer;
	public boolean material;
	public double height;
	public int lenght;
	public boolean inverted;
	public int trains;
	public int speed;
	public boolean inversions;
	public int inversionAmount;
	public boolean launch;
	
	public Rollercoaster(String name, String park, String manufacturer,boolean material, double height, int lenght, boolean inverted, int trains, int speed, boolean inversions, int inversionAmount, boolean launch){
		this.name = name;
		this.park = park;
		this.manufacturer = manufacturer;
		this.material = material;
		this.height = height;
		this.lenght = lenght;
		this.inverted = inverted;
		this.trains = trains;
		this.speed = speed;
		this.inversions = inversions;
		this.inversionAmount = inversionAmount;
		this.launch = launch;
		
	}
	public void displayCoaster(){
		System.out.println("The rollercoaster is named: "+this.name+ ".");
		System.out.println(this.name+ " is built in "+this.park+ ".");
		System.out.println(this.name+ " is built by "+this.manufacturer+ ".");
		String woodSteel;
		if(this.material){
			woodSteel = "steel";
		}else{woodSteel = "wood";}
		System.out.println(this.name+ " is made of "+woodSteel+".");
		System.out.println(this.name+ " has a speed of "+this.speed+ " kilometers per hour.");
		System.out.println(this.name+ " has a height of "+this.height+ " meters.");
		System.out.println(this.name+ " has a lenght of "+this.lenght+ " meters.");
		String invertedCheck;
		if(this.inverted){
			invertedCheck = "does";
		}else{invertedCheck = "does not";}
		System.out.println(this.name+ " "+invertedCheck+" have an inverted track.");
		System.out.println(this.name+ " has "+this.trains+ " trains.");
		System.out.println(this.name+ " has a speed of: "+this.speed+ " kilometers per hour.");
		if(this.launch){
			System.out.println(this.name+ " is being launched.");
		}else{System.out.println(this.name+ " has a chainlift");}
		String inversionPlural;
		if(this.inversionAmount > 1)
			inversionPlural = "s";
		else
			inversionPlural = "";
		String inversionCheck;
		if(this.inversions){
			inversionCheck = "has";
			System.out.println(this.name+ " "+inversionCheck+" got "+this.inversionAmount+" inversion"+inversionPlural+".");
		}else{inversionCheck = "does not";
		System.out.println(this.name+ " "+inversionCheck+" have inversions.");
		}
	}
	}

