public class GameBoard {
    private char[][] board;
    private final int size = 3;
    private final char emptySquare = '\u25A1';

    public GameBoard() {
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = emptySquare;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

        public void placeCharacter(Object character, int x, int y) {
        if (character instanceof Human) {
            board[x][y] = 'H';
        } else if (character instanceof Goblin) {
            board[x][y] = 'G';
        }
    }
}