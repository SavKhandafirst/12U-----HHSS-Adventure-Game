
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

    private BufferedImage image;

    public ImageJ() {
        image = null;
    }

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    public void setImage(BufferedImage img) {
        // store the image
        this.image = img;
        // repaint to draw
        repaint();
    }

}
