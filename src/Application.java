/**
 * This is the Application object that will launch our application
 * @author Rob Kelley
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		//Create NonPlayerCharacter object
		NonPlayerCharacter gc=new NonPlayerCharacter("487", "Neutral", false, "AVERAGE");
		//Call methods and display output
		System.out.println(gc.reportStructure());
		System.out.println(gc.introduce());
		System.out.println("Random String:"+gc.exclaim());
	

	}//end main

}//end class