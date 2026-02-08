import java.util.*;

public class Creation {
    // search in 2D array
    public static boolean search(int arr[][], int key){
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    System.out.print("Index is found ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }
    // Creation of 2D array
    public static void main(String args[]) {
        int arr[][] = new int[3][3];
        int m = 3;
        int n = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search(arr, 5);
    }

}
