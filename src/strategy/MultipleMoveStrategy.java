package strategy;

import model.Board;
import model.Player;
import utils.AppConstant;

public class MultipleMoveStrategy implements GameMoveStrategy {



    @Override
    public void move(Board board, Player player) {
        int val = player.makeMove(board,player);
        while(val== AppConstant.DICE_MIN || val==AppConstant.DICE_MAX){
            val = player.makeMove(board,player);
            if(player.getRemainingButtons()==0)
                return ;
        }

    }
}
