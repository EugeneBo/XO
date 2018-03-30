public class Field {

    private int fieldSize;
    private int[][] arrayOfFieldCells;

    public Field(int fieldSize) {
        this.fieldSize = fieldSize;
        this.arrayOfFieldCells = new int[fieldSize][fieldSize];

    }


    public void setMoveOnBoard(Move move) { //записывает ход совершенный игроком

    }


    public void gameOver() { //сканируем массив и выявляем победителя или ничью

    }

    public void showField() {  //выводит поле на экран в правильном представление
        for (int[] array : arrayOfFieldCells) {
            for (int i : array) {

                if (i == 0) System.out.print("|O");
                else System.out.print("|" + i);
            }
            System.out.println("|");
        }


    }

}
