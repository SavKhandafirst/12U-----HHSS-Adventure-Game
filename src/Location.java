/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349
 */
public class Location {

    // private instance variables
    private String nameofLocation;
    private String direction;
    private String image;
    private boolean frontIsClear;

    // CONSTRUCTOR:

    // Location, direction, image, and checking to see if fronts clear
    public Location(String nameofLocation, String direction, String image, boolean frontIsClear) {
        this.nameofLocation = nameofLocation;
        this.direction = direction;
        this.image = image;
        this.frontIsClear = frontIsClear;
    }
}