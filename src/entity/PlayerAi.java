package entity;

import java.io.IOException;

public class PlayerAi implements Playable {

    private String name;
    private int moveType;


    public PlayerAi(String name, int moveType) {
        this.name = name;
        this.moveType = moveType;
    }


    @Override
    public Move makeMove() throws IOException {
        return null;
    }

    @Override
    public int getMoveType() {
        return 0;
    }


}
