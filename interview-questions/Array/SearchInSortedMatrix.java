public class SearchInSortedMatrix {

    public static boolean searchInSortedMatrix(int matrix[][], int key) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Index is found: (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Index is not Found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        System.out.println(searchInSortedMatrix(matrix, 39));
    }

}
