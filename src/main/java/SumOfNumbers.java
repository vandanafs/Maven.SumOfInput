import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        SumOfNumbers nums= new SumOfNumbers();
        System.out.println(nums.getSumOfNums());

    }

    int getSumOfNums() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = scan.nextInt();
        int sum=0;
       for(int i=0; i<=num; i++){
           sum+=i;
       }
       return sum;
    }
}