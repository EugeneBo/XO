import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player implements Playable {

private String name;
private boolean moveType;


    public Player(String name, boolean moveType) {
        this.name = name;
        this.moveType=moveType;
    }

    @Override
    public Move makeMove(int x, int y, boolean moveType) throws IOException {




        return new Move(x,y,moveType);
    }



}
