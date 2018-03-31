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
while (true) {
    field.setMoveOnBoard(player1.makeMove(), player1.getMoveType());
    field.isGameOver();
    field.showField();

    field.setMoveOnBoard(player2.makeMove(), player2.getMoveType());
    field.isGameOver();
    field.showField();
}
    }






}
