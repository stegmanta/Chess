import java.awt.Color;

public class ChessGame{
    private Board board;
    private Color color;

    public ChessGame(){
        this.board = new Board();
    }

    //first way
    public void placeRook(int rank, int file){
        Square s = board.getSquare(rank,file);//original square
        s.setPiece("rook");

        for(int countRank = 0; countRank < 9; countRank++ ){
            for(int countFile = 0; countFile < 9; countFile++){
                Square n = board.getSquare(countRank,countFile); //looped square

                // System.out.println(n.getRank());
                // System.out.println(n.getFile());

                if(countRank == s.getRank() || countFile == s.getFile()){
                    n.toggleHighlight();
                    
                }
                
                 
                
            }           
                
        }
                      
    }
    




    public void test(){
        board.testBoard();
    }



    public static void main(String [] args){
        ChessGame gameOne = new ChessGame();
        gameOne.placeRook(3, 4);
        gameOne.test();
    }

}
