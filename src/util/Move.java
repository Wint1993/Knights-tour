package util;

/**
 * Created by Błażej on 2017-06-25.
 */

public enum Move {

    ONE(1,2),TWO(1,-2),THREE(-1,2),FOUR(-1,-2),FIVE(2,1),SIX(2,-1),SEVEN(-2,1),EIGHT(-2,-1);

    public int xPosition;
    public int yPosition;

    Move(int x,int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public int getxPosition(){
      return xPosition;
    }
    public int getyPosition(){
        return yPosition;
    }
   }
