
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
 * @author bisho
 */
public class ImageJ extends JComponent {

    private BufferedImage image;

    public void PaintComponent(Graphics g) {
        // there is an image to draw
        if (image != null) {
            // draw the image
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    public void setImage(BufferedImage img) {
        // store the image
        this.image = img;
        // repaint to draw
        repaint();
    }

    void loadImage(String imagesIMG_0083jpg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
