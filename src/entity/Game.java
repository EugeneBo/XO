package entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private Playable player1;
    private Playable player2;
    private Field field;

    public Game(Playable player1, Playable player2, int fieldSize) {
        this.field = new Field(fieldSize);
        this.player1 = player1;
        this.player2 = player2;
    }


    public void startGame() throws IOException {
        field.showField();
        final Playable winner;

        while (true) {

            move(player1);

            if (field.isGameOver()) {
                winner = player1;
                break;
            }

            move(player2);

            if (field.isGameOver()) {
                winner = player2;
                break;
            }

        }

        System.out.println("Congratulations, " + winner.getName() + "! You`re win!");

    }

    private void move(Playable player) throws IOException {
        field.setMoveOnBoard(player.makeMove(), player.getMoveType());
        field.showField();

    }


}
