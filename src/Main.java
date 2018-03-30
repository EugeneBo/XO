import entity.Ai;
import entity.Game;
import entity.Playable;
import entity.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("\nChoose game type: ");
            System.out.println("1 - entity.Player vs entity.Player | 2 - entity.Player vs PC");

            int gameType = Integer.parseInt(reader.readLine());

            System.out.println("\nChoose your figure: ");
            System.out.println("1 - X | 2 - O");

            int moveType = Integer.parseInt(reader.readLine());

            System.out.println("Enter Player1 name: ");
            String player1Name = reader.readLine();
            Playable player1 = new Player(player1Name);

            System.out.println("Enter Player2 name: ");
            String player2Name = reader.readLine();

            System.out.println("Enter field size:");
            int fieldSize = Integer.parseInt(reader.readLine());


            Game game;

            if (gameType == 1) {
                game = new Game(new Player(player1Name), new Player(player2Name), fieldSize);
            } else {
                game = new Game(new Player(player1Name), new Ai(player2Name), fieldSize);
            }

            game.startGame();


        } catch (IOException e) {
            e.printStackTrace();
        }

//Tratata

    }
}
