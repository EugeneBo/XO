package entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player implements Playable {

    private final String name;



    private final int moveType;
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Player(String name, int moveType) {
        this.name = name;
        this.moveType = moveType;
    }


    public int getMoveType() {
        return moveType;
    }

    public String getName() {
        return name;
    }


    @Override
    public Move makeMove() throws IOException {

        System.out.println(name +", make your move: ");

        System.out.print("X-axes: ");
        int x = Integer.parseInt(reader.readLine());

        System.out.print("Y-axes: ");
        int y = Integer.parseInt(reader.readLine());

        return new Move(x,y,moveType);
    }
}
