
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bisho
 */
public class InitialScene {
    
    private String currentLocation;
    private String currentDirection;
    
    FileReader file = null;
    
    public InitialScene(){
        //Scanner
        Scanner in = new Scanner(System.in);
        
        //try catch
        try{
          URL url = Scanner.class.getResource("pics.txt");
          System.out.println(url);
          // Creating the file reader
          file = new FileReader(url.getFile());
      }catch(Exception e){
          // handle any errors
          // print out the red errors
          e.printStackTrace();
          System.exit(0);
      }
        // Read initial location and Direction
        //Caf1
        currentLocation = in.next();
        //N
        currentDirection = in.nextLine();
        
        
        
   }
    
    public String getStartingLocation(){
        return currentLocation;
    }
    
    public String getStartingDirection(){
        return currentDirection;
    }
    
    
    
}
