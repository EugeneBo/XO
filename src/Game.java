import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private Playable player1;
    private Playable player2;

    private Field field;

    public Game(Playable player1, Playable player2, int fieldSize) {
        this.field = new Field(fieldSize);
        this.player1 = player1;
        this.player2 = player2;
    }


    public void startGame() {
        game();
    }


    public void game() {

       field.showField();

/
    }




}
