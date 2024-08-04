package model;

import java.util.List;

import enums.GameStatus;
import strategy.GameMoveStrategy;
import strategy.StartingStrategy;

public class Game {

    private Board board;
    private List<Player> players;
    private Dice dice;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public List<Player> getLeaderBoard() {
        return leaderBoard;
    }

    public void setLeaderBoard(List<Player> leaderBoard) {
        this.leaderBoard = leaderBoard;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getLastPlayerIndex() {
        return lastPlayerIndex;
    }

    public void setLastPlayerIndex(int lastPlayerIndex) {
        this.lastPlayerIndex = lastPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public StartingStrategy getStartingStrategy() {
        return startingStrategy;
    }

    public void setStartingStrategy(StartingStrategy startingStrategy) {
        this.startingStrategy = startingStrategy;
    }

    public GameMoveStrategy getGamemoveStrategy() {
        return gamemoveStrategy;
    }

    public void setGamemoveStrategy(GameMoveStrategy gamemoveStrategy) {
        this.gamemoveStrategy = gamemoveStrategy;
    }

    private List<Player> leaderBoard;
    private GameStatus gameStatus;
    private int maxPlayers;
    private int lastPlayerIndex;
    private Player winner;

    public int getRemainingPlayers() {
        return remainingPlayers;
    }

    public void setRemainingPlayers(int remainingPlayers) {
        this.remainingPlayers = remainingPlayers;
    }

    private int remainingPlayers;
    StartingStrategy startingStrategy;
    GameMoveStrategy gamemoveStrategy;


    public void move() {
        while (this.getGameStatus() == GameStatus.IN_PROGRESS) {
            lastPlayerIndex = (lastPlayerIndex + 1) % maxPlayers;
            Player player = players.get(lastPlayerIndex);
            if (player.getRemainingButtons() > 0) {
                gamemoveStrategy.move(board, player);
                if (player.getRemainingButtons() == 0) {
                    leaderBoard.add(player);
                    remainingPlayers--;
                }
                if (remainingPlayers == 1) {
                    gameStatus = GameStatus.ENDED;
                    winner = leaderBoard.get(0);
                    for (Player player1 : players) {
                        if (player1.getRemainingButtons() > 0) {
                            leaderBoard.add(player);
                            break;
                        }
                    }
                }
            }

        }
    }


}
