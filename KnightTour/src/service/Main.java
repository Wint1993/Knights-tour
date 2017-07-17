package service;
import static service.Chess1.solve;

/**
 * Created by Błażej on 2017-06-26.
 */
public class Main {

    public static void main(String[] args) {

        int chessSize = 6;
        int chessTab[][] = new int [chessSize][chessSize];
        for(int i=0;i<chessSize;i++){
            for(int j=0;j<chessSize;j++){
                chessTab[i][j] = -1;
            }
        }
        solve(chessTab,chessSize,0,0,0);
    }
    public static void displayChessboard(int tab[][]){

        if(tab == null){
            System.out.println("Null");
        }
        else {
            for (int i = 0; i < tab.length; i++) {
                System.out.printf("|");
                for (int j = 0; j < tab.length; j++) {

                    System.out.printf("%3d" + " |", tab[i][j]);
                }
                System.out.println("\n");
            }
        }
    }
}
