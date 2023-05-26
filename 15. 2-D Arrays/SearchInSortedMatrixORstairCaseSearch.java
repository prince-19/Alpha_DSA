
public class SearchInSortedMatrixORstairCaseSearch {

    // Unoptimized search
    public static boolean search (int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.print("Key is found at cell (" + i + "," + j + ")" );
                    return true;
                }
            }
        }
        return false;
    }

    // Optimised Search 
    // Time Complexity = O(m+n)
    private static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] ={{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};

        search(matrix, 6);
        System.out.println();
        staircaseSearch(matrix, 6);
    }
}
