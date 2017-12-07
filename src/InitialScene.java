
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
 * @author bisho
 */
public class InitialScene {

    private ArrayList<Location> locations;
    private String currentLocation;
    private String currentDirection;
    

    public InitialScene(String fileName) {

        locations = new ArrayList<>();

        //try catch
        try {
            Scanner in = new Scanner(new File(fileName));
            // Read initial location and Direction
            //Caf1
            currentLocation = in.next();
            //N
            currentDirection = in.next();

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

    public Scene getLocation(String place, String direciton) {
        for (Location l : locations) {
            if (l.getLocationName().equals(place)) {
                return l.getScene(direciton);
            }
        }
        return null;
    }

    public String getStartingLocation() {
        return currentLocation;
    }

    public String getStartingDirection() {
        return currentDirection;
    }
}
