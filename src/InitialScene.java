
import java.io.File;
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
 * @author bisho
 */
public class InitialScene {

    private ArrayList<Location> locations;
    private String currentLocation;
    private String currentDirection;
    FileReader file = null;

    public InitialScene(String fileName) {

        locations = new ArrayList<>();

        //try catch
        try {
            Scanner input = new Scanner(new File(fileName));
            // Read initial location and Direction
            //Caf1
            currentLocation = input.next();
            //N
            currentDirection = input.nextLine();

            while (input.hasNext()) {
                Location l = new Location(input);
                locations.add(l);
            }

        } catch (Exception e) {
            // handle any errors
            // print out the red errors
            e.printStackTrace();
            System.exit(0);
        }

    }

    public Scene getLocation(String place, String direction) {
        // comparing for loop
        for (Location l : locations) {
            //if the location equals the string "place" passed in
            if (l.getLocationName().equals(place)) {
                //return location and direction
                return l.getScene(direction);
            }
        }
        //else return null
        return null;
    }

    public String getStartingLocation() {
        return currentLocation;
    }

    public String getStartingDirection() {
        return currentDirection;
    }
}
