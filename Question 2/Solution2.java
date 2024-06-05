import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter value of b: ");
        int b=sc.nextInt();
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        int sum=0;
        int multi=0;
        if (a>=0&&a<=50&&b>=0&&b<=50&&n>=1&&n<=15){
            for (int i=0;i<n;i++){
                multi+= (int) (Math.pow(2, i)*b);
                sum=a+multi;
                System.out.print(sum+" ");
            }
        }
    }
}
