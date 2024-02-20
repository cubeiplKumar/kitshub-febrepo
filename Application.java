import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class FreqTableExampleOriginal {

    public static final int NUM_ASCII_CHAR = 128;

    // program to create a frequency table.
    // Example of simple try catch blocks to deal with checked exceptions
    public static void main(String[] args)
        {

        int[] freqs = createFreqTableURL("http://www.utexas.edu/");

        if( freqs.length == 0)
            System.out.println("No frequency table created due to problems when reading from file");
        else{
            for(int i = 0; i < NUM_ASCII_CHAR; i++){
                System.out.println("charcater code: " + i + " ,character: " + (char)i + " ,frequency: " + freqs[i]);
            }
            System.out.println("Total characters in file: " + sum(freqs));
        }


        freqs = new int[]{};
        try{
            freqs = createTable("ciaFactBook2008.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found. Unable to create freq table" + e);
        }
        catch(IOException e){
            System.out.println("Problem while reading from file. Unable to create freq table" + e);
        }

		#Feature2.2 changes by Vivek on PaymentGatewayModule on oct 2023
		 // method with no parameter
  public void display1() {
    System.out.println("Method without parameter");
  }

  // method with single parameter
  public void display2(int a) {
    System.out.println("Method with a single parameter: " + a);

		#feature2.1 changes by Ethan for the Savings Module in Oct 2023
		 // create a method
  public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
    return sum;

  }

  public static void main(String[] args) {
    

    // create an object of Main
    Main obj = new Main();

    // calling method with no parameter
    obj.display1();
    
    // calling method with the single parameter
    obj.display2(24);

    int num1 = 25;
    int num2 = 15;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);

  }
}
        if( freqs.length == 0)
            System.out.println("No frequency table created due to problems when reading from file");
        else{
            for(int i = 0; i < freqs.length; i++){
                System.out.println("charcater code: " + i + " ,character: " + (char)i + " ,frequency: " + freqs[i]);
            }
            System.out.println("Total characters in file: " + sum(freqs));
        }

    }