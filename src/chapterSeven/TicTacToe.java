package chapterSeven;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] ticTacToe = {
                {'X', 'O', 'O'},
                {'X', 'X', 'X'},
                {'O', 'X', 'O'},
        };
        for(int row = 0; row < ticTacToe.length; row++){
            for(int column = 0; column < ticTacToe[row].length; column++){
                System.out.print(ticTacToe[row][column]);
            }
            System.out.println();
        }

        System.out.println(ticTacToe[1][2]);
    }

}
