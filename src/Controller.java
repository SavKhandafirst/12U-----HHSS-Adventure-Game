
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
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

    private ArrayList<Location> locations = new ArrayList<>();

    public Controller(GUIClass gui, InitialScene iniScene) {
        
        this.gui = gui;
        this.iniScene = iniScene;
        this.currentDirection = iniScene.getStartingDirection();
        this.currentLocation = iniScene.getStartingLocation();

        directions = new String[]{"N", "E", "S", "W"};
        gui.setContro(this);

        Scene starting = iniScene.getLocation(this.currentLocation, this.currentDirection);
        gui.setImage(starting.getImage());
    }

    public void Move() {

        Scene current = iniScene.getLocation(currentLocation, currentDirection);

        if (!current.isFrontBlocked(currentDirection)) {
            currentLocation = current.getNextPlace();

            currentDirection = current.getNextDirection();
        }
        Scene newS = iniScene.getLocation(currentLocation, currentDirection);
        gui.setImage(newS.getImage());
    }

    public void turnLeft() {

        for (int i = 0; i < directions.length; i++) {
            if (currentDirection.equals(directions[i])) {
                if (currentDirection.equals("N")) {
                    currentDirection = "W";
                    break;
                } else {
                    currentDirection = directions[i - 1];
                    break;
                }
            }
        }
        Scene newS = iniScene.getLocation(currentLocation, currentDirection);
        gui.setImage(newS.getImage());

    }

    public void turnRight() {
        for (int i = 0; i < directions.length; i++) {
            if (currentDirection.equals(directions[i])) {
                if (currentDirection.equals("W")) {
                    currentDirection = "N";
                    break;

                } else {
                    currentDirection = directions[i + 1];
                    break;
                }

            }
        }
        Scene newS = iniScene.getLocation(currentLocation, currentDirection);
        gui.setImage(newS.getImage());
    }
}