package strategy;

import enums.ButtonStatus;
import model.*;

import java.util.Scanner;

public class SingleMoveStrategy implements GameMoveStrategy {



    @Override
    public void move(Board board, Player player) {

        player.makeMove(board,player);
    }
}
