
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349
 */

public class TextFileReader {
    
    // Create the instance variables
    private String[] locations = new String[24];
    
    
    
    
    
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a blank file reader
        FileReader file = null;
        try{
            // fix this proper loading later
            URL url = ClassLoader.getSystemClassLoader().getResource("pics.txt");
            // creating the file reader
            file = new FileReader("pics.txt");
        }catch(Exception e){
            // handle any errors
            // print out the lovely red errors
            e.printStackTrace();
            // exi the program
            System.exit(0);
            
        }
               
        // USe a Scanner with the file
        Scanner input  = new Scanner(file);
        
        // get the initial location       
        String initialLocation = input.nextLine();
        
        // initial direction
        String initialDirection = input.nextLine();
        
        for(int i = 0; i < 24; i++){
            // get the name of location
            String nameOfLocation = input.nextLine();
            // get the direction
            String direction = input.next();
            // get the image directory
            String image = input.next();
            // boolean true/false
            String frontIsClear = input.next();
            // new locatip
            
        }
        
        
        
        
        
    }
}
