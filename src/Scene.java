
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adars
 */
public class Scene {

//Stores Direction
    private String direction;
    //Stores the name of the image 
    private String imageName;
    // Stores the image
    private BufferedImage image;
    // Check if the front is clear
    private boolean isFrontBlocked;
    //Stores the next direction
    private String nextDirection;
    //Stores the next place we are headed
    private String nextPlace;

    public Scene(Scanner in) {
        //store the direction 
        direction = in.next();
        //Store the image name 
        imageName = in.next();

        //Check if there is more info 
        String ifMore = in.next();

        if (ifMore.equals("false")) {
            // the front is not blocked
            isFrontBlocked = false;
            //Store the next place  that we are headed towards 
            nextPlace = in.next();
            //Store the next direciton that we are headed towards  
            nextDirection = in.next();

            //Skip to next line 
            in.nextLine();

        } else {
            // the front is blocked 
            isFrontBlocked = true;
            in.nextLine();
        }
        try{
            image = ImageIO.read(new File("images/" + imageName));
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        
    }

    /**
     * Returns the direction of the Scene
     *
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Returns the image of the Scene
     *
     * @return the image
     */
    public BufferedImage getImage() {
        return image;
    }

    /**
     * Returns the upcoming direction
     *
     * @return the nextDirection
     */
    public String getNextDirection() {
        return nextDirection;
    }

    /**
     * Returns the name of the upcoming place/location
     *
     * @return next place
     */
    public String getNextPlace() {
        return nextPlace;
    }

    /**
     * Returns if front is clear
     *
     * @param direction is the direction the character is at
     * @return isFrontBlocked
     */
    public boolean isFrontBlocked(String direction) {
        return isFrontBlocked;
    }
}
