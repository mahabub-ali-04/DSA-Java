package Arrays;

public class Largest {
    public static int largestInArrays(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest= arr[i];
            }

        }
        System.out.println("smallest element is:"+smallest);
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {2,4,8,9,3,5,1,12,16,7};
        System.out.println("largest element is:"+largestInArrays(arr));
    }
    
}
