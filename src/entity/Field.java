package entity;

public class Field {

    private int[][] arrayOfFieldCells;

    public Field(int fieldSize) {
        this.arrayOfFieldCells = new int[fieldSize][fieldSize];
    }

    public void setMoveOnBoard(Move move, int typeOfMove) { //записывает ход совершенный игроком в Field
        arrayOfFieldCells[move.getY()][move.getX()] = typeOfMove;
    }

    public boolean isGameOver() { //сканируем массив и выявляем победителя или ничью

        if (false) {
            showField();
            return true;

        } else return false;

    }

    public void showField() {  //выводит поле на экран в правильном представление
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
                        System.out.print("|X" );
                        break;
                }


            }
            System.out.println("|");
        }


    }

}
