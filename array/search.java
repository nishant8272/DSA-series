package array;
import java.util.*;

// linearSearch

// public class search {
//      public static int linearSearch(int array[], int key) {
//           for (int i = 0; i < array.length; i++) {
//                if (array[i] == key) {
//                     return i;
//                }
//           }
//           return -1;
//      }
//      public static void main(String[] args) {
//           int numbers[] = { 2, 344, 566, 78, 8, 99, 345, 7654, 23 };
//           int key = 3;
//           int result = linearSearch(numbers, key);

//           if (result < 0) {
//                System.out.println(key + " is not found in array : " + Arrays.toString(numbers));
//           } else {
//                System.out.println(key + " is found at " + result + " index in array : " + Arrays.toString(numbers));
//           }
//      }
// }

// Binary search

// public class search {

//      public static int BinarySearch(int numbers[], int key) {
//           int start = 0;
//           int end = numbers.length - 1;
//           while (start <= end) {
//                int mid = (int) ((start + end) / 2);
//                if (numbers[mid] == key) {
//                     return mid;
//                } else if (numbers[mid] > key) {
//                     end = mid - 1;
//                } else {
//                     start = mid + 1;
//                }
//           }
//           return -1;
//      }

//      public static void main(String[] args) {
//           int numbers[] = { 1, 12, 23, 45, 67, 77, 78, 88, 98, 100, 122, 133, 445, 667, 672 };
//           int key = 7;
//           int result = BinarySearch(numbers, key);
//           if (result < 0) {
//                System.out.println(key + " is not found in array : " + Arrays.toString(numbers));
//           } else {
//                System.out.println(key + " is found at " + result + " index in array : " + Arrays.toString(numbers));
//           }
//      }
// }

//reverse array 

// public class search {
//    public static void Reverse(int numbers[]){
//      int start =0;
//      int end =numbers.length-1;
//      while(start<end){
//           int temp = numbers[start];
//           numbers[start]= numbers[end];
//           numbers[end] =temp;
//           start++;
//           end--;    
//      }
//    }
//      public static void main(String[] args) {
//             int numbers[] = { 1, 12, 23, 45, 67, 77, 78, 88, 98, 100, 122, 133, 445, 667, 672 };
//             Reverse(numbers);
//             System.out.println("reverse array : " + Arrays.toString(numbers));
//      }
// } 

// pairs in array 

// public class search {
//     public static void Pairs(int numbers[]){
//      int pairs =0;
//      for (int i = 0; i < numbers.length; i++) {
//        for (int j = i+1; j < numbers.length; j++) {
//           System.err.println("(" +numbers[i]+","+numbers[j]+")");
//           pairs++;
//        }          
//      }
//      System.out.println("total pairs : "+ pairs);
//     }
//      public static void main(String[] args) {
//            int numbers[] = { 1, 12, 23, 45, 67, 77, 78, 88, 98, 100};
//            Pairs(numbers);
//      }
// }

// max subarray sum 


// public class search {
//      public static void PairSub(int numbers[]) {
//           int currentSum = 0;
//           int maxSum = Integer.MIN_VALUE;
//           for (int i = 0; i < numbers.length; i++) {
//                int start = i;
//                for (int j = i; j < numbers.length; j++) {
//                     int end = j;
//                     currentSum = 0;
//                     for (int j2 = start; j2 <= end; j2++) {
//                          currentSum += numbers[j2];
//                     }
//                     System.out.println(currentSum);
//                     if (currentSum > maxSum) {
//                          maxSum = currentSum;
//                     }
//                }
//           }
//           System.out.println("max sum : "+maxSum);
//      }

//   // by prefix array 

//      public static void Prefixsum(int numbers[]){
//            int currentSum = 0;
//           int maxSum = Integer.MIN_VALUE;
//           int prefix[]= new int[numbers.length];
//            prefix[0]=numbers[0];
//            for (int i = 0; i < numbers.length; i++) {
//                 prefix[i]= i==0 ?prefix[0] : prefix[i-1]+numbers[i];
//            }
//           for (int i = 0; i < numbers.length; i++) {
//                int start = i;
//                for (int j = i; j < numbers.length; j++) {
//                     int end = j;
//                     currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
//                     if (currentSum > maxSum) {
//                          maxSum = currentSum;
//                     }
//                }
//           }
//           System.out.println("max sum : "+maxSum);
//      }


// kadane algorithm
 
 
//      public static void kadane(int numbers[]){
//        int ms = Integer.MIN_VALUE;
//        int cs = 0;
//         for (int i = 0; i < numbers.length; i++) {
//           cs = cs +numbers[i];
//           if(cs <0){
//                cs =0;
//           }
//           ms = Math.max(cs, ms);
//         }
//         System.out.println("max sum : "+ ms);
//      }
//      public static void main(String[] args) {
//      int numbers[] = { 1, 12, 23, 45, 67, 77, 78 };
//      PairSub(numbers);
//      Prefixsum(numbers);      
//      kadane(numbers);
//      }
// }


// trapping Rainwater 


