

public class CountEvenOdd {


    public static void countEvenOdd(int number[]){
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i<number.length; i++){
            if(number[i] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Total even number :"+evenCount);
        System.out.println("Total odd number :"+oddCount);
    }
    public static void main(String args[]){
        int number[] = {1,2,3,4,5,6,7};
        countEvenOdd(number);

    }
    
}
