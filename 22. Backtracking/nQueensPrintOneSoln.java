

    /* We are just putting "n queens" in "n rows" , in a position which will prevent them to attack each other  */
    /* Here we are checking if soln is possible and printing only one solutions */

public class nQueensPrintOneSoln {
    //to check whether it is safe to place a queen on a particular position or not
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up 
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    //to place the "n queens" in "n rows" for every permutation
    // 1st modification "boolean"
    public static boolean nQueens(char board[][], int row){
        //base
        if(row == board.length){
           // printBoard(board);
            //2nd modifications
            return true;
        }

        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                //3rd modification
                if(nQueens(board, row+1)){
                    return true;
                } 
                board[row][j] = 'X'; //backtracking step
            }
           
        }

        //4th modification
        return false;
    }  

    public static void printBoard(char board[][]){
        System.out.println("---------- Chess Board ----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    //static int count = 0; 
    /*  we can use to count total number of possibilities
    write the above code  in place of print() function */
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        //initalize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }

        //5th modifications

        if(nQueens(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is NOT possible");
        }


    }
}


