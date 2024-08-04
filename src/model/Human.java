package model;

import enums.ButtonStatus;
import enums.PlayerType;
import strategy.GameMoveStrategy;

import java.util.List;
import java.util.Scanner;

public class Human extends Player {


    Scanner scanner = new Scanner(System.in);
    Dice dice;
    public Human(PlayerType type, String name, List<Button> buttons, int remainingButtons, GameMoveStrategy gameMoveStrategy) {
        super(type, name, buttons,remainingButtons);
    }



    @Override
    public int makeMove(Board board, Player player) {
        System.out.println("Press any key to roll the dice!!!");
        scanner.next();
        int val = dice.roll();
        System.out.println("Select any button id to move!!!");
        int button_id = scanner.nextInt();
        Button button = player.getButtons().get(button_id);

        int position = button.getPosition() + val;
        if (position > 100)
            return -1;
        SpecialEntity specialEntity = board.getSpecialEntityMap().get(position);
        if (specialEntity != null) {
            position = specialEntity.getTo();
        }
        button.setPosition(position);
        if (position == board.getSize()) {
            player.setRemainingButtons(player.getRemainingButtons() - 1);
            button.setStatus(ButtonStatus.COMPLETED);
        }
        return val;
    }
}
