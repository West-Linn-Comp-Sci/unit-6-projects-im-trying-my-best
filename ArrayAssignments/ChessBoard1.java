
/**
 * Write a description of class Chessboard1 here.
 *
 * @author Liam Groah
 * @version 5/10/21
 */
public class ChessBoard1
 
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[] pawns = {"Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn"};
        String[] pieces = {"Rook","Knight","Bishop","Queen","King","Bishop","Knight","Rook"};
        String[] space = {"-","-","-","-","-","-","-","-"};
        String[][] chess = new String[8][8];
        chess[0] = pieces;
        chess[1] = pawns;
        chess[2] = space;
        chess[3] = space;
        chess[4] = space;
        chess[5] = space;
        chess[6] = pawns;
        chess[7] = pieces;
        //Use this method to print the chess board onto the console
        print(chess);
        
 
    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
 

