public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        
        // Time Complexity = O(n^2)
        //Space Complexity = O(1)
        // Unoptimized Code

        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         // primary diagonal
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //          // secondary diagonal
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }


        //Time Complexity = O(n)
        //Space Complexity = O(1)
        //Optimize Code

        for(int i=0; i<matrix.length; i++){
            //primary diagonal
            sum += matrix[i][i];

            //secondary diagonal  
            // size(n) == i + j  (for condition of secondary diagonal)
            // size(n) == matrix.length - 1
            // matrix.length - 1 = i + j ==>> j = matrix.length - 1 - i 
            if(i != matrix.length-1-i)
                 sum += matrix[i][matrix.length-1-i]; 
        }


        return sum;
    }
    public static void main(String[] args) {
        //  int matrix[][] = {{1, 2, 3, 4},
        //                   {5, 6, 7, 8},
        //                   {9, 10, 11, 12},
        //                   {13, 14, 15, 16}};
        
         int matrix[][] ={{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        System.out.println(diagonalSum(matrix));
    }
}
