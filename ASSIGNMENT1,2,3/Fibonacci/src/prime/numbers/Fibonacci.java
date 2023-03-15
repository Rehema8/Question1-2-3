package prime.numbers;

public class Fibonacci {
   public static int sumEvenFibonacci(int limit){
       int sum = 0;
       int first = 1;
       int second = 2;
       while (second <= limit){
           if (second % 2 == 0){
               sum += second;
           }
           int temp = first + second;
           first = second;
           second = temp;
       }
       return sum;
   }
   public static void main(String[]args){
       int sum = sumEvenFibonacci(4000000);
       System.out.println(sum);
   }
}
    

