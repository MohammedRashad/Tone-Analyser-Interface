/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rashad.tone.analyser;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author root
 */
public class ToneAnalyser {

    static int newH, newW;
    static Dimension dim;
    static MainUI UI;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {

            createWindow();
            setLocationToMiddle();

        });

    }

    private static void setLocationToMiddle() {

        dim = Toolkit.getDefaultToolkit().getScreenSize();
        newW = dim.width / 2 - UI.getSize().width / 2;
        newH = dim.height / 2 - UI.getSize().height / 2;
        UI.setLocation(newW, newH);
    }

    private static void createWindow() {

        UI = new MainUI();
        UI.setVisible(true);
        UI.setTitle("Tone Analysis Interface");

    }

}
