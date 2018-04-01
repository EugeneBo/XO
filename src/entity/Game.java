package entity;

import java.io.IOException;

public class Game {

    private Playable player1;
    private Playable player2;
    private Field field;

    public Game(Playable player1, Playable player2, int fieldSize) {
        this.field = new Field(fieldSize);
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() throws IOException { //todo handle IOException
        final Playable winner;
        Move player1Move;
        Move player2Move;
        int movesCounter = 0;

        field.showField();

        while (true) {  //todo убрать повторяющийся код
            player1Move = player1.makeMove();
            field.setMoveOnBoard(player1Move);
            field.showField();
            movesCounter++;
            if (field.isWon(player1Move)) {
                winner = player1;
                System.out.println("\nCongratulations, " + winner.getName() + "! You`re win!");
                break;
            } else if (movesCounter == 9) {
                System.out.println("DRAW!!!");
                break;
            }


            player2Move = player2.makeMove();
            field.setMoveOnBoard(player2Move);
            field.showField();
            movesCounter++;
            if (field.isWon(player2Move)) {
                winner = player2;
                System.out.println("\nCongratulations, " + winner.getName() + "! You`re win!");
                break;
            }

        }
    }

}
