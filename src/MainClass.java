/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUIClass gui = new GUIClass();

        gui.setVisible(true);

        InitialScene start = new InitialScene("images//pics.txt");

        Controller c = new Controller(gui, start);



    }
}
