
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bisho & tewan2657 & Khans4347
 */
public class ImageJ extends JComponent {

    // instance variable
    private BufferedImage image;

    // constructor
    public ImageJ() {
        image = null;
    }

    /**
     *
     * @param g paint component to set the width and height of the image to the
     * screen layout
     */
    @Override
    public void paintComponent(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    /**
     *
     * @param img set the image that is received
     */
    public void setImage(BufferedImage img) {
        // store the image
        this.image = img;
        // repaint to draw
        repaint();
    }
}
