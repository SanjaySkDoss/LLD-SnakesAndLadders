package strategy;

import model.Board;
import model.Player;

public interface GameMoveStrategy {
    void move(Board board, Player player);
}
