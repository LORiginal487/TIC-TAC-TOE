/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tttGame;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class PlayAgain {
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private String player;

    public PlayAgain(JButton jButton1, JButton jButton2, JButton jButton3, JButton jButton4, JButton jButton5, JButton jButton6, JButton jButton7, JButton jButton8, JButton jButton9, JLabel jLabel2, String player) {
        this.jButton1 = jButton1;
        this.jButton2 = jButton2;
        this.jButton3 = jButton3;
        this.jButton4 = jButton4;
        this.jButton5 = jButton5;
        this.jButton6 = jButton6;
        this.jButton7 = jButton7;
        this.jButton8 = jButton8;
        this.jButton9 = jButton9;
        this.jLabel2 = jLabel2;
        this.player = player;
    }
    
    public void restartGame(){
        jButton1.setEnabled(true);
        jButton1.setText("-");
        jButton2.setEnabled(true);
        jButton2.setText("-");
        jButton3.setEnabled(true);
        jButton3.setText("-");
        jButton4.setEnabled(true);
        jButton4.setText("-");
        jButton5.setEnabled(true);
        jButton5.setText("-");
        jButton6.setEnabled(true);
        jButton6.setText("-");
        jButton7.setEnabled(true);
        jButton7.setText("-");
        jButton8.setEnabled(true);
        jButton8.setText("-");
        jButton9.setEnabled(true);
        jButton9.setText("-");
        
        jLabel2.setText("PLAYER 1 START");
        player = "player1";
                
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
    public void setCounts(int count1, int count2){
        
    }
}
