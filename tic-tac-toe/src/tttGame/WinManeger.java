/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tttGame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author User
 */
public class WinManeger {

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
    private javax.swing.JLabel p1count;
    private javax.swing.JLabel p2count;
    private javax.swing.JLabel compCount;
    private String player;

    public WinManeger(JButton jButton1, JButton jButton2, JButton jButton3, JButton jButton4, JButton jButton5, JButton jButton6, JButton jButton7, JButton jButton8, JButton jButton9, JLabel jLabel2, String player, JLabel p1count, JLabel p2count, JLabel compCount) {
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
        this.p1count = p1count;
        this.p2count = p2count;
        this.compCount = compCount;
        this.player = player;

    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(JButton jButton6) {
        this.jButton6 = jButton6;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
    }

    public JButton getjButton8() {
        return jButton8;
    }

    public void setjButton8(JButton jButton8) {
        this.jButton8 = jButton8;
    }

    public JButton getjButton9() {
        return jButton9;
    }

    public void setjButton9(JButton jButton9) {
        this.jButton9 = jButton9;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void checkForWins(int countP1w, int countP2w, int countCw, String rdBttn) {
        String btn1txt = jButton1.getText();
        String btn2txt = jButton2.getText();
        String btn3txt = jButton3.getText();
        String btn4txt = jButton4.getText();
        String btn5txt = jButton5.getText();
        String btn6txt = jButton6.getText();
        String btn7txt = jButton7.getText();
        String btn8txt = jButton8.getText();
        String btn9txt = jButton9.getText();

        if (btn1txt == btn2txt && btn1txt == btn3txt && btn1txt != "-") {
            checkInCheck(countP1w, countP2w, countCw, rdBttn);
        } else if (btn1txt == btn4txt && btn1txt == btn7txt && btn1txt != "-") {
            checkInCheck(countP1w, countP2w, countCw, rdBttn);
        } else if (btn1txt == btn5txt && btn1txt == btn9txt && btn1txt != "-") {
            checkInCheck(countP1w, countP2w, countCw, rdBttn);
        } else if (btn4txt == btn5txt && btn4txt == btn6txt && btn4txt != "-") {
            checkInCheck(countP1w, countP2w, countCw, rdBttn);
        } else if (btn7txt == btn8txt && btn7txt == btn9txt && btn7txt != "-") {
            checkInCheck(countP1w, countP2w, countCw, rdBttn);
        } else if (btn2txt == btn5txt && btn2txt == btn8txt && btn2txt != "-") {
            checkInCheck(countP1w, countP2w, countCw, rdBttn);
        } else if (btn3txt == btn6txt && btn3txt == btn9txt && btn3txt != "-") {
            checkInCheck(countP1w, countP2w, countCw, rdBttn);
        } else {
            boolean bool;
            bool = ifDisabled();
            if(bool == false){
            if (player == "player1") {
                jLabel2.setText("PLAYER 1 's turn");
                p1count.setText(Integer.toString(countP1w));
                if (rdBttn == "selected") {
                    compCount.setText(Integer.toString(countCw));
                } else {
                    p2count.setText(Integer.toString(countP2w));
                }
            } else {
                jLabel2.setText("PLAYER 2 's turn");
                p1count.setText(Integer.toString(countP1w));
                if (rdBttn == "selected") {
                    compCount.setText(Integer.toString(countCw));
                } else {

                    p2count.setText(Integer.toString(countP2w));
                }
            }
            }
            else{
                jLabel2.setText("DRAW!!!");
            }
        }
    }

    public void checkInCheck(int countP1w, int countP2w, int countCw, String rdBttn) {
        if (player == "player1") {
            if (rdBttn == "selected") {
                countCw++;

                jLabel2.setText("Computer WON");
                compCount.setText(Integer.toString(countCw));
            } else {
                countP2w++;

                jLabel2.setText("PLAYER 2 WON");
                p2count.setText(Integer.toString(countP2w));
            }
        } else {
            jLabel2.setText("PLAYER 1 WON");
            countP1w++;

            p1count.setText(Integer.toString(countP1w));

        }
        disableBttns();
    }

    public void disableBttns() {
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }

    public boolean ifDisabled() {
        boolean bool = true;
        if (jButton1.isEnabled()) {
            bool = false;
        }
        else if (jButton2.isEnabled()) {
            bool = false;
        }
        else if (jButton3.isEnabled()) {
            bool = false;
        }
        else if (jButton4.isEnabled()) {
            bool = false;
        }
        else if (jButton5.isEnabled()) {
            bool = false;
        }
        else if (jButton6.isEnabled()) {
            bool = false;
        }
        else if (jButton7.isEnabled()) {
            bool = false;
        }
        else if (jButton8.isEnabled()) {
            bool = false;
        }
        else if (jButton9.isEnabled()) {
            bool = false;
        }else{
            bool = true;
        }

        return bool;
    }

}
