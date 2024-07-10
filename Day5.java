import java.util.Arrays;

public class Day5 {
    public static void main(String[] args) {
        //find unique elements
        int []arr = {2,10,11,10,2,13,15,13,15};
        int[] nums = {10,20,30};
        int []zeroAndOnes = {0,1,0,1,0,1,1,1,0,0,0,0,0};
    //    printPairFromArrays(nums);
     //   separteZeroAndOnes(zeroAndOnes);
        shiftRightPostion(nums);
       // System.out.println(uniqueElement(arr));
    }

/*    public static int uniqueElement(int []numbers){
        int ans = 0;
       for(int i = 0 ; i< numbers.length ; i++){
           ans = ans ^ numbers[i];
       }
       return ans;
    }*/

    public static void printPairFromArrays(int[] arr){
        for(int i =0; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length; j++){
                System.out.println("("+arr[i]+","+ arr[j]+")");
            }
        }
    }

    public static void separteZeroAndOnes(int[]arr){
        int zerosCount = 0;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] == 0){
                zerosCount++;
            }
        }
        for (int i = 0 ; i<zerosCount; i++){
            arr[i] = 0;
        }
        while(zerosCount<arr.length){
            arr[zerosCount++] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void shiftRightPostion(int []arr){
        int endElement = arr[arr.length-1];
        for(int i = arr.length-1; i >0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = endElement;
        System.out.println(Arrays.toString(arr));
    }
}
