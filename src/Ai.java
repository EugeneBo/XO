import java.io.IOException;

public class Ai implements Playable {

    public Ai(String name) {
        this.name = name;
    }

    private String name;


    @Override
    public Move makeMove(int x, int y, boolean moveType) throws IOException {

        return new Move(x,y,moveType);
    }






}
