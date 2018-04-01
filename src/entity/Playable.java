package entity;


import java.io.IOException;

public interface Playable {

    Move makeMove() throws IOException;

    String getName();
}
