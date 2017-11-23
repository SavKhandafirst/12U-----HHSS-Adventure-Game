
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class Adventure {

    JFrame guiFrame;
    Container con;
    JPanel pan, pButt;
    JLabel lab;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
    Font buttFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton jButt;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new Adventure();

    }

    public Adventure() {

        //WINDOW FRAME
        guiFrame = new JFrame();
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("HHSS ADVENTURE");
        guiFrame.setSize(800, 600);
        guiFrame.getContentPane().setBackground(Color.BLACK);
        guiFrame.setLayout(null);
        guiFrame.setVisible(true);
        guiFrame.setLocationRelativeTo(null);
        Container con = guiFrame.getContentPane();

        //TITLE PANEL
        pan = new JPanel();
        pan.setBounds(100, 100, 600, 150);
        pan.setBackground(Color.BLACK);

        //TITLE LABEL
        lab = new JLabel("HHSS ADVENTURE");
        lab.setForeground(Color.white);
        lab.setFont(titleFont);

        //Start Button PANEL
        pButt = new JPanel();
        pButt.setBounds(300, 400, 200, 100);
        pButt.setBackground(Color.BLACK);

        //Start Button LABEL
        jButt = new JButton("START");
        jButt.setBackground(Color.BLACK);
        jButt.setForeground(Color.WHITE);
        jButt.setFont(buttFont);

        //add to JFRAME  
        pan.add(lab);
        pButt.add(jButt);

        con.add(pan);
        con.add(pButt);


    }

}
