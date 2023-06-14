/* We are just doing the permutation of putting "n queens" in "n rows" , currently we are not taking the attckint part  */

public class NqueensInNrows {
    
    //to place the "n queens" in "n rows" for every permutation
    public static void nQueens(char board[][], int row){
        //base
        if(row == board.length){
            printBoard(board);
            return;
        }

        //column loop
        for(int j=0; j<board.length; j++){
            board[row][j] = 'Q';
            nQueens(board, row+1); //function call
            board[row][j] = 'X'; //backtracking step
        }
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
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        //initalize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
    }
}
