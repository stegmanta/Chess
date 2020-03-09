import java.awt.Color;

public class ChessGame{
    private Board board;
    private Color color;

    public ChessGame(){
        this.board = new Board();
    }

    //first way
    public void placeRook(int rank, int file){
        Square s = board.getSquare(rank,file);

        for(int countRank = 1; countRank < 9; countRank++ ){
            for(int countFile = 1; countFile < 9; countFile++){
                if(countFile )
                s.toggleHighlight();
                s.setPiece("rook");
                s = board.getSquare(countRank,countFile);
                
                
                
            }
                
        }
    }




    public void test(){
        board.testBoard();
    }


//second way 
    // public void placeRookTwo(int rank, int file){
    //     Board rookLocation = board.getSquare(rank, file);
    //     Square square = board.getSquare(rank, file);

    //     for (int r = 1; r < squares.length; r ++){
            
    //         for(int f = 1; f < squares[f].length; f ++){
    //             if(r == rank){
    //                 square.toggleHighlight();
    //             }
    //             if(f == file){
    //                 sqaure.toggleHighlight();
    //             }
    //         }

    //     }


    // }


    public static void main(String [] args){
        ChessGame gameOne = new ChessGame();
        gameOne.placeRook(1, 3);
        gameOne.test();
    }

}
