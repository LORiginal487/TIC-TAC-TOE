/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tttGame;

/**
 *
 * @author User
 */
public class playerManeger {
    private String player, symbol;
    private int count;
    
    public playerManeger(String player) {
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    public void changeButtonTxt(javax.swing.JButton button){
        if(player == "player1"){
            button.setText("X");
            
            player = "player2";
        }else{
            button.setText("O");
            player = "player1";
        }
        button.setEnabled(false);
        count ++;
    }
}
