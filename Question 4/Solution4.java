import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of prisoners: ");
        int n=sc.nextInt();
        System.out.println("Enter number of sweets: ");
        int s= sc.nextInt();
        System.out.println("Enter the starting point: ");
        int startPoint= sc.nextInt();
        int remainder=s%n;
        int warnPrisoner=(startPoint+remainder-1)%n;
        if (warnPrisoner==0){
            warnPrisoner=n;
            System.out.println(warnPrisoner);
        }
        else {
            System.out.println(warnPrisoner);
        }
    }
}
