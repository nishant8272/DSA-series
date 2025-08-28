package basics;

import java.util.*;

//if else

// public class index2 {
//     public static void main(String []args){
//     Scanner sc = new Scanner(System.in);
//     float salary = sc.nextFloat();
//     double tax;
//     if(salary <500000){
//         tax = 0;
//     }
//     else if(salary >=500000 ||salary <=1000000 ){
//         tax= (salary)*(0.3);
//     }
//     else{
//         tax= (salary)*(0.4);
//     }
//     System.out.println("tax amount :" +tax);
//     }
// }

//pattern printing

// public class index2 {
//  public static void main(String[] args) {
//      for (int i = 0; i < 4; i++) {
//         for (int j = 0; j <=4; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//      }
//  }    
// }

// public class index2 {
//   public static void main(String[] args) {
//     for (int i = 0; i < 5; i++) {
//         for (int j = 0; j < i; j++) {
//            System.out.print("*");           
//         }
//         System.out.println();
//     }
//   }
// }

// public class index2 {
//   public static void main(String[] args) {
//     for (int i = 4; i >0; i--) {
//         for (int j = 0; j < i; j++) {
//            System.out.print("*");           
//         }
//         System.out.println();
//     }
//   }
// }

// public class index2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class index2 {
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int n= sc.nextInt();
//    for (int i = 0; i <n; i++) {
//         for (int j = 0; j <=i; j++){
//        System.out.print((char)(j+65));
//         }
//         System.out.println();
//     }
//   }
// }

// public class index2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 if (i == 1 || i == 4 || j == 1 || j == 5) {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class index2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <=5-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=i; j++) { 
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class index2 {
//     public static void main(String[] args) {
//         for (int i = 5; i >0; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//          System.out.println("");
//         }
//     }
// }

// public class index2 {

//     public static void main(String[] args) {
//         int k=1;
//         for (int i = 1; i <=5; i++) {
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(k+" ");
//                 k++;
//             }
//             System.out.println();
//         }
//     }
// }

// public class index2 {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j <=i ; j++) {
//                 if(((i+j)%2) ==0){
//                     System.out.print(1);
//                 }else{
//                     System.out.print(0);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class index2 {
//     public static void main(String[] args) {
//         int n=4;
//         //1st half
//         for (int i = 1; i <=n; i++) {
//             for (int j = 1; j <=i; j++) {
//                 if(j<=i){
//                     System.out.print("*");
//                 }
//             }
//             for (int j = 1; j <=2*(n-i); j++) {
//              System.out.print(" ");   
//             }
//             for (int j = 1; j <=i; j++) {
//                 if(j<=i){
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//         //2nd half
//         for (int i = n; i >=1; i--) {
//             for (int j = 1; j <=i; j++) {
//                 if(j<=i){
//                     System.out.print("*");
//                 }
//             }
//             for (int j = 1; j <=2*(n-i); j++) {
//              System.out.print(" ");   
//             }
//             for (int j = 1; j <=i; j++) {
//                 if(j<=i){
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }

// public class index2 {
//     public static void main(String[] args) {
//         int n=5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <=(n-i); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class index2 {
    // public static void main(String[] args) {
    //     int n = 4;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= (n - i); j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <=(2*i-1); j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //    for (int i = n; i >0; i--) {
    //      for (int j = 1; j <= (n - i); j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <=(2*i-1); j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //    }
    // }
// }

// public class index2 {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= (n - i); j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= n; j++) {
// if (j == 1 || j == n || i== 1 || i == n) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// functions

// binomial coefficient

// public class index2 {
// public static int factorial(int n) {
// int ans = 1;
// for (int i = 1; i <= n; i++) {
// ans = ans * i;
// }
// return ans;
// }
// public static void Binomial(int n, int r) {
// int x = factorial(r);
// int den = factorial(n - r);
// int res = factorial(n) / (x * den);
// System.out.println(res);
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter value of n : ");
// int n = sc.nextInt();
// System.out.println("enter value of r : ");
// int r = sc.nextInt();
// Binomial(n, r);
// }
// }

// prime number

// public class index2 {

// public static Boolean isPrime(int n) {
// if (n <= 1) {
// return false; // 0 and 1 are not prime
// }
// if (n == 2) {
// return true; // 2 is prime
// }
// if (n % 2 == 0) {
// return false; // eliminate even numbers quickly
// }

// int sqrt = (int) Math.sqrt(n);
// for (int i = 3; i <= sqrt; i += 2) { // check only odd numbers
// if (n % i == 0) {
// return false;
// }
// }
// return true;
// }

// public static void isPrimeRange(int n) {
// for (int i = 2; i <= n; i++) {
// if (isPrime(i)) {
// System.out.println("it is a prime number : " + i);
// }
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();

// if (isPrime(n)) {
// System.out.println("it is a prime number.");
// } else {
// System.out.println("it is not a prime number.");
// }

// System.out.println("Prime numbers up to " + n + " are:");
// isPrimeRange(n);

// sc.close();
// }
// }

// Binary to decimal

// public class index2 {
// public static void binaryToDecimal() {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int pow = 0;
// int dec = 0;
// while (n > 0) {
// int last = n % 10;
// dec = dec + (last * (int) (Math.pow(2, pow)));
// pow++;
// n = n / 10;
// }
// System.out.println("decimal value : " + dec);

// }

// public static void main(String[] args) {
// binaryToDecimal();
// }
// }

// decimal to binary

// public class index2{
// public static void binaryToDecimal() {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter decimal value : ");
// int n = sc.nextInt();
// int pow = 0;
// int dec = 0;
// while (n > 0) {
// int last = n % 2;
// dec = dec + (last * (int)(Math.pow(10, pow)));
// pow++;
// n = n / 2;
// }
// System.out.println("binay value : " + dec);
// }
// public static void main(String[] args) {
// binaryToDecimal();
// }
// }