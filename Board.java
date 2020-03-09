import java.awt.Color;

public class Board{

    private Square[][] squares;

    public Board(){
        squares = new Square[8][8];

        for (int row = 0; row < squares.length; row ++){
            boolean isBlack = false;
            if(row % 2 == 0){
                isBlack = true;
            }
            for(int col = 0; col < squares[row].length; col++){
                int rank = squares.length - row;
                int file = col +1;
                Color color = Color.WHITE;
                if(isBlack) {
                    color = Color.BLACK;
                }


                squares[row][col] = new Square(rank, file,color);
                isBlack = !isBlack;
            }
        }

    }

    public void testBoard(){
        for (int row = 0; row < squares.length; row ++){
            System.out.print("\n");
            for(int col = 0; col < squares[row].length; col++){
                Color currentColor = squares[row][col].getColor();

                if(squares[row][col].isHighlighted()){
                    System.out.print("|");
                }else if(currentColor == Color.BLACK){
                    System.out.print("()");
                }else if(currentColor == Color.WHITE){
                    System.out.print("[]");
                }

            }
        }
    }

    public Square getSquare(int rank, int file){
         return squares[8 - squares.length][squares[0].length - 1];
    }


}