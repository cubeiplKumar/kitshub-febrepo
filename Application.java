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
        if( freqs.length == 0)
            System.out.println("No frequency table created due to problems when reading from file");
        else{
            for(int i = 0; i < freqs.length; i++){
                System.out.println("charcater code: " + i + " ,character: " + (char)i + " ,frequency: " + freqs[i]);
            }
            System.out.println("Total characters in file: " + sum(freqs));
        }

    }