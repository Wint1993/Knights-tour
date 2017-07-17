package service;

import util.Move;

import static service.Main.displayChessboard;

/**
 * Created by Błażej on 2017-06-26.
 */
public class Chess1 {

    public static int[][] solve(int [][]tab,int max,int moveNumber, int xstart, int ystart) {

        int tab1[][] = tab;
        tab1[xstart][ystart] = moveNumber;
        if (moveNumber == ((max * max) - 1)) {
            displayChessboard(tab1);
           return tab1;
        } else {
            for (Move move : Move.values()){
                if ((xstart + move.getxPosition()) >= 0 && (xstart + move.getxPosition()) < max && (ystart + move.getyPosition()) >= 0 && (ystart + move.getyPosition()) < max)  {
                    if (tab1[xstart + move.getxPosition()][ystart + move.getyPosition()] == -1) {
                        solve(tab1,max,moveNumber + 1, (xstart + move.getxPosition()), (ystart + move.getyPosition()));
                    }
                }
            }
            tab1[xstart][ystart] = -1;
        }
        return null;
    }
}



