import java.util.Scanner;
import java.util.Random;
class Color 
{

// equalsIgnoreCase = Ignore casing in user response ex: value OR VaLuE
// | (pipe) = Make one output anothers input


    int green; 
    int red;
    int blue;
 // int c;
    String response;
    public static void main( String args[] )
    {
        Color obj = new Color();
        Scanner sc=new Scanner(System.in);
        while(true){
//        	Choice menu 
            System.out.println("Change by value? If yes enter 'value'");
            System.out.println("Wanna get random values? If yes enter 'random'");
            System.out.println("Wanna exit? If yes enter 'exit'");
            obj.response=sc.nextLine();
//          "Value" changes current R,G,B to the inputed value
            if(obj.response.equalsIgnoreCase("value"))
            {
                System.out.println("Change red's value");
                obj.red=sc.nextInt();
//              Check if input is over 255 (Not allowed)  
                while(obj.red <0 || obj.red >255)
                {
                    System.out.println("Input value over 255 (invalid)");
                    obj.red=sc.nextInt();
                }
                System.out.println("Change blues's value");
                obj.blue=sc.nextInt();
                while(obj.blue <0 || obj.blue >255)
                {    
                    System.out.println("Input value over 255 (invalid)");
                    obj.blue=sc.nextInt();
                } 
                System.out.println("Change green's value");
                obj.green=sc.nextInt();
                while (obj.blue <0 || obj.blue >255){
                    System.out.println("Input value over 255 (invalid)");
                    obj.green=sc.nextInt();
                }

                System.out.println("Color = " + "[" + obj.red + ","+ obj.green + ","+ obj.blue + "]"); 
            }
            if(obj.response.equalsIgnoreCase("random"))
            {
                obj.colorCreate();
            }
            if(obj.response.equalsIgnoreCase("exit"))
            {
            	System.out.println("Color has stopped...");
                System.exit(0);
            }   
        }     
    }
//  Red, Green Blue | Storage
    public void colorCreate()
    {
        Random r = new Random();
// Same as c = c + 1; 
        // c++; (Not needed as of now)
//      Lowest random int can reach
        int lowerbound= 0;     
//      Highest random int can reach
        int higherbound = 255; 
//      Construct R,G,B with
        red = r.nextInt(higherbound-lowerbound) + lowerbound;   
        green= r.nextInt(higherbound-lowerbound) + lowerbound;
        blue = r.nextInt(higherbound-lowerbound) + lowerbound;
//      Print R,G,B in correct format | [int,int,int]
        System.out.println("Color = " + "[" + red + ","+ green + ","+ blue + "]"); 
    }
}
