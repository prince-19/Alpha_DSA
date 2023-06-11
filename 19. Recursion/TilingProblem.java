/* Given a "2 x n" floor and tiles of size "2 X 1" , count the number of ways to tile the given board using the 2 x 1 tiles. (A tile can either be placed horizontally or vertically) */

public class TilingProblem {
        public static int tilingProblemSoln(int n){
            //base case
            if(n == 0 || n == 1){
                return 1;
            }
            //kaam
            //Vertical choice
            int fnm1 = tilingProblemSoln(n-1); //verticalTiles 
            
            //Horizontal choice
            int fnm2 = tilingProblemSoln(n-2); //horizontalTiles

            int totWays = fnm1 + fnm2;
            return totWays;
        }

        public static void main(String[] args) {
            System.out.println(tilingProblemSoln(4));
        }
}
