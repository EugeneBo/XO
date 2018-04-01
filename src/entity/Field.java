package entity;

public class Field {

    private int[][] arrayOfFieldCells;

    public Field(int fieldSize) {
        this.arrayOfFieldCells = new int[fieldSize][fieldSize];
    }

    public void setMoveOnBoard(Move move) {
        arrayOfFieldCells[move.getY()][move.getX()] = move.getMoveType();
    }

    public boolean isWon(Move move) {

            if (
                   arrayOfFieldCells[move.getY()][0] == move.getMoveType()   // 3 in the X-axes
                && arrayOfFieldCells[move.getY()][1] == move.getMoveType()
                && arrayOfFieldCells[move.getY()][2] == move.getMoveType()

                || arrayOfFieldCells[0][move.getX()] == move.getMoveType()   // 3 in the Y-axes
                && arrayOfFieldCells[1][move.getX()] == move.getMoveType()
                && arrayOfFieldCells[2][move.getX()] == move.getMoveType()

                || move.getY() == move.getX()                                // 3 in the diagonal
                && arrayOfFieldCells[0][0] == move.getMoveType()
                && arrayOfFieldCells[1][1] == move.getMoveType()
                && arrayOfFieldCells[2][2] == move.getMoveType()

                || move.getY() + move.getX() == 2                            // 3 in the opposite diagonal
                && arrayOfFieldCells[0][2] == move.getMoveType()
                && arrayOfFieldCells[1][1] == move.getMoveType()
                && arrayOfFieldCells[2][0] == move.getMoveType()
                    ) return true;
                      else return false;
    }

/*    public boolean isDraw() { //todo maybe useful in future

        for (int[] array : arrayOfFieldCells) {
            for (int i : array) {
                if (i == 0) return false;
                break;
            }
        }
        return true;
    }
*/


    public void showField() {
        System.out.print(" ");
        for (int i = 0; i < arrayOfFieldCells.length; i++) {
            System.out.print("|" + i);
        }
        System.out.println("|");
        int x = 0;
        for (int[] array : arrayOfFieldCells) {

            System.out.print(x);
            x++;
            for (int i : array) {

                switch (i) {
                    case -1:
                        System.out.print("|O");
                        break;
                    case 0:
                        System.out.print("| ");
                        break;
                    case 1:
                        System.out.print("|X");
                        break;
                }
            }
            System.out.println("|");
        }


    }

}
