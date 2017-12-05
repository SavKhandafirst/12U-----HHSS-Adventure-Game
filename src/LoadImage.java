
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class LoadImage extends JComponent {

    BufferedImage img = null;

    /**
     *
     * @param g
     */
    @Override
public void paintComponent(Graphics g) {
        if (img != null) {
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    public BufferedImage loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
}