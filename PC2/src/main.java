import java.util.Scanner;


public class main {
	
	public static void main(String[] args)
	{
	boolean quitBool = false;
	
	Scanner input = new Scanner(System.in);
	String inputString;

	System.out.println("Welcome to the adventure!! \n\n\n\n");
	
	
	while(quitBool != true)
	{
		
		System.out.println("You just robbed a bank, you have a gun and a bag of cash in your hand, what do you do now");
		System.out.println("R-Run out the door");
		System.out.println("S-Shoot the gaurd");
		System.out.println("B-Use the bathroom");
		System.out.println("H-Change clothes and blend in with the croud\n\n");
	
		inputString = input.next();
		
		if(inputString.length() == 1)
		{
		switch(inputString.toUpperCase()){
		case "R": REvent();
				quitBool = true;
			break;
		case "S": SEvent();
			quitBool = true;
			break;
		case "B": BEvent();
			quitBool = true;
			break;
		case "H": HEvent();
			quitBool = true;
			break;
		default: System.out.println("Input not understood, please try again");
			break;
		}
		
		}
		else{
			System.out.println("Input not understood, please try again");
		}
	
	}
		
		
		
	}
	
	public static void REvent()
	{
		System.out.println("R");
	}
	public static void SEvent()
	{
		System.out.println("S");
	}
	public static void BEvent()
	{
		System.out.println("B");
	}
	public static void HEvent()
	{
		System.out.println("H");
	}

}
