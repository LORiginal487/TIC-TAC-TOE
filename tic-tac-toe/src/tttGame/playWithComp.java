/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tttGame;

import java.util.HashMap;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class playWithComp {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;

    public playWithComp(JButton jButton1, JButton jButton2, JButton jButton3, JButton jButton4, JButton jButton5, JButton jButton6, JButton jButton7, JButton jButton8, JButton jButton9) {
        this.jButton1 = jButton1;
        this.jButton2 = jButton2;
        this.jButton3 = jButton3;
        this.jButton4 = jButton4;
        this.jButton5 = jButton5;
        this.jButton6 = jButton6;
        this.jButton7 = jButton7;
        this.jButton8 = jButton8;
        this.jButton9 = jButton9;
    }

    public JButton randomButton() {
        JButton bttn = null;
        boolean ifTrue = true;
        HashMap<String, JButton> buttons = new HashMap<>();

        buttons.put("1", jButton1);
        buttons.put("2", jButton2);
        buttons.put("3", jButton3);
        buttons.put("4", jButton4);
        buttons.put("5", jButton5);
        buttons.put("6", jButton6);
        buttons.put("7", jButton7);
        buttons.put("8", jButton8);
        buttons.put("9", jButton9);

        for (int i = 0; i < 9; i++) {
            for (int x = 0; x < 9; x++) {
                int num = (1 + (int) (Math.random() * ((9 - 1) + 1)));
                if (buttons.get(Integer.toString(num)).isEnabled()) {
                    bttn = buttons.get(Integer.toString(num));
                    break;
                }
            }
        }
        return bttn;

    }

}
