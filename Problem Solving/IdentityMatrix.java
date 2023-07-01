// What do you mean by identity matrix?
// An identity matrix is a square matrix in which all the elements of principal diagonals are one, and all other elements are zeros.

public class IdentityMatrix {
    public static void main(String[] args) {
        // [rows][cols] // Array’s row size is mandatory but column size is not.
        int[][] matrix = new int[][] {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1},
        };

        boolean flag = true;
        
        // check identity
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(i == j && matrix[i][j] != 1) {
                    flag = false;
                    break;
                }
                if(i != j && matrix[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
        }

        if(flag) {
            System.out.println("It is an identity matrix");
        }
        else {
            System.out.println("It is not an identity matrix");
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
