package model;

import enums.PlayerType;

import java.util.List;

public abstract class Player {
    private PlayerType type;
    private String name;
    private List<Button> buttons;



    public int getRemainingButtons() {
        return remainingButtons;
    }

    public void setRemainingButtons(int remainingButtons) {
        this.remainingButtons = remainingButtons;
    }

    private int remainingButtons;

    public Player(PlayerType type,String name,List<Button> buttons,int remainingButtons){
        this.type = type;
        this.name = name;
        this.buttons = buttons;
        this.remainingButtons = remainingButtons;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    public abstract int makeMove(Board board, Player player);

}
