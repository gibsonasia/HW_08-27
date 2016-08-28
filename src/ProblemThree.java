/**
 * Created by asiagibson on 8/28/16.
 */
//X's O's

public class ProblemThree {
    public static void main(String[] args){
        System.out.println(sameXO("oooooxxxxx"));
    }
    public static boolean sameXO(String xo){
        int totalx = 0;
        int totalO =0;

        for (int i = 0; i < xo.length(); i++) {

            if (Character.toLowerCase(xo.charAt(i)) == 'x') {
                totalx++;

            }

            if (Character.toLowerCase(xo.charAt(i)) == 'o') {
                totalO++;
            }

        }
        return totalO == totalx;
    }
}
