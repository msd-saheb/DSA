import java.util.Arrays;

public class Day4 {
    public static void main(String[] args) {

        int arr[] = {-11,200,10,17,19};
        printExtreme(arr);
/*
        countZeroAndOnes(arr);
*/
        //System.out.println(searchWithLinearSearch(arr,20 ));
        /*System.out.println(arr[2]);*/
       /* for(int n : arr){
            System.out.println(n);
        }*/
/*        System.out.println("Enter the Array Size");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int number[] = new int[arraySize];
        for(int i = 0 ; i<arraySize; i++){
            System.out.println("Enter the array value");
            int element = scanner.nextInt();
            number[i] = element;
        }
        System.out.println(Arrays.stream(number).sum());*/
    }

/*    public static boolean searchWithLinearSearch(int []numbers, int target){
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i] == target){
                return true;
            }
        }
        return false;
    }*/

public static void countZeroAndOnes(int [] nos){
    int countOnce= 0, countZer = 0;
    for(int n : nos){
        if(n == 0){
            countZer++;
        }
        else if(n == 1){
            countOnce++;
        }
    }
    System.out.println(countZer +"  "+ countOnce);
}

/*public static int findMinimum(int[]nos){
    int min = Integer.MAX_VALUE;
    for (int i = 0 ; i< nos.length; i++){
        if(nos[i] < min){
            min = nos[i];
        }
    }
    return min;
}*/

    public static void reverseArray(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            swapArray(arr, left, right);
            ++left;
            --right;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printExtreme(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            if(left == right){
                System.out.println(arr[left]);
            } else {
                System.out.println(arr[left]);
                System.out.println(arr[right]);
            }
            ++left;
            --right;
        }
    }

    private static void swapArray(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
