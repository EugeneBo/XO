package entity;

public class Move {

    private int x;
    private int y;
    private int moveType;


    public Move(int x, int y, int moveType) {
        this.x = x;
        this.y = y;
        this.moveType = moveType;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMoveType() {
        return moveType;
    }

    public void setMoveType(int moveType) {
        this.moveType = moveType;
    }
}
