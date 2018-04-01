import entity.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Player1MoveType;
        int Player2MoveType;

        try {
            System.out.println("\nChoose game type: ");
            System.out.println("1 - Player vs Player | 2 - Player vs PC");

            int gameType = Integer.parseInt(reader.readLine());

            while (true) {
                System.out.println("Choose type of your figure: ");
                System.out.println("X | O");

                String sMoveType = reader.readLine();

                if (sMoveType.equals("X")) {
                    Player1MoveType = 1;
                    Player2MoveType = -1;
                    break;
                } else {
                    if (sMoveType.equals("O")) {
                        Player1MoveType = -1;
                        Player2MoveType = 1;
                        break;
                    }
                }
                System.out.println("\nWRONG! Try again!");

            }
            System.out.println("Enter Player1 name: ");
            String player1Name = reader.readLine();

            System.out.println("Enter Player2 name: ");
            String player2Name = reader.readLine();

//            System.out.println("Enter field size:"); //todo for future realization
//            int fieldSize = Integer.parseInt(reader.readLine());

            Game game;

            if (gameType == 1) {
                game = new Game(new Player(player1Name, Player1MoveType),
                        new Player(player2Name, Player2MoveType),
                        3);
            } else {
                game = new Game(new Player(player1Name, Player1MoveType),
                        new PlayerAi(player2Name, Player2MoveType),
                        3);
            }

            game.startGame();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
