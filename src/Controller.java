
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657 & khans4349 & bisho
 */
public class Controller {

    // create the instance variables
    // initial scene
    private InitialScene iniScene;
    // Gui class
    private GUIClass gui;
    // direction
    private String[] directions;
    // the initial location
    private String currentLocation;
    // the initial direction
    private String currentDirection;
    // array list
    private ArrayList<Location> locations = new ArrayList<>();

    // set up gui class and initial scene
    public Controller(GUIClass gui, InitialScene iniScene) {

        // constructor
        //gui
        this.gui = gui;
        // initial scene
        this.iniScene = iniScene;
        // current direction
        this.currentDirection = iniScene.getStartingDirection();
        // current location
        this.currentLocation = iniScene.getStartingLocation();
        // array of directions
        directions = new String[]{"N", "E", "S", "W"};
        // set the controller
        gui.setController(this);

        // initialize the first scenes location and direction
        Scene starting = iniScene.getLocation(this.currentLocation, this.currentDirection);
        // set the image for the initial scene
        gui.setImage(starting.getImage());
    }

    // if the user wants to move forward
    public void Move() {

        // return the current location and direction
        Scene current = iniScene.getLocation(currentLocation, currentDirection);

        // if the front is not blocked at the current direction
        if (!current.isFrontBlocked(currentDirection)) {
            // get the next location at that position
            currentLocation = current.getNextPlace();
            // get the next direction at that positon
            currentDirection = current.getNextDirection();
        }
        // now set the location and direction on the scene
        Scene newS = iniScene.getLocation(currentLocation, currentDirection);
        // set the image for the respective location and direction
        gui.setImage(newS.getImage());
    }

    // if the user wants to turn left
    public void turnLeft() {

        // since direction is in an array, using a forloop to get the new direction
        for (int i = 0; i < directions.length; i++) {
            if (currentDirection.equals(directions[i])) {
                // an exception at north since its at the beginning of an array and has
                // to be switched manually
                if (currentDirection.equals("N")) {
                    currentDirection = "W";
                    break;
                } else {
                    // otherwise subtract the direction by 1 in the array
                    // to get new direction
                    currentDirection = directions[i - 1];
                    break;
                }
            }
        }
        // now set the location and direction on the scene
        Scene newS = iniScene.getLocation(currentLocation, currentDirection);
        // set the image for the respective location and direction
        gui.setImage(newS.getImage());

    }

    // if the user wants to turn right
    public void turnRight() {
        for (int i = 0; i < directions.length; i++) {
            // an exception at west since its at the end of an array and has
            // to be switched manually
            if (currentDirection.equals(directions[i])) {
                if (currentDirection.equals("W")) {
                    currentDirection = "N";
                    break;

                } else {
                    // otherwise add the direction by 1 in the array
                    // to get new direction
                    currentDirection = directions[i + 1];
                    break;
                }

            }
        }
        // now set the location and direction on the scene
        Scene newS = iniScene.getLocation(currentLocation, currentDirection);
        // set the image for the respective location and direction
        gui.setImage(newS.getImage());
    }
}