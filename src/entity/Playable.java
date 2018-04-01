package entity;


import java.io.IOException;

public interface Playable {


    Move makeMove() throws IOException;

    int getMoveType();

    String getName();

}
