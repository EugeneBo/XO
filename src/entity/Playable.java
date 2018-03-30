package entity;

import java.io.IOException;

public interface Playable {

    Move makeMove(int x, int y, boolean moveType) throws IOException;


}
