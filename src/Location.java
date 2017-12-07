
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349 & tewan2657 & bisho
 */
public class Location {

    //Store the name of the location;
    private String locationName;
    // an Array to store all the directions
    private String[] Directions;
    //An arrayList to store the scene information 
    private ArrayList<Scene> Scenes;

    public Location(Scanner in) {

        //Intialize the directions array and store the directions in the array 
        Directions = new String[]{"N", "E", "S", "W"};

        //Store the locationName from the text File 
        locationName = in.next();

        //Initalize the arraylist
        Scenes = new ArrayList<>();

        //Make 4 scenes
        for (int i = 0; i < 4; i++) {
            Scene s = new Scene(in);

            Scenes.add(s);
        }
    }

    /**
     * Returns the name of the location 
     * @return the location name  
     */
    public String getLocationName() {
        return this.locationName;
    }

    public Scene getScene(String direction) {
        for (Scene s : Scenes) {
            //Return the Scene
            //depending on the direction you are currently facing 
            if (s.getDirection().equals(direction)) {
                return s;
            }

        }
        //return nothing
        return null;

    }

}
