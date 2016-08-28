package nyc;

/**
 * Created by asiagibson on 8/28/16.
 */
public class ProblemFive {
    public static void main(String[] args){
       System.out.println(chessBoard(2));
        System.out.println();
    }
    public static String chessBoard(int size){

        String board = "";

        for(int j = 0; j < size; j++) {

            if(j % 2 ==0){
                board += " ";
            }

            for (int i = 0; i < size; i++) {
                if (i % 2 == 0) {
                    board += "#";
                } else {
                    board += " ";
                }
            }
            board +="\n";
        }
        return board;
    }
}

