/**
 * Created by asiagibson on 8/28/16.
 */
public class ProblemTwo {
    public static void main (String[] args) {
        System.out.println(calculateAge(2016,1987));
    }

        public static String calculateAge (int currentYr,int birthYr) {
            int age = currentYr - birthYr;
            int age2 = age - 1;

            String answer = " You are " + age2 + " or you are " + age + ".";
            return answer;

    }
}
