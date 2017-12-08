/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349, tewan2657 & bisho
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make the interface
        GUIClass gui = new GUIClass();

        // make the interface visible to user
        gui.setVisible(true);

        // set start
        InitialScene start = new InitialScene("images/pics.txt");

        // make the controller and connect to gui
        Controller c = new Controller(gui, start);



    }
}
