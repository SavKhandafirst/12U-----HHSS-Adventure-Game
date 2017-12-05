
import java.awt.image.BufferedImage;

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
    // scene class
    private Scene scene;
    // location image
    private BufferedImage image;
    //Stores the name of the image (basically  location)
    private String imageName;
    // direction
    private String direction;
    // if the front is clear
    private boolean isFrontBlocked;
    // the initial location
    private String currentLocation;
    // the initial direction
    private String currentDirection;

//	// location
//	private String location;
    public Controller(GUIClass gui, InitialScene iniScene) {

        this.gui = gui;
        this.scene = scene;
        this.iniScene = iniScene;
        // need the starting direction
        this.direction = scene.getDirection();

        // picture
        this.image = scene.getImage();

        // name of the image
        this.imageName = scene.getNextPlace();

        isFrontBlocked = true;
        // get the starting location
        this.currentLocation = iniScene.getStartingLocation();
        // get the starting direction
        this.currentDirection = iniScene.getStartingDirection();

    }

    public void Move() {

        if (isFrontBlocked == false) {
            direction = "N";
            imageName = scene.getNextPlace();
            image = scene.getImage();
        } else {
            System.out.println("Not Possible!!!");
        }
    }

    public void turnLeft() {
        if (isFrontBlocked == false) {
            direction = "W";
            imageName = scene.getNextPlace();
            image = scene.getImage();
        } else {
            System.out.println("Not Possible!!!");
        }
    }

    public void turnRight() {
        direction = "E";
        if (isFrontBlocked == false) {
            direction = "E";
            imageName = scene.getNextPlace();
            image = scene.getImage();
        } else {
            System.out.println("Not Possible!!!");
        }
    }
}
