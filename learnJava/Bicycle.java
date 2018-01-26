package learnJava;

public class Bicycle {

	// Constructor Overloading
	//Default Constructor
	/*public Bicycle(){

	}*/

	public Bicycle(String color){

	}
	
	public Bicycle(String color, String brand){
		
	}

	//Method OverLoading
	public String getColor(){
		return "Black";
	}

	public int getColorofIndex(){
		return 2;
	}

	public String getColor(int num){
		if(num==4357){
			return "Black";
		}else{
			return "Red";
		}
	}

	public String getColor(String whom){
		if(whom.equalsIgnoreCase("daughter")){
			return "Pink";
		}else			
			return "Red";
	}

	/*public String getColor(String whos){
		if(whom.equalsIgnoreCase("daughter")){
			return "Pink";
		}else			
			return "Red";
	}*/

}
