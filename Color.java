import java.util.Random;
import java.util.Scanner;

public class Color {
	
	private ranD colorGenerator = new ranD();
	
	public void create() {
		// Create random INT up to 255 MAX
		int red = ranD.nextInt(255);
		int blue = ranD.nextInt(255);
		int green = ranD.nextInt(255);
		
		public void darkLighten(int red, int blue, int green) {
			
    		Scanner scanPercent = new Scanner(System.in);   
   		 System.out.println("Enter the % to lighten / darken");

    		int percent = scanPercent.nextInt();  
   
   		return "["+red * percent +", "+green * percent +", "+blue * percent +"]";
    
    
			
		}
	}
	
}
