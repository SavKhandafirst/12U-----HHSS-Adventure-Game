
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bisho & tewan2657 & khans4349
 */
public class InitialScene {

    // instance variables
    // array list
    private ArrayList<Location> locations;
    // current location
    private String currentLocation;
    // current direction
    private String currentDirection;

    public InitialScene(String fileName) {

        // set the array list
        locations = new ArrayList<>();

        //try catch
        try {
            Scanner in = new Scanner(new File(fileName));
            // Read initial location and Direction
            //Caf1
            currentLocation = in.next();
            //N
            currentDirection = in.next();

            // go to the end of the file
            while (in.hasNext()) {
                Location l = new Location(in);
                locations.add(l);
            }

        } catch (FileNotFoundException e) {
            // handle any errors
            // print out the red errors
            e.printStackTrace();
            System.exit(0);
        }

    }

    /**
     *
     * @param place being passed through
     * @param direciton being passed through
     * @return the scene at a specific direction
     */
    public Scene getLocation(String place, String direction) {
        for (Location l : locations) {
            if (l.getLocationName().equals(place)) {
                return l.getScene(direction);
            }
        }
        return null;
    }

    /**
     * @param get the starting location of the scene
     * @return
     */
    public String getStartingLocation() {
        return currentLocation;
    }

    /**
     * @param get the starting direction of the scene
     * @return
     */
    public String getStartingDirection() {
        return currentDirection;
    }
}
