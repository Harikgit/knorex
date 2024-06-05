import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        int reversedNum=0;
        while (num!=0){
            int singleDigit=num%10;
            reversedNum=reversedNum*10+singleDigit;
            num/=10;
        }
        System.out.println("Reversed number: "+reversedNum);
    }
}
